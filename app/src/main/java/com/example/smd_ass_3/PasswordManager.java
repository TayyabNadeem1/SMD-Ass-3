package com.example.smd_ass_3;

import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PasswordManager extends AppCompatActivity {

    Button btnSignUp, btnLogin, btnPM, btnDrop;
    Context context;
    int userid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_password_manager);
        btnPM = findViewById(R.id.btnPM);

        Intent intent=getIntent();
        userid=intent.getIntExtra("userid",-1);

        btnPM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PasswordManager.this, UsersRegistered.class);
                intent.putExtra("userid",userid);
                startActivity(intent);
                finish();
            }
        });
    }
}