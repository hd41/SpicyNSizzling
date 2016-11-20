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

public class main_course extends Fragment{

    private TextView et1,et2,et3,et4,et5,et6,et7,et8,et9,et10,et11,et12,et13,et14,et15,et16,et17,et18;
    private Button btn,m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,ma1,ma2,ma3,ma4,ma5,ma6,ma7,ma8,ma9,ma10,ma11,ma12,ma13,ma14,ma15,ma16,ma17,ma18;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub

        View v=inflater.inflate(R.layout.activity_main_course, container, false);
        final dataHelper dh=new dataHelper(this.getActivity());

        et1=(TextView)v.findViewById(R.id.tf1);
        et2=(TextView)v.findViewById(R.id.tf2);
        et3=(TextView)v.findViewById(R.id.tf3);
        et4=(TextView)v.findViewById(R.id.tf4);
        et5=(TextView)v.findViewById(R.id.tf5);
        et6=(TextView)v.findViewById(R.id.tf6);
        et7=(TextView)v.findViewById(R.id.tf7);
        et8=(TextView)v.findViewById(R.id.tf8);
        et9=(TextView)v.findViewById(R.id.tf9);
        et10=(TextView)v.findViewById(R.id.tf10);
        et11=(TextView)v.findViewById(R.id.tf11);
        et12=(TextView)v.findViewById(R.id.tf12);
        et13=(TextView)v.findViewById(R.id.tf13);
        et14=(TextView)v.findViewById(R.id.tf14);
        et15=(TextView)v.findViewById(R.id.tf15);
        et16=(TextView)v.findViewById(R.id.tf16);
        et17=(TextView)v.findViewById(R.id.tf17);
        et18=(TextView)v.findViewById(R.id.tf18);


        btn=(Button)v.findViewById(R.id.button);
        m1=(Button)v.findViewById(R.id.mi1);
        m2=(Button)v.findViewById(R.id.mi2);
        m3=(Button)v.findViewById(R.id.mi3);
        m4=(Button)v.findViewById(R.id.mi4);
        m5=(Button)v.findViewById(R.id.mi5);
        m6=(Button)v.findViewById(R.id.mi6);
        m7=(Button)v.findViewById(R.id.mi7);
        m8=(Button)v.findViewById(R.id.mi8);
        m9=(Button)v.findViewById(R.id.mi9);
        m10=(Button)v.findViewById(R.id.mi10);
        m11=(Button)v.findViewById(R.id.mi11);
        m12=(Button)v.findViewById(R.id.mi12);
        m13=(Button)v.findViewById(R.id.mi13);
        m14=(Button)v.findViewById(R.id.mi14);
        m15=(Button)v.findViewById(R.id.mi15);
        m16=(Button)v.findViewById(R.id.mi16);
        m17=(Button)v.findViewById(R.id.mi17);
        m18=(Button)v.findViewById(R.id.mi18);


        ma1=(Button)v.findViewById(R.id.ma1);
        ma2=(Button)v.findViewById(R.id.ma2);
        ma3=(Button)v.findViewById(R.id.ma3);
        ma4=(Button)v.findViewById(R.id.ma4);
        ma5=(Button)v.findViewById(R.id.ma5);
        ma6=(Button)v.findViewById(R.id.ma6);
        ma7=(Button)v.findViewById(R.id.ma7);
        ma8=(Button)v.findViewById(R.id.ma8);
        ma9=(Button)v.findViewById(R.id.ma9);
        ma10=(Button)v.findViewById(R.id.ma10);
        ma11=(Button)v.findViewById(R.id.ma11);
        ma12=(Button)v.findViewById(R.id.ma12);
        ma13=(Button)v.findViewById(R.id.ma13);
        ma14=(Button)v.findViewById(R.id.ma14);
        ma15=(Button)v.findViewById(R.id.ma15);
        ma16=(Button)v.findViewById(R.id.ma16);
        ma17=(Button)v.findViewById(R.id.ma17);
        ma18=(Button)v.findViewById(R.id.ma18);


