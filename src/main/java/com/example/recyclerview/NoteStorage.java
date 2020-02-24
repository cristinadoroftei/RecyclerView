package com.example.recyclerview;

import android.provider.ContactsContract;

import java.util.ArrayList;

public class NoteStorage {
    public static ArrayList<Note> getList() {
        return list;
    }

    private static ArrayList<Note> list;

    static { //static block, used to initialize static variables
        list = new ArrayList<>();
        Note note = new Note("Note1", "Body1");
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
        list.add(note);
    }

    public static Note getNote(int index){
        return list.get(index);
    }

    public static int getLength(){
        return list.size();
    }
}
