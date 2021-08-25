package com.example.viewpager2;

public class Data {
    private String isim;
    private String soyad;
    private String yas;

    public Data(String isim, String soyad, String yas) {
        this.isim = isim;
        this.soyad = soyad;
        this.yas = yas;
    }

    public Data() {
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }
}
