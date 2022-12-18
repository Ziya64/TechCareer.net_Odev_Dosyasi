package com.example.odev6;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.odev6.databinding.CardTasarimBinding;

import java.util.List;

public class BinanceAdapter extends RecyclerView.Adapter<BinanceAdapter.CardTasarimTutucu> {
    private Context bContext;
    private List<Binance> binanceListesi;

    public BinanceAdapter(Context bContext, List<Binance> binanceListesi) {
        this.bContext = bContext;
        this.binanceListesi = binanceListesi;
    }

    @NonNull
    @Override
    public CardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardTasarimBinding binding =
                CardTasarimBinding.inflate(LayoutInflater.from(bContext),parent,false);
        return new CardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardTasarimTutucu holder, int position) {

        Binance binance = binanceListesi.get(position);
        CardTasarimBinding t = holder.binding;
        t.imageViewIcon.setImageResource(bContext.getResources().getIdentifier(binance.getResimAdi(),"drawable",bContext.getPackageName()));
        t.imageViewGraf.setImageResource(bContext.getResources().getIdentifier(binance.getResimAdi2(),"drawable",bContext.getPackageName()));

        t.textViewBuyuk.setText(binance.getaBuyuk());
        t.textViewDeger.setText(binance.getDeger());
        t.textViewKucuk.setText(binance.getaKucuk());
        t.textViewYuzde.setText(binance.getYuzde());

        t.cardWiewBinance.setOnClickListener(view -> {
            Intent intent = new Intent(bContext,DetayliMainActivity.class);
            intent.putExtra("nesne",binance);
            bContext.startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return binanceListesi.size();
    }

    public  class  CardTasarimTutucu extends RecyclerView.ViewHolder{
        private CardTasarimBinding binding;
        public CardTasarimTutucu(CardTasarimBinding binding){
            super(binding.getRoot());
            this.binding =binding;
        }

    }






}
