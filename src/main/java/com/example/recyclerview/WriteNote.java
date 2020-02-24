package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class WriteNote extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_note);
        editText = findViewById(R.id.editText);
    }

    public void saveNote(View view){
        String savedText = editText.getText().toString();
        Intent intent = getIntent();
//        ArrayList<String> list = intent.getStringArrayListExtra(MainActivity.listKey);
        NoteStorage.list.add(savedText);
        finish();
    }
}
