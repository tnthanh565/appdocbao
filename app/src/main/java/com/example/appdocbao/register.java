package com.example.appdocbao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.appdocbao.databinding.ActivityRegisterBinding;

public class register extends AppCompatActivity {
    ActivityRegisterBinding binding;
    database db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        db = new database(this);
        binding.btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String  username = binding.inputEmail.getText().toString();
                String  password = binding.inputPassword.getText().toString();
                String  confirmpass = binding.inputConfirmPass.getText().toString();

                if (username.equals("") || password.equals("") || confirmpass.equals(""))
                    Toast.makeText(register.this, "ALL fields are madatory", Toast.LENGTH_SHORT).show();
                else {
                    if (password.equals(confirmpass)){
                        Boolean checkUser = db.checkUserName(username);

                        if (checkUser == false){
                            Boolean insert = db.insertUser(username, password);

                            if (insert == true){
                                Toast.makeText(register.this, "Signup Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), Login.class);
                                startActivity(intent);
                            }
                            else {
                                Toast.makeText(register.this, "Signup failed", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(register.this, "User already exists, Please Login", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else {
                        Toast.makeText(register.this, "Invalid Password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        binding.textViewLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login.class);
                startActivity(intent);
            }
        });
    }
}