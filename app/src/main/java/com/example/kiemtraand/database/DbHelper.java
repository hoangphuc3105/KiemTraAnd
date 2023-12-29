package com.example.kiemtraand.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    public DbHelper(@Nullable Context context) {
        super(context, "QLSanPham", null, 3);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE SanPham(MaSP INTEGER PRIMARY KEY AUTOINCREMENT, " + "TenSP TEXT, GiaTien REAL, Image TEXT)";
        db.execSQL(sql);
        String data = "INSERT INTO SanPham VALUES(1, 'Cơm trộn', '50000', 'https://images.immediate.co.uk/production/volatile/sites/30/2013/05/rice-a941d59.jpg?quality=90&resize=556,505')," +
                "(2, 'cơm', '30000', 'https://images.immediate.co.uk/production/volatile/sites/30/2013/05/rice-a941d59.jpg?quality=90&resize=556,505')," +
                "(3, 'cơm', '90000', 'https://images.immediate.co.uk/production/volatile/sites/30/2013/05/rice-a941d59.jpg?quality=90&resize=556,505')";
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
