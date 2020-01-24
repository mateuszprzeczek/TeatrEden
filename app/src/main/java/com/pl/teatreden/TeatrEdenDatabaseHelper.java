package com.pl.teatreden;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TeatrEdenDatabaseHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "teatr_eden";
    private static final int DB_VERSION = 1;

    public TeatrEdenDatabaseHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0 , DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            updateMyDatabase(db, oldVersion, newVersion);
    }
    private static void insertSpectacle(SQLiteDatabase db,
                                        String title,
                                        int description,
                                        int resourceId) {
        ContentValues spectacleValues = new ContentValues();
        spectacleValues.put("TITLE", title);
        spectacleValues.put("DESCRIPTION", description);
        spectacleValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("SPECTACLE", null, spectacleValues);
    }
    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion){
        if (oldVersion < 1){
            db.execSQL("CREATE TABLE SPECTACLE (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
            + "TITLE TEXT, "
            + "DESCRIPTION TEXT, "
            + "IMAGE_RESOURCE_ID INTEGER);");
            insertSpectacle(db, "Najlepszy Przyjaciel", R.string.najlepszy_przyjaciel_descrtiption,
                    R.drawable.najlepszy_przyjaciel1);
        }
        if (oldVersion < 2){
            db.execSQL("ALTER TABLE SPECTACLE ADD COLUMN FAVORITE NUMERIC");
        }
    }
}
