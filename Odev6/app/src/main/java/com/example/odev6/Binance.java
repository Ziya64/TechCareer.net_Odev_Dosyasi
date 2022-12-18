package com.example.odev6;

import java.io.Serializable;

public class Binance implements Serializable {
    private int id;
    private String resimAdi;
    private String aBuyuk;
    private String aKucuk;
    private String ResimAdi2;
    private String deger;
    private String yuzde;
    private String toolbarAd;

    public Binance(int id, String resimAdi, String aBuyuk, String aKucuk, String resimAdi2, String deger, String yuzde) {
        this.id = id;
        this.resimAdi = resimAdi;
        this.aBuyuk = aBuyuk;
        this.aKucuk = aKucuk;
        ResimAdi2 = resimAdi2;
        this.deger = deger;
        this.yuzde = yuzde;
        this.toolbarAd = toolbarAd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResimAdi() {
        return resimAdi;
    }

    public void setResimAdi(String resimAdi) {
        this.resimAdi = resimAdi;
    }

    public String getaBuyuk() {
        return aBuyuk;
    }

    public void setaBuyuk(String aBuyuk) {
        this.aBuyuk = aBuyuk;
    }

    public String getaKucuk() {
        return aKucuk;
    }

    public void setaKucuk(String aKucuk) {
        this.aKucuk = aKucuk;
    }

    public String getResimAdi2() {
        return ResimAdi2;
    }

    public void setResimAdi2(String resimAdi2) {
        ResimAdi2 = resimAdi2;
    }

    public String getDeger() {
        return deger;
    }

    public void setDeger(String deger) {
        this.deger = deger;
    }

    public String getYuzde() {
        return yuzde;
    }

    public void setYuzde(String yuzde) {
        this.yuzde = yuzde;
    }

    public String getToolbarAd() {
        return toolbarAd;
    }

    public void setToolbarAd(String toolbarAd) {
        this.toolbarAd = toolbarAd;
    }
}
