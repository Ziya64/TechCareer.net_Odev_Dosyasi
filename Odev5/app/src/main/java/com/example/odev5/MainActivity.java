package com.example.odev5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.odev5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

private ActivityMainBinding binding;
    TextView hesapEkrani;
    Double ilkSayi;
    String islemDurum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());




      binding.button0.setOnClickListener(view -> {
          TIKLA_NUMARA(0);
      });

        binding.button1.setOnClickListener(view -> {

            TIKLA_NUMARA(1);

        });
        binding.button2.setOnClickListener(view -> {
            TIKLA_NUMARA(2);
        });
        binding.button3.setOnClickListener(view -> {
            TIKLA_NUMARA(3);
        });
        binding.button4.setOnClickListener(view -> {
            TIKLA_NUMARA(4);
        });
        binding.button5.setOnClickListener(view -> {
            TIKLA_NUMARA(5);
        });
        binding.button6.setOnClickListener(view -> {
            TIKLA_NUMARA(6);
        });
        binding.button7.setOnClickListener(view -> {
            TIKLA_NUMARA(7);
        });
        binding.button8.setOnClickListener(view -> {
            TIKLA_NUMARA(8);
        });
        binding.button9.setOnClickListener(view -> {
            TIKLA_NUMARA(9);
        });
        binding.buttonClear.setOnClickListener(view -> {
            TIKLA_SEMBOL("sifirla");
        });
        binding.buttonTopla.setOnClickListener(view -> {
            TIKLA_SEMBOL("+");
        });
        binding.buttonEsittir.setOnClickListener(view -> {
            TIKLA_SEMBOL("=");
        });








    }

    public void TIKLA_NUMARA(int sayi)
    {
        if(hesapEkrani.getText().toString() == "0"){
            hesapEkrani.setText("");
        }
        else if(hesapEkrani.getText().toString() == "+" )
        {
            hesapEkrani.setText("");
        }
        hesapEkrani.setText(hesapEkrani.getText() + String.valueOf(sayi));
    }



    public void TIKLA_SEMBOL(String sembol)
    {
        switch (sembol)
        {
            default:{
                ilkSayi = Double.parseDouble(hesapEkrani.getText().toString());
                hesapEkrani.setText(sembol);
                islemDurum = sembol;
            }
            break;
            case "sifirla":
            {
                ilkSayi = 0.0;
                hesapEkrani.setText("0");
                islemDurum = "0";
            }
            case "=":
            {
                if(hesapEkrani.getText().toString() == "+" )
                {
                    hesapEkrani.setText(sembol);
                    islemDurum = sembol;
                }
                else
                {
                    switch (islemDurum)
                    {
                        default:
                        {
                            hesapEkrani.setText(ilkSayi.toString());
                        }
                        break;
                        case "+":
                        {
                            ilkSayi = ilkSayi + Double.parseDouble(hesapEkrani.getText().toString());
                            hesapEkrani.setText(ilkSayi.toString());
                        }
                        break;



                    }
                }


            }
            break;
            case ",":
            {

            }
            break;




        }
    }



}