package com.example.tugas3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DataBuku extends AppCompatActivity {

    private TextView getJudul, getDetail;
    private ImageView getCover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setTitle("Data Film");
        getCover = findViewById(R.id.detail_cover);
        getDetail = findViewById(R.id.detail_detail_buku);
        getJudul = findViewById(R.id.detail_judul);
        showData();
    }

    private void showData(){
        String judul = getIntent().getExtras().getString("JudulBuku");

        switch (judul){
            case "bumi" :
                getJudul.setText("BUMI");
                getCover.setImageResource(R.drawable.bumi);
                getDetail.setText("Bumi adalah sebuah novel karya Tere Liye, novel ini juga adalah bagian pertama dari seri Bumi/serial Dunia Paralel. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2014");
                break;;

            case "bulan" :
                getJudul.setText("BULAN");
                getCover.setImageResource(R.drawable.bulan);
                getDetail.setText("Bulan adalah sebuah novel karya Tere Liye, novel ini adalah bagian kedua dari seri Bumi/serial Dunia Paralel. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2015.");
                break;

            case "matahari" :
                getJudul.setText("MATAHARI");
                getCover.setImageResource(R.drawable.matahari);
                getDetail.setText("Matahari adalah sebuah novel karya Tere Liye, novel ini adalah bagian ketiga dari seri Bumi/serial Dunia Paralel. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2016.");
                break;

            case "bintang" :
                getJudul.setText("BINTANG");
                getCover.setImageResource(R.drawable.bintang);
                getDetail.setText("Bintang adalah sebuah novel karya Tere Liye, novel ini adalah bagian keempat dari seri Bumi/serial Dunia Paralel. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2017. ");
                break;

            case "komet" :
                getJudul.setText("KOMET");
                getCover.setImageResource(R.drawable.komet);
                getDetail.setText("Komet adalah seri keenam dalam serial novel Bumi karya Tere Liye. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2018");
                break;

            case "ceros" :
                getJudul.setText("CEROS & BATOZAR");
                getCover.setImageResource(R.drawable.ceroz);
                getDetail.setText("Ceroz dan Batozar adalah seri ke \"4,5\" dalam serial novel Bumi karya Tere Liye. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2018, bersamaan dengan terbitnya novel ke 5 dalam serial sama yang berjudul Komet.");
                break;

            case "minor" :
                getJudul.setText("KOMET MINOR");
                getCover.setImageResource(R.drawable.minor);
                getDetail.setText("Komet Minor adalah sebuah novel karya Tere Liye, novel ini adalah bagian ketujuh dari seri Bumi'/serial Dunia Paralel. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2019");
                break;

            case "nebula" :
                getJudul.setText("NEBULA");
                getCover.setImageResource(R.drawable.nebula);
                getDetail.setText("Nebula adalah sebuah novel karya Tere Liye, novel ini adalah bagian kedelapan dari seri Bumi/serial Dunia Paralel. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2020");
                break;

            case "selena" :
                getJudul.setText("SELENA");
                getCover.setImageResource(R.drawable.selena);
                getDetail.setText("Selena adalah sebuah novel karya Tere Liye, novel ini adalah bagian kedelapan dari seri Bumi/serial Dunia Paralel. Diterbitkan pertama kali oleh Gramedia Pustaka Utama tahun 2020.");
                break;
        }
    }
}
