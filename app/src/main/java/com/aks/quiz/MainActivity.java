package com.aks.quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {
   public String name;
    private AdView mAdView1,mAdView2,mAdView3,mAdView4;
   public InterstitialAd mIntersticialAd;
    @Override
     protected
    void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, getString(R.string.App_id));

        //  mIntersticialAd =new InterstitialAd(this);
        //     mIntersticialAd.setAdUnitId("ca-app-pub-3940256099942544~1033173712");
        //mIntersticialAd.setAdUnitId("ca-app-pub-5698279070549046/3128651448");
        //mIntersticialAd.loadAd(new AdRequest.Builder().build());
        //mIntersticialAd.show();

        mAdView1 = findViewById(R.id.adView);
        mAdView2=findViewById(R.id.adView1);
        mAdView3=findViewById(R.id.adView2);
        mAdView4=findViewById(R.id.adView4);
       //.addTestDevice("98EFF4A3E405DF4E7411377577A4039A")
        //mAdView.setAdSize(AdSize.FULL_BANNER);
        //mAdView.setAdUnitId(getString(R.string.bannerappid));
        AdRequest adRequest1 = new AdRequest.Builder().build();
        AdRequest adRequest2 = new AdRequest.Builder().build();
        AdRequest adRequest3 = new AdRequest.Builder().build();
        AdRequest adRequest4= new AdRequest.Builder().build();
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
        mAdView2.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
            }
            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }
        });
        mAdView2.loadAd(adRequest2);
        mAdView3.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
            }
            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }
        });
        mAdView3.loadAd(adRequest3);
        mAdView4.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
            }
            @Override
            public void onAdOpened() {
                super.onAdOpened();
            }
        });
        mAdView4.loadAd(adRequest4);
    }
    @Override
    public void onPause() {
        if (mAdView1 != null) {
            mAdView1.pause();
        }
        super.onPause();
    }
    @Override
    public void onResume() {
        super.onResume();
        if (mAdView1 != null) {
            mAdView1.resume();
        }
    }
    @Override
    public void onDestroy() {
        if (mAdView1 != null) {
            mAdView1.destroy();
        }
        super.onDestroy();
    }

public void startAnotherActivity(View view)
{
    EditText nameview=(EditText)findViewById(R.id.nameedittext);
    name =nameview.getText().toString();

    Intent i= new Intent(MainActivity.this,Quizactivity.class);
    i.putExtra("message",name);
    startActivity(i);
}



}
