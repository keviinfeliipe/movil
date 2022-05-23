package com.umb.bike;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.umb.bike.databinding.ActivityLoginBinding;

public class LoginActivity extends AppCompatActivity {

    private TextView username;
    private TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ActivityLoginBinding binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        username = binding.username;
        password = binding.password;

    }

    public void login(View view){

        String usernameActive= "kevin";
        String passwordActive = "1234";

        String user = username.getText().toString();
        String pass = password.getText().toString();

        if(!user.equals(usernameActive) || !pass.equals(passwordActive)){
            Toast.makeText(LoginActivity.this, "CREDENCIALES ERRONEAS", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent home = new Intent(this,AppActivity.class);
        startActivity(home);


    }


}