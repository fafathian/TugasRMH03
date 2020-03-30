package com.example.tugasrmh03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Menu2Activity extends AppCompatActivity {

    Button daftar;
    EditText Nama,Email,notel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        daftar = findViewById(R.id.btnok);
        Nama = findViewById(R.id.editUN);
        Email = findViewById(R.id.editmail);
        notel = findViewById(R.id.editnotel);

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Nama.getText().toString().equals("")){
                    Toast.makeText(getApplicationContext(), "isi nama", Toast.LENGTH_SHORT).show();
                }else if (Email.getText().toString().equals("example@example.com")){
                    Toast.makeText(getApplicationContext(), "isi seperti email", Toast.LENGTH_SHORT).show();
                }else if (notel.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "no telpon", Toast.LENGTH_SHORT).show();
                }else if(Nama.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "isi nama", Toast.LENGTH_SHORT).show();

                }else {
                    Toast.makeText(getApplicationContext(), "Success", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
