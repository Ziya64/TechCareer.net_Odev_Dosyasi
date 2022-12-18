package com.example.odev6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.odev6.databinding.ActivityDetayliMainBinding;

public class DetayliMainActivity extends AppCompatActivity {
    private ActivityDetayliMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityDetayliMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        Binance b =(Binance) getIntent().getSerializableExtra("nesne");

        binding.toolbarDetayli.setTitle(b.getToolbarAd());

        binding.ivIcon.setImageResource(getResources()
                .getIdentifier(b.getResimAdi(),"drawable",getPackageName()));

        binding.ivGraf.setImageResource(getResources()
                .getIdentifier(b.getResimAdi2(),"drawable",getPackageName())  );

        binding.tvBuyuk.setText(b.getaBuyuk());
        binding.tvKucuk.setText(b.getaKucuk());
        binding.tvDeger.setText(b.getDeger());
        binding.tvYuzde.setText(b.getYuzde());










    }
}