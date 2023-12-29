package com.example.kiemtraand.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(@Nullable Context context) {
        super(context, "QLSanPham", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE SanPham(MaSP INTEGER PRIMARY KEY AUTOINCREMENT, " + "TenSP TEXT, GiaTien REAL, Image TEXT)";
        db.execSQL(sql);
        String data = "INSERT INTO SanPham VALUES(1, 'Salad', '20000', 'https://static01.nyt.com/images/2018/02/21/dining/00RICEGUIDE8/00RICEGUIDE8-master768.jpg?w=1280&q=75')," +
                "(2, 'Pasta', '30000', 'https://static01.nyt.com/images/2018/02/21/dining/00RICEGUIDE8/00RICEGUIDE8-master768.jpg?w=1280&q=75)," +
                "(3, 'Pizza Cheese', '60000', 'https://static01.nyt.com/images/2018/02/21/dining/00RICEGUIDE8/00RICEGUIDE8-master768.jpg?w=1280&q=75')";
        db.execSQL(data);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        if (i != i1){
            db.execSQL("DROP TABLE IF EXISTS SanPham");
            onCreate(db);
        }
    }
}
