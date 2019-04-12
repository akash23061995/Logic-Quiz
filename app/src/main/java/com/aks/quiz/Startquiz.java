package com.aks.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class Startquiz extends AppCompatActivity {
    private AdView mAdView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startquiz);

        MobileAds.initialize(this, getString(R.string.App_id));
        mAdView1 = findViewById(R.id.adView3);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        TextView t2=findViewById(R.id.t2);
        t2.setText("◼ This is a logic intelligence test \n◼ You will be given 10 question\n◼ On Every right answer 10 marks\n◼ Time limit is there for every level question\n◼ wrong answer or time limit\n exceeding will finish the game ");
        mAdView1.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
            }
            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }
        });
        mAdView1.loadAd(adRequest1);


    }
 public void startquiz(View view) {


         Intent i = new Intent(Startquiz.this, MainActivity.class);
         startActivity(i);
     }
 }

