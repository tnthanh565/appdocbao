package com.example.appdocbao;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.landz.android.database.Database;

public class Add extends AppCompatActivity {

    EditText title_input, author_input, album_input;
    Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        title_input = findViewById(R.id.title_input);
        author_input = findViewById(R.id.author_input);
        album_input = findViewById(R.id.album_input);
        btn_save = findViewById(R.id.btn_save);
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Database db = new Database(Add.this);
                db.addMusic(title_input.getText().toString().trim(),
                        author_input.getText().toString().trim(),
                        album_input.getText().toString().trim());
            }
        });
    }
}