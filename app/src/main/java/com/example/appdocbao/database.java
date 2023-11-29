package com.example.appdocbao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

import demo.news;

public class database extends SQLiteOpenHelper {
    public database(@Nullable Context context) {
        super(context, "appdocbao.db", null, 2);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public Boolean insertUser(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put("USERNAME", username);
        cv.put("PASSWORD", password);

        long result = db.insert("user", null, cv);
        if(result != -1)
        {
            return false;
        }
        else {
            return true;
        }
    }
    public Boolean checkUserName(String username){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM user WHERE USERNAME = ?", new String[]{username});
        if (cursor.getCount() > 0){
            return true;
        }
        else {
            return false;
        }
    }
    public Boolean checkUserNamePass(String username, String password){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM user WHERE USERNAME = ? AND PASSWORD = ?", new String[]{username, password});
        if (cursor.getCount() > 0){
            return true;
        }
        else {
            return false;
        }
    }
    public ArrayList<news> getAllnews(){

        SQLiteDatabase db = this.getReadableDatabase();
        String query = "SELECT * FROM bao";
        Cursor cursor = null;
        if(db != null){
            cursor = db.rawQuery(query, null);
        }
        if (cursor == null){
            return null;
        }
        else {
            ArrayList<news> news = new ArrayList<>();
            while (cursor.moveToNext()){
                int id = cursor.getInt(0);
                String title = cursor.getString(3);
                byte[] image = cursor.getBlob(1);
                String path = cursor.getString(2);
                news n = new news(id,title,path);
                n.setNewImage(image);
                news.add(n);
            }
            return news;
        }
    }
}
