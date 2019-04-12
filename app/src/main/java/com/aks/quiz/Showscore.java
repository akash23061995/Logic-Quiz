package com.aks.quiz;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;



public class Showscore extends AppCompatActivity {

    private AdView mAdView1;
    public String name1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showscore);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int value1 = extras.getInt("marks");
            String name=extras.getString("name");
            name1=name;
            TextView txtView =findViewById(R.id.scoremark);
            txtView.setText(""+value1);
            ImageView performance=findViewById(R.id.perfromarrow);
            ImageView man=findViewById(R.id.manimage);
            TextView showname=findViewById(R.id.showname);
    //.addTestDevice("98EFF4A3E405DF4E7411377577A4039A")
            MobileAds.initialize(this, getString(R.string.App_id));
            mAdView1 = findViewById(R.id.adView5);
            AdRequest adRequest1 = new AdRequest.Builder().build();
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



            switch (value1){
                case 0:
                    performance.setImageResource(R.drawable.poorarrow);
                    man.setImageResource(R.drawable.porrman);
                    showname.setText("Try Harder! "+name);
                    MediaPlayer ring= MediaPlayer.create(Showscore.this,R.raw.mariolose);
                    ring.start();
                    break;
                case 10:
                    performance.setImageResource(R.drawable.poorarrow);
                    man.setImageResource(R.drawable.porrman);
                    showname.setText("Try Harder! "+name);
                    MediaPlayer ring1= MediaPlayer.create(Showscore.this,R.raw.mariolose);
                    ring1.start();
                    break;
                case 20:
                    performance.setImageResource(R.drawable.poorarrow);
                    man.setImageResource(R.drawable.porrman);
                    showname.setText("Try Harder! "+name);
                    MediaPlayer ring2= MediaPlayer.create(Showscore.this,R.raw.lose);
                    ring2.start();
                    break;
                case 30:
                    performance.setImageResource(R.drawable.avaeragearrow);
                    man.setImageResource(R.drawable.averagemeter);
                    showname.setText("Keep it Up! "+name);
                    MediaPlayer ring3= MediaPlayer.create(Showscore.this,R.raw.lose);
                    ring3.start();
                    break;
                case 40:
                    performance.setImageResource(R.drawable.goodarrow);
                    man.setImageResource(R.drawable.goodman);
                    showname.setText("Nice Attempt! "+name);
                    MediaPlayer ring4= MediaPlayer.create(Showscore.this,R.raw.win1);
                    ring4.start();
                    break;
                case 50:
                    performance.setImageResource(R.drawable.goodarrow);
                    man.setImageResource(R.drawable.goodman);
                    showname.setText("Nice Attempt! "+name);
                    MediaPlayer ring5= MediaPlayer.create(Showscore.this,R.raw.win1);
                    ring5.start();
                    break;
                case 60:
                    performance.setImageResource(R.drawable.verygoodarrow);
                    man.setImageResource(R.drawable.verygoodman);
                    showname.setText("Well Done! "+name);
                    MediaPlayer ring6= MediaPlayer.create(Showscore.this,R.raw.clap1);
                    ring6.start();
                    break;
                case 70:
                    performance.setImageResource(R.drawable.verygoodarrow);
                    man.setImageResource(R.drawable.verygoodman);
                    showname.setText("Well Done! "+name);
                    MediaPlayer ring7= MediaPlayer.create(Showscore.this,R.raw.clap1);
                    ring7.start();
                    break;
                case 80:
                    performance.setImageResource(R.drawable.excelllentarrow);
                    man.setImageResource(R.drawable.excellentman);
                    showname.setText("Great Score! "+name);
                    MediaPlayer ring8= MediaPlayer.create(Showscore.this,R.raw.clap2);
                    ring8.start();
                    break;
                case 90:
                    performance.setImageResource(R.drawable.excelllentarrow);
                    man.setImageResource(R.drawable.excellentman);
                    showname.setText("Great Score! "+name);
                    MediaPlayer ring9= MediaPlayer.create(Showscore.this,R.raw.clap2);
                    ring9.start();
                    break;
                case 100:
                    performance.setImageResource(R.drawable.out1);
                    man.setImageResource(R.drawable.outstandingman);
                    showname.setText("Salute to You! "+name);
                    MediaPlayer ring10= MediaPlayer.create(Showscore.this,R.raw.outstanding);
                    ring10.start();
                    break;

            }
        }




    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(Showscore.this,Startquiz.class);
        startActivity(i);
        android.os.Process.killProcess(android.os.Process.myPid());
        // This above line close correctly
    }
    public void home(View view)
    {
        Intent i=new Intent(Showscore.this,Startquiz.class);
        startActivity(i);
        android.os.Process.killProcess(android.os.Process.myPid());

    }
    public void tryagain(View view)
    {
        Intent i= new Intent(Showscore.this,Quizactivity.class);
        i.putExtra("message",name1);
        startActivity(i);
        android.os.Process.killProcess(android.os.Process.myPid());

    }
}

