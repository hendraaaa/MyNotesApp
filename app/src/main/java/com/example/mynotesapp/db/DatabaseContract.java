package com.example.mynotesapp.db;

import android.provider.BaseColumns;

public class DatabaseContract {
    static String TABLE_NAME = "note";
   public static final class NoteColums implements BaseColumns{
       public static String TITLE = "title";
        public static String DESCRIPTION = "description";
        public static String DATE = "date";
    }

}