package com.example.submission2.MOVIE;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.submission2.R;

public class Detail_Movie extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";
    private ProgressBar progressBar;


    TextView tvJudul;
    TextView tvGenre;
    TextView tvPh;
    TextView tvTanggal;
    TextView tvOverview;
    ImageView imgCover;
    TextView tvRating;
    TextView tvWaktu;
    TextView tvAktor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__movie);

        tvJudul = findViewById(R.id.tv_judul);
        tvGenre = findViewById(R.id.tv_genre);
        tvPh = findViewById(R.id.tv_ph);
        tvTanggal = findViewById(R.id.tv_tanggal);
        tvOverview = findViewById(R.id.tv_deskripsi);
        imgCover = findViewById(R.id.img_photo);
        tvRating = findViewById(R.id.tv_rating);
        tvWaktu = findViewById(R.id.tv_time);
        tvAktor = findViewById(R.id.tv_aktor);

//        progressBar = findViewById(R.id.progressBarShowDetail);
//
//
//        progressBar.setVisibility(View.VISIBLE);
//
//        final Handler handler = new Handler();
//
//        new Thread(new Runnable() {
//            public void run() {
//                try {
//                    Thread.sleep(5000);
//                } catch (Exception e) {
//                }
//
//                handler.post(new Runnable() {
//                    public void run() {
//                        Movie tvShow = getIntent().getParcelableExtra(EXTRA_MOVIE);


        Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);
        assert movie != null;
        tvJudul.setText(movie.getJudul());
        tvGenre.setText(movie.getGenre());
        tvPh.setText(movie.getPh());
        tvTanggal.setText(movie.getTanggal());
        tvOverview.setText(movie.getOverview());

        Glide.with(Detail_Movie.this)
                .load(movie.getPhoto())
                .apply(new RequestOptions().override(450, 650))
                .into(imgCover);

        tvRating.setText(movie.getRating());
        tvWaktu.setText(movie.getWaktu());
        tvAktor.setText(movie.getAktor());


//        progressBar.setVisibility(View.INVISIBLE);
    }
}