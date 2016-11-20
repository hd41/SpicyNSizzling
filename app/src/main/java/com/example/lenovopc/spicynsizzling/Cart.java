package com.example.lenovopc.spicynsizzling;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Cart extends AppCompatActivity implements View.OnClickListener {

    Button order,reset;
    TextView tv;
    final dataHelper dh=new dataHelper(this);
    String item1="";
    float cost1=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);
        order=(Button)findViewById(R.id.button4);
        reset=(Button)findViewById(R.id.button2);
        order.setOnClickListener(this);
        reset.setOnClickListener(this);

        int size=dh.numberOfRows();
        Button []btn=new Button[size];
        Cursor c=dh.getData();

        c.moveToFirst();
        int i=0;
        while(c.isAfterLast()==false){
            String item=c.getString(c.getColumnIndex("item"));
            int cost=c.getInt(c.getColumnIndex("cost"));
            float quant=c.getFloat(c.getColumnIndex("quantity"));
            cost1+=cost*quant;
            item1+=item+" "+quant+"\n";

            c.moveToNext();
            btn[i]=new Button(this);
            btn[i].setId(i);
            dh.setId(item,i);
            btn[i].setText(item+" "+cost+" "+quant+" ");
            btn[i].setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            btn[i].setOnClickListener(this);

            layout.addView(btn[i]);
            i++;
        }
        tv=new TextView(this);
        tv.setText("Total Cost: "+cost1);
        tv.setTextSize(32);
        tv.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        layout.addView(tv);
        c.close();
    }

    @Override
    public void onClick(View arg0) {
        // TODO Auto-generated method stub
        Log.d("cart","Clicked");
        switch(arg0.getId()){
            case R.id.button4:
                if(cost1>0){
                    String res=item1;
                    String tot="Total Cost: "+cost1;
                    Intent in=new Intent(this,Address.class);
                    Bundle bu=new Bundle();
                    bu.putString("res",res);
                    bu.putString("tot", tot);
                    in.putExtra("order",bu);
                    startActivityForResult(in,100);
                }
                else {
                    new AlertDialog.Builder(Cart.this)
                            .setTitle("No Item Selected")
                            .setMessage("Select some items to order!!")
                            .setCancelable(false)
                            .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.cancel();
                                }
                            }).create().show();
                }
                break;
            case R.id.button2:
                dh.delete_all();
                Intent i=new Intent(Cart.this,MainActivity.class);
                startActivity(i);
                break;
            default:
                if(dh.numberOfRows()==1){
                    dh.delete_all();
                }
                else{
                    delete1(arg0.getId());

                    cost1=0;
                    item1="";

                    ViewGroup layout = (ViewGroup) findViewById(R.id.layout1);
                    View command = layout.findViewById(arg0.getId());
                    layout.removeView(command);

                    //Database ki cost ka sum dobara kro
                    Cursor c=dh.getData();
                    c.moveToFirst();
                    while(c.isAfterLast()==false){
                        String item=c.getString(c.getColumnIndex("item"));
                        int cost=c.getInt(c.getColumnIndex("cost"));
                        int quant=c.getInt(c.getColumnIndex("quantity"));
                        item1+=item+" "+quant+"\n";
                        cost1+=cost*quant;
                        c.moveToNext();
                    }
                    tv.setText("Total Cost: "+cost1);
                }

               // super.onCreate(new Bundle());
        }
    }

    public void delete1(int c){
        Cursor cu=dh.getData();
        cu.moveToFirst();
        while(cu.isAfterLast()==false){
            int i=cu.getInt(3);
            if(i==c){
                String item=cu.getString(0);
                dh.delete2(item);
                return ;
            }
            cu.moveToNext();
            i++;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_cart, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(Intent.ACTION_MAIN);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            return true;
        }
        if(id ==  android.R.id.home){
            this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
