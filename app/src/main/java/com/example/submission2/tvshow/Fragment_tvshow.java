package com.example.submission2.tvshow;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.submission2.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment_tvshow extends Fragment {
    private String[] dataJudul;
    private String[] dataGenre;
    private String[] dataPh;
    private String[] dataTahun;
    private String[] dataTanggal;
    private String[] dataOverview;
    private String[] dataCover;
    private String[] dataRating;
    private String[] dataWaktu;
    private String[] dataAktor;
    private RecyclerView rvTv;
    private ArrayList<tvShow> listT = new ArrayList<>();


    public Fragment_tvshow() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        prepare();
        addM();


        return inflater.inflate(R.layout.fragment_tvshow, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        rvTv = getActivity().findViewById(R.id.tvshow);
        rvTv.setHasFixedSize(true);

        showRecyclerCardView();
    }

    private void showRecyclerCardView(){
        rvTv.setLayoutManager(new LinearLayoutManager(this.getContext()));
        TvAdapter tvAdapter = new TvAdapter(listT);
        rvTv.setAdapter(tvAdapter);

        tvAdapter.setOnItemClickCallback(new TvAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(tvShow dataF) {
                showSelectedHero(dataF);
            }
        });
    }

    public Fragment_tvshow(ArrayList<tvShow> list) {
        this.listT = list;
    }

    private void showSelectedHero(tvShow dataF) {
        Intent moveWithObjectIntent = new Intent(this.getContext(), Detail_tvShow.class);
        moveWithObjectIntent.putExtra(Detail_tvShow.EXTRA_TV, dataF);
        startActivity(moveWithObjectIntent);
    }

    public void addM(){
        for (int i = 0; i < dataJudul.length; i++) {
            tvShow movie = new tvShow();
            movie.setJudul(dataJudul[i]);
            movie.setGenre(dataGenre[i]);
            movie.setPh(dataPh[i]);
            movie.setTahun(dataTahun[i]);
            movie.setTanggal(dataTanggal[i]);
            movie.setOverview(dataOverview[i]);
            movie.setPhoto(dataCover[i]);
            movie.setRating(dataRating[i]);
            movie.setWaktu(dataWaktu[i]);
            movie.setAktor(dataAktor[i]);

            listT.add(movie);
        }
    }

    private void prepare() {
        dataGenre = getResources().getStringArray(R.array.data_genre_tv);
        dataJudul = getResources().getStringArray(R.array.data_judul_tv);
        dataPh = getResources().getStringArray(R.array.data_ph_tv);
        dataTahun = getResources().getStringArray(R.array.data_tahun_tv);
        dataTanggal = getResources().getStringArray(R.array.data_tanggal_tv);
        dataOverview = getResources().getStringArray(R.array.data_overview_tv);
        dataCover = getResources().getStringArray(R.array.data_cover_tv);
        dataRating = getResources().getStringArray(R.array.data_rating_tv);
        dataWaktu = getResources().getStringArray(R.array.data_waktu_tv);
        dataAktor = getResources().getStringArray(R.array.data_aktor_tv);
    }
}

