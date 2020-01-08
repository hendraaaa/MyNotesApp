package com.example.mynotesapp.helper;

import android.database.Cursor;

import com.example.mynotesapp.db.DatabaseContract;
import com.example.mynotesapp.entity.Note;

import java.util.ArrayList;

public class MappingHelper {
    public static ArrayList<Note>mapCursorToArrayList(Cursor notesCursor){
        ArrayList<Note>notesList = new ArrayList<>();

        while (notesCursor.moveToNext()){
            int id = notesCursor.getInt(notesCursor.getColumnIndexOrThrow(DatabaseContract.NoteColums._ID));
            String title = notesCursor.getString(notesCursor.getColumnIndexOrThrow(DatabaseContract.NoteColums.TITLE));
            String desciptiion = notesCursor.getString(notesCursor.getColumnIndexOrThrow(DatabaseContract.NoteColums.DESCRIPTION));
            String date = notesCursor.getString(notesCursor.getColumnIndexOrThrow(DatabaseContract.NoteColums.DATE));

            notesList.add(new Note(id,title,desciptiion,date));
        }
        return notesList;
    }
}
