package com.example.probolinggo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.probolinggo.Adapters.ProbolinggoAdapter;
import com.example.probolinggo.Models.ProbolinggoModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView probRv;
    ArrayList<ProbolinggoModel> probolinggoModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        probRv = findViewById(R.id.probolinggo_rv);
        probolinggoModels = new ArrayList<>();

        probolinggoModels.add(new ProbolinggoModel("Wisata BJBR", "Sebagai objek wisata favorit, BJBR (BeeJay Bakau Resort) Probolinggo berada di urutan teratas yang kami rekomendasikan untuk dikunjungi bareng keluarga.\n" +
                "Tempat ini tidak jauh dari pusat kota dengan berbagai fasilitas yang cukup beragam di dalamnya, mulai dari resort, kolam air asin hingga beberapa spot untuk berfoto ria."
                , R.drawable.bjbr));
        probolinggoModels.add(new ProbolinggoModel("Air Terjun Madakaripura", "Air terjun Madakaripura merupakan air terjun tertinggi di Pulau Jawa dan tertinggi kedua di Indonesia dengan ketinggian berkisar 200 M, terletak di kawasan lereng Gunung Bromo.\n" +
                "Lokasi: Branggah, Sapih, Lumbang, Sapih, Lumbang, Probolinggo, Jawa Timur."
                        , R.drawable.madakaripura));
        probolinggoModels.add(new ProbolinggoModel("Pantai Bentar Probolinggo", "Hanya berjarak sektar 10 km dari pusat Kota Probolinggo, kamu bisa mencapai lokasi wisata ini dalam waktu sekitar 25 menit.\n " +
                "Ada banyak spot cantik yang bisa kamu explore untuk menambah koleksi foto liburanmu. Mulai dari dermaga pantai hingga hutan bakau."
                , R.drawable.pantaibentar));

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        RecyclerView.LayoutManager probolinggoLayout = layoutManager;
        probRv.setLayoutManager(probolinggoLayout);

        ProbolinggoAdapter probolinggoAdapter = new ProbolinggoAdapter(this, probolinggoModels);
        probRv.setAdapter(probolinggoAdapter);
    }
}
