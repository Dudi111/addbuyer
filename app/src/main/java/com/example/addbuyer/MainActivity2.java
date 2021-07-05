package com.example.addbuyer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    private EditText etorigni1;
    private EditText etcustname1;
    private EditText etmobnum1;
    private EditText etEMail1;
    private  EditText etAddr1;
    private EditText etax1;
    private EditText etcompany1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etorigni1=findViewById(R.id.etorgi);
        etcustname1=findViewById(R.id.etcustname1);
        etmobnum1=findViewById(R.id.etnumber1);
        etEMail1=findViewById(R.id.etmail1);
        etAddr1=findViewById(R.id.etadd1);
        etax1=findViewById(R.id.ettaxid1);
        etcompany1=findViewById(R.id.etcomid1);
        Intent intent=getIntent();
        String userName = intent.getStringExtra("organisation");
        etorigni1.setText(userName);
        String userName1 = intent.getStringExtra("custmer name");
        etcustname1.setText(userName1);
        String userName2 = intent.getStringExtra("mobile no");
        etmobnum1.setText(userName2);
        String userName3 = intent.getStringExtra("EMAIL");
        etEMail1.setText(userName3);
        String userName4 = intent.getStringExtra("Address");
        etAddr1.setText(userName4);
        String userName5 = intent.getStringExtra("Tax ID");
        etax1.setText(userName5);
        String userName6 = intent.getStringExtra("Company Id");
        etcompany1.setText(userName6);

    }
}