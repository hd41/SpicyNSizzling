package com.example.lenovopc.spicynsizzling;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lenovo Pc on 8/28/2016.
 */
public class dataHelper extends SQLiteOpenHelper {

    private static final String db_name="sns";
    private static final String table_name="cart";
    private static final int ver=1;

    public dataHelper(Context context) {
        super(context, db_name, null, ver);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void onCreate(SQLiteDatabase arg0) {
        // TODO Auto-generated method stub
        arg0.execSQL("create table if not exists "+table_name+" (item text, cost int, quantity float,id int)");
    }

    public Cursor getData(){

        SQLiteDatabase db=this.getReadableDatabase();
        Cursor res =  db.rawQuery( "select * from "+table_name+"", null );
        return res;
    }

    public boolean find(String item){
        SQLiteDatabase db=this.getReadableDatabase();
        boolean ans=false;
        Cursor res =  db.rawQuery("select * from " + table_name + " where item='"+item+"'", null);
        res.moveToFirst();
        if(res.isAfterLast()==false){
            ans=true;
        }
        return ans;
    }

    public void setId(String item,int id){
        SQLiteDatabase db=this.getWritableDatabase();
        db.execSQL("update "+table_name+" set id="+id+" where item='"+item+"'");
    }

    public void update(String item,int co,int q){
        SQLiteDatabase db=this.getWritableDatabase();
        db.execSQL("update "+table_name+" set cost="+co+",quantity="+q+" where item='"+item+"'");
    }

    public void insert(String s,int c,float q){
        SQLiteDatabase db=this.getWritableDatabase();
        db.execSQL("insert into "+table_name+"(item,cost,quantity)"+" values('"+s+"',"+c+","+q+")");
    }

    public void delete_all(){
        SQLiteDatabase db=this.getWritableDatabase();
        db.execSQL("Delete from "+table_name+"");
    }

    public int numberOfRows(){
        SQLiteDatabase db = this.getReadableDatabase();
        int numRows = (int) DatabaseUtils.queryNumEntries(db, table_name);
        return numRows;
    }

    public void delete2(String s){
        SQLiteDatabase db=this.getWritableDatabase();
        db.execSQL("Delete from "+table_name+" where item='"+s+"'");
    }


    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
        // TODO Auto-generated method stub
        arg0.execSQL("drop table if exists "+table_name+"");
        onCreate(arg0);
    }
}