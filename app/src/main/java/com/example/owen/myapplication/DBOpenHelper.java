package com.example.owen.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by owen on 2017/5/8.
 */

public class DBOpenHelper extends SQLiteOpenHelper {
public DBOpenHelper(Context context) {
        super(context, "hk6.db", null, 2);
        }

@Override
public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table  " +
        NoteDB.NOTETABLE + "  (title, body);");
        }

@Override
public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {
        }

        }