        et1.setText("0");
        et2.setText("0");
        et3.setText("0");
        et4.setText("0");
        et5.setText("0");
        et6.setText("0");
        et7.setText("0");
        et8.setText("0");
        et9.setText("0");
        et10.setText("0");
        et11.setText("0");
        et12.setText("0");
        et13.setText("0");
        et14.setText("0");
        et15.setText("0");
        et16.setText("0");
        et17.setText("0");
        et18.setText("0");

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                // TODO Auto-generated method stub
                if (Integer.parseInt(et1.getText().toString()) > 0) {
                    if (dh.find("Veg. Fried Rice")) {
                        dh.update("Veg. Fried Rice", 25, Integer.parseInt(et1.getText().toString()));
                    } else
                        dh.insert("Veg. Fried Rice", 25, Integer.parseInt(et1.getText().toString()));
                }
                if (Integer.parseInt(et2.getText().toString()) > 0) {
                    if (dh.find("Chilly Garlic Fried Rice")) {
                        dh.update("Chilly Garlic Fried Rice", 35, Integer.parseInt(et2.getText().toString()));
                    } else
                        dh.insert("Chilly Garlic Fried Rice", 35, Integer.parseInt(et2.getText().toString()));
                }
                if (Integer.parseInt(et3.getText().toString()) > 0) {
                    if (dh.find("Mushroom Fried Rice")) {
                        dh.update("Mushroom Fried Rice", 35, Integer.parseInt(et3.getText().toString()));
                    } else
                        dh.insert("Mushroom Fried Rice", 35, Integer.parseInt(et3.getText().toString()));
                }
                if (Integer.parseInt(et4.getText().toString()) > 0) {
                    if (dh.find("Veg. Noodles")) {
                        dh.update("Veg. Noodles", 45, Integer.parseInt(et4.getText().toString()));
                    } else
                        dh.insert("Veg. Noodles", 45, Integer.parseInt(et4.getText().toString()));
                }
                if (Integer.parseInt(et5.getText().toString()) > 0) {
                    if (dh.find("Veg. Hakka Noodles")) {
                        dh.update("Veg. Hakka Noodles", 60, Integer.parseInt(et5.getText().toString()));
                    } else
                        dh.insert("Veg. Hakka Noodles", 60, Integer.parseInt(et5.getText().toString()));
                }
                if (Integer.parseInt(et6.getText().toString()) > 0) {
                    if (dh.find("Chilly Garlic Noodles")) {
                        dh.update("Chilly Garlic Noodles", 60, Integer.parseInt(et6.getText().toString()));
                    } else
                        dh.insert("Chilly Garlic Noodles", 60, Integer.parseInt(et6.getText().toString()));
                }
                if (Integer.parseInt(et7.getText().toString()) > 0) {
                    if (dh.find("Singapore Noodles")) {
                        dh.update("Singapore Noodles", 60, Integer.parseInt(et7.getText().toString()));
                    } else
                        dh.insert("Singapore Noodles", 60, Integer.parseInt(et7.getText().toString()));
                }
                if (Integer.parseInt(et8.getText().toString()) > 0) {
                    if (dh.find("Veg. Momos(Steam)")) {
                        dh.update("Veg. Momos(Steam)", 35, Integer.parseInt(et8.getText().toString()));
                    } else
                        dh.insert("Veg. Momos(Steam)", 35, Integer.parseInt(et8.getText().toString()));
                }
                if (Integer.parseInt(et9.getText().toString()) > 0) {
                    if (dh.find("Veg. Momos(Fried)")) {
                        dh.update("Veg. Momos(Fried)", 35, Integer.parseInt(et9.getText().toString()));
                    } else
                        dh.insert("Veg. Momos(Fried)", 35, Integer.parseInt(et9.getText().toString()));
                }
                if (Integer.parseInt(et10.getText().toString()) > 0) {
                    if (dh.find("Veg. Spring Rolls")) {
                        dh.update("Veg. Spring Rolls", 40, Integer.parseInt(et10.getText().toString()));
                    } else
                        dh.insert("Veg. Spring Rolls", 40, Integer.parseInt(et10.getText().toString()));
                }
                if (Integer.parseInt(et11.getText().toString()) > 0) {
                    if (dh.find("Chilly Potato")) {
                        dh.update("Chilly Potato", 60, Integer.parseInt(et11.getText().toString()));
                    } else
                        dh.insert("Chilly Potato", 60, Integer.parseInt(et11.getText().toString()));
                }
                if (Integer.parseInt(et12.getText().toString()) > 0) {
                    if (dh.find("Honey Chilly Potato")) {
                        dh.update("Honey Chilly Potato", 65, Integer.parseInt(et12.getText().toString()));
                    } else
                        dh.insert("Honey Chilly Potato", 65, Integer.parseInt(et12.getText().toString()));
                }
                if (Integer.parseInt(et13.getText().toString()) > 0) {
                    if (dh.find("Veg. Manchurian(Dry)")) {
                        dh.update("Veg. Manchurian(Dry)", 50, Integer.parseInt(et13.getText().toString()));
                    } else
                        dh.insert("Veg. Manchurian(Dry)", 50, Integer.parseInt(et13.getText().toString()));
                }
                if (Integer.parseInt(et14.getText().toString()) > 0) {
                    if (dh.find("Veg. Manchurian(Gravy)")) {
                        dh.update("Veg. Manchurian(Gravy)", 50, Integer.parseInt(et14.getText().toString()));
                    } else
                        dh.insert("Veg. Manchurian(Gravy)", 50, Integer.parseInt(et14.getText().toString()));
                }
                if (Integer.parseInt(et15.getText().toString()) > 0) {
                    if (dh.find("Chilly Cheese(Dry)")) {
                        dh.update("Chilly Cheese(Dry)", 120, Integer.parseInt(et15.getText().toString()));
                    } else
                        dh.insert("Chilly Cheese(Dry)", 120, Integer.parseInt(et15.getText().toString()));
                }
                if (Integer.parseInt(et16.getText().toString()) > 0) {
                    if (dh.find("Chilly Cheese(Gravy)")) {
                        dh.update("Chilly Cheese(Gravy)", 120, Integer.parseInt(et16.getText().toString()));
                    } else
                        dh.insert("Chilly Cheese(Gravy)", 120, Integer.parseInt(et16.getText().toString()));
                }
                if (Integer.parseInt(et17.getText().toString()) > 0) {
                    if (dh.find("Chilly Mashroom(Dry)")) {
                        dh.update("Chilly Mashroom(Dry)", 120, Integer.parseInt(et17.getText().toString()));
                    } else
                        dh.insert("Chilly Mashroom(Dry)", 120, Integer.parseInt(et17.getText().toString()));
                }
                if (Integer.parseInt(et18.getText().toString()) > 0) {
                    if (dh.find("Chilly Mashroom(Gravy)")) {
                        dh.update("Chilly Mashroom(Gravy)", 120, Integer.parseInt(et18.getText().toString()));
                    } else
                        dh.insert("Chilly Mashroom(Gravy)", 120, Integer.parseInt(et18.getText().toString()));
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

        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et8.getText().toString());
                if(temp!=0){
                    temp--;
                    et8.setText("" + temp);
                }
            }
        });
        m9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et9.getText().toString());
                if(temp!=0){
                    temp--;
                    et9.setText(""+temp);
                }
            }
        });

        m10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et10.getText().toString());
                if(temp!=0){
                    temp--;
                    et10.setText(""+temp);
                }
            }
        });
        m11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(et11.getText().toString());
                if (temp != 0) {
                    temp--;
                    et11.setText("" + temp);
                }
                // TODO Auto-generated method stub

            }
        });
        m12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(et2.getText().toString());
                if (temp != 0) {
                    temp--;
                    et12.setText("" + temp);
                }
            }
        });
        m13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp = Integer.parseInt(et13.getText().toString());
                if (temp != 0) {
                    temp--;
                    et13.setText("" + temp);
                }
            }
        });

        m14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et14.getText().toString());
                if(temp!=0){
                    temp--;
                    et14.setText("" + temp);
                }
            }
        });
        m15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et15.getText().toString());
                if(temp!=0){
                    temp--;
                    et15.setText(""+temp);
                }
                // TODO Auto-generated method stub

            }
        });
        m16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et16.getText().toString());
                if(temp!=0){
                    temp--;
                    et16.setText(""+temp);
                }
            }
        });
        m17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et17.getText().toString());
                if(temp!=0){
                    temp--;
                    et17.setText(""+temp);
                }
            }
        });

        m18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et18.getText().toString());
                if(temp!=0){
                    temp--;
                    et18.setText(""+temp);
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

        ma8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et8.getText().toString());
                if(temp!=10){
                    temp++;
                    et8.setText(""+temp);
                }
            }
        });
        ma9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et9.getText().toString());
                if(temp!=10){
                    temp++;
                    et9.setText(""+temp);
                }
            }
        });

        ma10.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et10.getText().toString());
                if(temp!=10){
                    temp++;
                    et10.setText(""+temp);
                }
            }
        });
        ma11.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et11.getText().toString());
                if(temp!=10){
                    temp++;
                    et11.setText(""+temp);
                }
            }
        });
        ma12.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et12.getText().toString());
                if(temp!=10){
                    temp++;
                    et12.setText(""+temp);
                }
                // TODO Auto-generated method stub

            }
        });
        ma13.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et13.getText().toString());
                if(temp!=10){
                    temp++;
                    et13.setText(""+temp);
                }
            }
        });

        ma14.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et14.getText().toString());
                if(temp!=10){
                    temp++;
                    et14.setText(""+temp);
                }
            }
        });
        ma15.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et15.getText().toString());
                if(temp!=10){
                    temp++;
                    et15.setText(""+temp);
                }
            }
        });
        ma16.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et16.getText().toString());
                if(temp!=10){
                    temp++;
                    et16.setText(""+temp);
                }
                // TODO Auto-generated method stub

            }
        });
        ma17.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et17.getText().toString());
                if(temp!=10){
                    temp++;
                    et17.setText(""+temp);
                }
            }
        });

        ma18.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int temp=Integer.parseInt(et18.getText().toString());
                if(temp!=10){
                    temp++;
                    et18.setText(""+temp);
                }
            }
        });
        return v;
    }

}