package com.example.lenovopc.spicynsizzling;

import android.support.v7.app.ActionBar;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends ActionBarActivity implements ActionBar.TabListener{

    ActionBar ab;
    ViewPager viewpager;
    fragmentPageAdapter ft;
    final dataHelper dh=new dataHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dataHelper dh=new dataHelper(this);
        dh.delete_all();
        viewpager = (ViewPager) findViewById(R.id.pager);
        ft =new fragmentPageAdapter(getSupportFragmentManager());
        ab=getSupportActionBar();
        viewpager.setAdapter(ft);
        ab.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        ab.addTab(ab.newTab().setText("Burgers/Sandwiches").setTabListener(this));
        ab.addTab(ab.newTab().setText("Chinese").setTabListener(this));
        ab.addTab(ab.newTab().setText("Pizzas/Pasta").setTabListener(this));
        viewpager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                ab.setSelectedNavigationItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.cartab, menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent i=new Intent(MainActivity.this,Cart.class);
                startActivity(i);
                return true;
            case R.id.action_cart:
                Intent i2=new Intent(MainActivity.this,Cart.class);
                startActivity(i2);
                return true;
            case R.id.Reset:
                dh.delete_all();
                Intent i3=new Intent(MainActivity.this,SpicyNSizzling.class);
                startActivity(i3);
                return true;
            case android.R.id.home:
                this.finish();
                return true;
            case R.id.action_settings:
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {
        viewpager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }
}
