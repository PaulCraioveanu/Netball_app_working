package com.example.netball_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    private Button Profile;
    Button idBtnLogout;
    EditText etName, etUsername, etEmail;
    UserLocalStore userLocalStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        etName = (EditText) findViewById(R.id.etName);
        etUsername = (EditText) findViewById(R.id.etUsername);
        etEmail = (EditText) findViewById(R.id.etEmail);

        idBtnLogout = (Button) findViewById(R.id.idBtnLogout);
        idBtnLogout.setOnClickListener(this);

        final TextView welcomeMessage = (TextView) findViewById(R.id.welcomemsg);

        userLocalStore = new UserLocalStore(this);

        //test
        Profile = (Button) findViewById(R.id.Profilebtn);
        //test

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        String email = intent.getStringExtra("email");

        String message = name + "Welcome to your user area";
        welcomeMessage.setText(message);
        etName.setText(name);
        etUsername.setText(username);
        etEmail.setText(email);

    }

    @Override
    public void onClick(View view) {

    }
}