package com.example.addbuyer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText etorigni;
private EditText etcustname;
private EditText etmobnum;
private EditText etEMail;
private  EditText etAddr;
private EditText etax;
private EditText etcompany;
private Button mbtnaddb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etorigni=findViewById(R.id.etorgname);
        etcustname=findViewById(R.id.etcustname);
        etmobnum=findViewById(R.id.etnumber);
        etEMail=findViewById(R.id.etmail);
        etAddr=findViewById(R.id.etadd);
        etax=findViewById(R.id.ettaxid);
        etcompany=findViewById(R.id.etcomid);
        mbtnaddb=findViewById(R.id.btn1);
        mbtnaddb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("organisation",etorigni.getText().toString());
                intent.putExtra("custmer name",etcustname.getText().toString());
                intent.putExtra("mobile no",etmobnum.getText().toString());
                intent.putExtra("EMAIL",etEMail.getText().toString());
                intent.putExtra("Address",etAddr.getText().toString());
                intent.putExtra("Tax ID",etax.getText().toString());
                intent.putExtra("Company Id",etcompany.getText().toString());
                startActivity(intent);




            }
        });
    }
}