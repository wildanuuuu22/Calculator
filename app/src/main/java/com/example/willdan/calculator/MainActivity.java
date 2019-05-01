package com.example.willdan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nilai1, nilai2;
    TextView hasil;
    Button tambah, kali, bagi, kurang, delete;

    //todo 1 inisialisasi view yang di buat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //todo 2 inisialisasi view yang di buat
        nilai1 = findViewById(R.id.nilai1);
        nilai2 = findViewById(R.id.nilai2);
        hasil = findViewById(R.id.hasil);
        tambah = findViewById(R.id.tambah);
        kali = findViewById(R.id.kali);
        delete = findViewById(R.id.Delete);
        kurang = findViewById(R.id.kurang);
        bagi = findViewById(R.id.bagi);


        //todo 8 atur buttonuntuk masing - masing operator
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "isi woy", Toast.LENGTH_SHORT).show();
                } else {

                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "isi woy", Toast.LENGTH_SHORT).show();
                } else {
                    kurang();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "isi woy", Toast.LENGTH_SHORT).show();
                } else {
                    kali();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nilai1.getText().toString().isEmpty() || nilai2.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "isi woy", Toast.LENGTH_SHORT).show();
                } else {
                    bagi();
                }
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }


        });


        //todo 3 inisialisasi view yang di buat
        //todo 4 inisialisasi view yang di buat
        //todo 5 inisialisasi view yang di buat
        //todo 6 inisialisasi view yang di buat
        //todo 7 inisialisasi view yang di buat


        //1.buat method namanya tambah
        //2.buat method namanya kali
        //3.buat method namanya delete
        //4.buat method namanya kurang
        //5.buat method namanya bagi


    }

    void tambah() {
        //simpan inputan user kedalam variable
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        //jumlahkan
        int total = angka1 + angka2;
        //hasil nya di tampilkan di TextView
        hasil.setText(String.valueOf(total));


    }

    void kali() {
        //simpan inputan user kedalam variable
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        int total = angka1 * angka2;
        //hasil nya di tampilkan di TextView
        hasil.setText(String.valueOf(total));

    }

    void delete() {

        nilai1.setText("");
        nilai2.setText("");

    }

    void kurang() {
        //simpan inputan user kedalam variable
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        int total = angka1 - angka2;
        //hasil nya di tampilkan di TextView
        hasil.setText(String.valueOf(total));
    }

    void bagi() {
        //simpan inputan user kedalam variable
        int angka1 = Integer.parseInt(nilai1.getText().toString());
        int angka2 = Integer.parseInt(nilai2.getText().toString());

        int total = angka1 - angka2;
        //hasil nya di tampilkan di TextView
        hasil.setText(String.valueOf(total));


    }
}







