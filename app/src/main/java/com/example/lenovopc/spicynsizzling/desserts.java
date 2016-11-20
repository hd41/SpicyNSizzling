package com.example.lenovopc.spicynsizzling;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class desserts extends Fragment {

    private TextView et1,et2,et3,et4,et5,et6,et7;
    private Button btn,m1,m2,m3,m4,m5,m6,m7,ma1,ma2,ma3,ma4,ma5,ma6,ma7;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View v=inflater.inflate(R.layout.activity_desserts, container, false);
        final dataHelper dh=new dataHelper(this.getActivity());

        et1=(TextView)v.findViewById(R.id.tf1);
        et2=(TextView)v.findViewById(R.id.tf2);
        et3=(TextView)v.findViewById(R.id.tf3);
        et4=(TextView)v.findViewById(R.id.tf4);
        et5=(TextView)v.findViewById(R.id.tf5);
        et6=(TextView)v.findViewById(R.id.tf6);
        et7=(TextView)v.findViewById(R.id.tf7);

        btn=(Button)v.findViewById(R.id.button);
        m1=(Button)v.findViewById(R.id.mi1);
        m2=(Button)v.findViewById(R.id.mi2);
        m3=(Button)v.findViewById(R.id.mi3);
        m4=(Button)v.findViewById(R.id.mi4);
        m5=(Button)v.findViewById(R.id.mi5);
        m6=(Button)v.findViewById(R.id.mi6);
        m7=(Button)v.findViewById(R.id.mi7);
        ma1=(Button)v.findViewById(R.id.ma1);
        ma2=(Button)v.findViewById(R.id.ma2);
        ma3=(Button)v.findViewById(R.id.ma3);
        ma4=(Button)v.findViewById(R.id.ma4);
        ma5=(Button)v.findViewById(R.id.ma5);
        ma6=(Button)v.findViewById(R.id.ma6);
        ma7=(Button)v.findViewById(R.id.ma7);

        et1.setText("0");
        et2.setText("0");
        et3.setText("0");
        et4.setText("0");
        et5.setText("0");
        et6.setText("0");
        et7.setText("0");


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (Integer.parseInt(et1.getText().toString()) > 0) {
                    if (dh.find("Pasta(White Sauce)")) {
                        dh.update("Pasta(White Sauce)", 70, Integer.parseInt(et1.getText().toString()));
                    } else
                        dh.insert("Pasta(White Sauce)", 70, Integer.parseInt(et1.getText().toString()));
                }
                if (Integer.parseInt(et2.getText().toString()) > 0) {
                    if (dh.find("Pasta(Red Sauce)")) {
                        dh.update("Pasta(Red Sauce)", 70, Integer.parseInt(et2.getText().toString()));
                    } else
                        dh.insert("Pasta(Red Sauce)", 70, Integer.parseInt(et2.getText().toString()));
                }
                if (Integer.parseInt(et3.getText().toString()) > 0) {
                    if (dh.find("Pasta(Mix Sauce)")) {
                        dh.update("Pasta(Mix Sauce)", 70, Integer.parseInt(et3.getText().toString()));
                    } else
                        dh.insert("Pasta(Mix Sauce)", 70, Integer.parseInt(et3.getText().toString()));
                }
                if (Integer.parseInt(et4.getText().toString()) > 0) {
                    if (dh.find("Cheese Pizza")) {
                        dh.update("Cheese Pizza", 120, Integer.parseInt(et4.getText().toString()));
                    } else
                        dh.insert("Cheese Pizza", 120, Integer.parseInt(et4.getText().toString()));
                }
                if (Integer.parseInt(et5.getText().toString()) > 0) {
                    if (dh.find("Onion Capsicum Pizza")) {
                        dh.update("Onion Capsicum Pizza", 130, Integer.parseInt(et5.getText().toString()));
                    } else
                        dh.insert("Onion Capsicum Pizza", 130, Integer.parseInt(et5.getText().toString()));
                }
                if (Integer.parseInt(et6.getText().toString()) > 0) {
                    if (dh.find("Mushroom Corn Pizza")) {
                        dh.update("Mushroom Corn Pizza", 140, Integer.parseInt(et6.getText().toString()));
                    } else
                        dh.insert("Mushroom Corn Pizza", 140, Integer.parseInt(et6.getText().toString()));
                }
                if (Integer.parseInt(et7.getText().toString()) > 0) {
                    if (dh.find("Chilly Paneer Pizza")) {
                        dh.update("Chilly Paneer Pizza", 150, Integer.parseInt(et7.getText().toString()));
                    } else
                        dh.insert("Chilly Paneer Pizza", 150, Integer.parseInt(et7.getText().toString()));
                }

                Toast.makeText(getActivity(), "Added to Cart", Toast.LENGTH_SHORT).show();
            }
        });

        m1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(et1.getText().toString());
                if (temp != 0) {
                    temp--;
                    et1.setText("" + temp);
                }
                // TODO Auto-generated method stub

            }
        });
        m2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(et2.getText().toString());
                if (temp != 0) {
                    temp--;
                    et2.setText("" + temp);
                }
            }
        });
        m3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(et3.getText().toString());
                if (temp != 0) {
                    temp--;
                    et3.setText("" + temp);
                }
            }
        });

        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(et4.getText().toString());
                if (temp != 0) {
                    temp--;
                    et4.setText("" + temp);
                }
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(et5.getText().toString());
                if (temp != 0) {
                    temp--;
                    et5.setText("" + temp);
                }
                // TODO Auto-generated method stub

            }
        });
        m6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(et6.getText().toString());
                if (temp != 0) {
                    temp--;
                    et6.setText("" + temp);
                }
            }
        });
        m7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(et7.getText().toString());
                if (temp != 0) {
                    temp--;
                    et7.setText("" + temp);
                }
            }
        });
        ma1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et1.getText().toString());
                if(temp!=10){
                    temp++;
                    Log.d("spice","gotcha");
                    et1.setText(""+temp);
                }
            }
        });
        ma2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et2.getText().toString());
                if(temp!=10){
                    temp++;
                    et2.setText(""+temp);
                }
                // TODO Auto-generated method stub

            }
        });
        ma3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et3.getText().toString());
                if(temp!=10){
                    temp++;
                    et3.setText(""+temp);
                }
            }
        });

        ma4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et4.getText().toString());
                if(temp!=10){
                    temp++;
                    et4.setText(""+temp);
                }
            }
        });
        ma5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et5.getText().toString());
                if(temp!=10){
                    temp++;
                    Log.d("spice","gotcha");
                    et5.setText(""+temp);
                }
            }
        });
        ma6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et6.getText().toString());
                if(temp!=10){
                    temp++;
                    et6.setText(""+temp);
                }
                // TODO Auto-generated method stub

            }
        });
        ma7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et7.getText().toString());
                if(temp!=10){
                    temp++;
                    et7.setText(""+temp);
                }
            }
        });

        return v;
    }

}