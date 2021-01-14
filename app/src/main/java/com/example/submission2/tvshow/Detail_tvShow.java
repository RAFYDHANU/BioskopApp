package com.example.submission2.tvshow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.submission2.R;

public class  Detail_tvShow extends AppCompatActivity {

    public static final String EXTRA_TV = "extra_tv";

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
        setContentView(R.layout.activity_detail_tv_show);

        tvJudul = findViewById(R.id.tv_judul);
        tvGenre = findViewById(R.id.tv_genre);
        tvPh = findViewById(R.id.tv_ph);
        tvTanggal = findViewById(R.id.tv_tanggal);
        tvOverview = findViewById(R.id.tv_deskripsi);
        imgCover = findViewById(R.id.img_photo);
        tvRating = findViewById(R.id.tv_rating);
        tvWaktu = findViewById(R.id.tv_time);
        tvAktor = findViewById(R.id.tv_aktor);

        tvShow tvShow = getIntent().getParcelableExtra(EXTRA_TV);
        assert tvShow != null;
        tvJudul.setText(tvShow.getJudul());
        tvGenre.setText(tvShow.getGenre());
        tvPh.setText(tvShow.getPh());
        tvTanggal.setText(tvShow.getTanggal());
        tvOverview.setText(tvShow.getOverview());

        Glide.with(this)
                .load(tvShow.getPhoto())
                .apply(new RequestOptions().override(450, 650))
                .into(imgCover);

        tvRating.setText(tvShow.getRating());
        tvWaktu.setText(tvShow.getWaktu());
        tvAktor.setText(tvShow.getAktor());
    }
}
