package com.example.submission2.tvshow;

import android.os.Parcel;
import android.os.Parcelable;

class tvShow implements Parcelable {

    private String judul;
    private String genre;
    private String ph;
    private String tahun;
    private String tanggal;
    private String overview;
    private String photo;
    private String rating;
    private String waktu;
    private String aktor;

    public tvShow() {

    }


    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPh() {
        return ph;
    }

    public void setPh(String ph) {
        this.ph = ph;
    }

    public String getTahun() {
        return tahun;
    }

    public void setTahun(String tahun) {
        this.tahun = tahun;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getAktor() {
        return aktor;
    }

    public void setAktor(String aktor) {
        this.aktor = aktor;
    }


    protected tvShow(Parcel in) {
        judul = in.readString();
        genre = in.readString();
        ph = in.readString();
        tahun = in.readString();
        tanggal = in.readString();
        overview = in.readString();
        photo = in.readString();
        rating = in.readString();
        waktu = in.readString();
        aktor = in.readString();
    }

    public static final Creator<tvShow> CREATOR = new Creator<tvShow>() {
        @Override
        public tvShow createFromParcel(Parcel in) {
            return new tvShow(in);
        }

        @Override
        public tvShow[] newArray(int size) {
            return new tvShow[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(judul);
        parcel.writeString(genre);
        parcel.writeString(ph);
        parcel.writeString(tahun);
        parcel.writeString(tanggal);
        parcel.writeString(overview);
        parcel.writeString(photo);
        parcel.writeString(rating);
        parcel.writeString(waktu);
        parcel.writeString(aktor);
    }
}
