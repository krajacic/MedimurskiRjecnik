package cawabanga.com.medimurskirjecnik;

import android.content.Context;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

/**
 * Created by croatan on 18.3.2016. MedimurskiRjecnik.
 */
public class DictionaryDatabase extends SQLiteAssetHelper {
    private static final String DATABASE_NAME = "rjecnik";
    private static final int DATABASE_VERSION = 5;

    public DictionaryDatabase(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
}
