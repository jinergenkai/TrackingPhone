package com.jinergenkai.trackingphone;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText txtPassword;
    private String password = "123";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtPassword = findViewById(R.id.txtPassword);
        Button btnLogin = findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(view -> {
            if (txtPassword.getText().toString().equals(password)) {
//                finish();
                Intent mainAcitivity = new Intent(this, MainActivity.class);
                startActivity(mainAcitivity);
            }
        });
    }
}
