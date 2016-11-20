package com.example.lenovopc.spicynsizzling;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Address extends AppCompatActivity {

    JSONParser jsonParser = new JSONParser();

    private ProgressDialog pDialog;
    private static String url_insert_menu ="http://spicynsiizzling.comli.com/insert_menu.php";
    private static final String TAG_SUCCESS = "Success";

    EditText et1,et2,et3;
    Button button;
    TextView tv1,tv2;
    String addr,name,result,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.address1);

        final SmsManager smsManager = SmsManager.getDefault();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Intent i2=getIntent();
        Bundle b2=i2.getBundleExtra("order");
        String res=b2.getString("res");
        String tot=b2.getString("tot");

        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText6);
        et3=(EditText)findViewById(R.id.editText5);
        tv1=(TextView)findViewById(R.id.textView8);
        tv2=(TextView)findViewById(R.id.textView9);
        button=(Button)findViewById(R.id.button10);

        final String phoneNo = "9467587898";
        tv1.setText(tot);
        tv1.setTextSize(32);
        name =et1.getText().toString();
        addr =et2.getText().toString();
        result=res+ tot;

        //final NotificationManager notif=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        //final Notification notify=new Notification(R.drawable.images,"Spicy N Sizzling",System.currentTimeMillis());
        //final PendingIntent pending= PendingIntent.getActivity(getApplicationContext(), 0, new Intent(), 0);

        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Sure to place your Order?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        name =et1.getText().toString();
                        addr =et2.getText().toString();
                        phone=et3.getText().toString();
                       new insertMenu(name,addr,phone).execute();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });


        final AlertDialog.Builder builder1 = new AlertDialog.Builder(this);
        builder1.setMessage("Not Connected to Internet.Proceed to message?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        name =et1.getText().toString();
                        addr =et2.getText().toString();
                        final String message = "Name:"+ name + " Add:" + addr + " Res:" + result;
                        Log.d("Create Response", "" + message);
                        smsManager.sendTextMessage(phoneNo, null, message, null, null);
                        tv2.setText("Hi " + et1.getText().toString() + ", your order has been placed.");
                        //notify.setLatestEventInfo(getApplicationContext(),"Alert","Your Order has been placed.",pending);
                        //notif.notify(0, notify);
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        final AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
        builder2.setMessage("Fill all the paticulars.")
                .setCancelable(false)
                .setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isConnected()){
                    if(isEmpty(et1) || isEmpty(et2) || isEmpty(et3)){
                        AlertDialog alert = builder2.create();
                        alert.setTitle("Alert");
                        alert.show();
                    }
                    else{
                        AlertDialog alert = builder.create();
                        alert.setTitle("Confirming Order");
                        alert.show();
                        //notify.setLatestEventInfo(getApplicationContext(), "Alert", "Your Order has been placed.", pending);
                        //notif.notify(0, notify);
                    }

                }
                else{
                    if(isEmpty(et1) || isEmpty(et2) || isEmpty(et3)){
                        AlertDialog alert = builder2.create();
                        alert.setTitle("Alert");
                        alert.show();
                    }
                    else {
                        AlertDialog alert1 = builder1.create();
                        alert1.setTitle("Message:");
                        alert1.show();
                    }
                }


            }
        });
    }//onCreate closing


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();
        if(id ==  android.R.id.home){
            this.finish();
            return true;
        }
        if(id == R.id.action_settings){
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_address, menu);
        return true;
    }

    class insertMenu extends AsyncTask<String, String, String> {

        String customer;
        String address,phone1;

        insertMenu(String name,String addr,String phone){
            customer = name;
            address=addr;
            phone1=phone;
        }

        //Cart c=new Cart();
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(Address.this);
            pDialog.setMessage("Ordering ...");
            pDialog.setIndeterminate(false);
            pDialog.setCancelable(true);
            pDialog.show();
        }

        protected String doInBackground(String... args) {
            Log.d("Create Response", "" + name + "  " + result + "  " + addr + "  " + phone1);
            List<NameValuePair> params = new ArrayList<NameValuePair>();
            params.add(new BasicNameValuePair("name",customer));
            params.add(new BasicNameValuePair("result", result));
            params.add(new BasicNameValuePair("addr", address));
            params.add(new BasicNameValuePair("phone",phone1));

            Log.d("create Response", "" + params);

            JSONObject json =jsonParser.makeHttpRequest(url_insert_menu,
                    "POST", params);

            Log.d("Create Response", json.toString());

            try {
                int success = json.getInt(TAG_SUCCESS);

                if (success == 1) {
                    Toast.makeText(Address.this, "Ordered", Toast.LENGTH_SHORT).show();
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Cancelled", Toast.LENGTH_SHORT).show();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }

            return null;
        }

        protected void onPostExecute(String file_url) {
            // dismiss the dialog once done
            pDialog.dismiss();
            Toast.makeText(getApplicationContext(), "Ordered Successfully", Toast.LENGTH_SHORT).show();
            tv2.setText("Hi "+et1.getText().toString()+", your order has been placed.");
        }
    }
    public boolean isConnected(){
        ConnectivityManager connMgr = (ConnectivityManager) getSystemService(Activity.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connMgr.getActiveNetworkInfo();
        if (networkInfo != null && networkInfo.isConnected())
            return true;
        else
            return false;
    }

    private boolean isEmpty(EditText etText) {
        return etText.getText().toString().trim().length() == 0;
    }
}
