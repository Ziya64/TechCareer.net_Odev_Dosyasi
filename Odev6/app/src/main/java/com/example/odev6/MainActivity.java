package com.example.odev6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import com.example.odev6.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.rv.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        ArrayList<Binance> BinanceListe = new ArrayList<>();
        Binance b1 =new Binance(1,"image2","BNB","BNB","grafi1","$447.70","+5.92%");
        Binance b2 =new Binance(2,"image1","CELR","Celer Network","grafi2","$0.145700","+13.75%");
        Binance b3 =new Binance(3,"image3","GALA","Gala","grafi3","$0.9970","+3.50%");
        Binance b4 =new Binance(4,"image4","SHIB","SHIBA INU","grafi4","$0.00029","+39.16%");
        Binance b5 =new Binance(5,"image5","BTC","Bitcoin","grafi5","54,439.22","+7.02%");
        Binance b6 =new Binance(6,"image6","ETH","Ethereum","grafi6","$3,524.02","+5.72%");
        Binance b7 =new Binance(7,"image8","ADA","Cardona","grafi7","$2.28","+6.13%");

        BinanceListe.add(b1);
        BinanceListe.add(b2);
        BinanceListe.add(b3);
        BinanceListe.add(b4);
        BinanceListe.add(b5);
        BinanceListe.add(b6);
        BinanceListe.add(b7);



        BinanceAdapter adapter = new BinanceAdapter(this,BinanceListe);
        binding.rv.setAdapter(adapter);





    }
}