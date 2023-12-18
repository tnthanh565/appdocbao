package com.example.appdocbao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appdocbao.databinding.ActivityLoginBinding;

public class Login extends AppCompatActivity {
    database db;
    ActivityLoginBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        db = new database(this);

        binding.btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = binding.inputEmail.getText().toString();
                String pass = binding.inputPassword.getText().toString();

                if (email.equals("") || pass.equals(""))
                    Toast.makeText(Login.this, "ALL fields are madatory", Toast.LENGTH_SHORT).show();
                else {
                    Boolean checkCredental = db.checkUserNamePass(email, pass);

                    if (checkCredental == true)
                    {
                        Toast.makeText(Login.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(Login.this, "Invalid Credental", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
//        TextView Signup = findViewById(R.id.tvSignUp);
//        Signup.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(Login.this, signUp.class);
//                startActivity(intent);
//            }
//        });
  }
}