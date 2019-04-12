package com.aks.quiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;
import android.content.DialogInterface;

import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;

import java.util.Random;

public class Quizactivity extends AppCompatActivity implements RewardedVideoAdListener {
    public int score;
    boolean secondchance=true,reward;
   public  RewardedVideoAd mRewardedVideoAd;
    int n = 1;
    int rand1, rand2, rand3, rand4, rand5, rand6, rand7, rand8, rand9, rand10;
   String yourname;
    CountDownTimer waitTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizactivity);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String value1 = extras.getString("message");
//get the value based on the key
  yourname=value1;
            TextView txtView = (TextView) findViewById(R.id.nameplayer);
            txtView.setText(value1);
        }
        Random r = new Random();
        rand1 = r.nextInt(10000);
        rand2 = r.nextInt(10000);
        rand3 = r.nextInt(10000);
        rand4 = r.nextInt(10000);
        rand5 = r.nextInt(10000);
        rand6 = r.nextInt(10000);
        rand7 = r.nextInt(10000);
        rand8 = r.nextInt(10000);
        rand9 = r.nextInt(10000);
        rand10 = r.nextInt(10000);
        displayQuestion(n);
        timeLeft(1);

        MobileAds.initialize(this, getString(R.string.App_id));

        mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(this);
        mRewardedVideoAd.setRewardedVideoAdListener(this);


    }
    private void loadRewardedVideoAd() {
        mRewardedVideoAd.loadAd(getString(R.string.rewardedvideo),
                new AdRequest.Builder().build());
    }



    public void displayQuestion(int numberOfQuestion) {
        TextView question = (TextView) findViewById(R.id.question);
        RadioButton option1 = (RadioButton) findViewById(R.id.option1);
        RadioButton option2 = (RadioButton) findViewById(R.id.option2);
        RadioButton option3 = (RadioButton) findViewById(R.id.option3);
        RadioButton option4 = (RadioButton) findViewById(R.id.option4);
        TextView queno = (TextView) findViewById(R.id.quesno);
        switch (numberOfQuestion) {
            case 1:
                switch (rand1 / 1000) {
                    case 0:
                        question.setText("2,6,1,3,0.5,1.5, ? What is the missing number?");
                        option1.setText("4.5");
                        option2.setText("0.25");
                        option3.setText("0.15");
                        option4.setText("0.30");
                        queno.setText("Question 1");
                        break;
                    case 1:
                        question.setText("2,6,18,54,??? Which comes next in the pattern?");
                        option1.setText("108");
                        option2.setText("216");
                        option3.setText("720");
                        option4.setText("162");
                        queno.setText("Question 1");
                        break;
                    case 2:
                        question.setText("Which one of the following is not a prime number?");
                        option1.setText("31");
                        option2.setText("61");
                        option3.setText("91");
                        option4.setText("71");
                        queno.setText("Question 1");
                        break;
                    case 3:
                        question.setText("The sum of first five prime numbers is:");
                        option1.setText("11");
                        option2.setText("28");
                        option3.setText("18");
                        option4.setText("26");
                        queno.setText("Question 1");
                        break;
                    case 4:
                        question.setText("The smallest 3 digit prime number is:");
                        option1.setText("101");
                        option2.setText("103");
                        option3.setText("109");
                        option4.setText("113");
                        queno.setText("Question 1");
                        break;
                    case 5:
                        question.setText("48 is 60% of what number?");
                        option1.setText("60");
                        option2.setText("72");
                        option3.setText("80");
                        option4.setText("64");
                        queno.setText("Question 1");
                        break;
                    case 6:
                        question.setText("If a and b are odd numbers,then which of the following is even?");
                        option1.setText("a+b");
                        option2.setText("ab");
                        option3.setText("a+b+1");
                        option4.setText("ab+2");
                        queno.setText("Question 1");
                        break;
                    case 7:
                        question.setText("The number of even numbers between 1 and 31 is:");
                        option1.setText("16");
                        option2.setText("13");
                        option3.setText("14");
                        option4.setText("15");
                        queno.setText("Question 1");
                        break;
                    case 8:
                        question.setText("666 ÷ 6 ÷ 3 = ? ");
                        option1.setText("37");
                        option2.setText("111");
                        option3.setText("333");
                        option4.setText("11");
                        queno.setText("Question 1");
                        break;
                    case 9:
                        question.setText("7589 - ? = 3434 ");
                        option1.setText("4242");
                        option2.setText("11023");
                        option3.setText("4155");
                        option4.setText("1123");
                        queno.setText("Question 1");
                        break;

                }
                break;
            case 2:
                switch (rand2 / 1000) {
                    case 0:
                        question.setText("A number when divide by 6 leaves a remainder 3.When the square of the number is divided by 6,the remainder is:");
                        option1.setText("3");
                        option2.setText("6");
                        option3.setText("2");
                        option4.setText("1");
                        queno.setText("Question 2");
                        break;
                    case 1:
                        question.setText("On dividing a number by 5, we get 3 as remainder. What will the remainder when the square of the this number is divided by 5 ?");
                        option1.setText("2");
                        option2.setText("7");
                        option3.setText("4");
                        option4.setText("0");
                        queno.setText("Question 2");
                        break;
                    case 2:
                        question.setText("How many prime numbers are less than 50?");
                        option1.setText("16");
                        option2.setText("18");
                        option3.setText("14");
                        option4.setText("15");
                        queno.setText("Question 2");
                        break;
                    case 3:
                        question.setText("If a warehouse received 250 orders in April and 300 in May, what was the percentage of increase?");
                        option1.setText("30");
                        option2.setText("40");
                        option3.setText("25");
                        option4.setText("20");
                        queno.setText("Question 2");
                        break;
                    case 4:
                        question.setText("How many perfect squares between 50 and 150?");
                        option1.setText("6");
                        option2.setText("5");
                        option3.setText("7");
                        option4.setText("4");
                        queno.setText("Question 2");
                        break;
                    case 5:
                        question.setText("12 is 25 percent of what number?");
                        option1.setText("36");
                        option2.setText("108");
                        option3.setText("72");
                        option4.setText("48");
                        queno.setText("Question 2");
                        break;
                    case 6:
                        question.setText("What is 7/12 as a percent?");
                        option1.setText("56.4");
                        option2.setText("57.5");
                        option3.setText("58.3");
                        option4.setText("58.4");
                        queno.setText("Question 2");
                        break;
                    case 7:
                        question.setText("What is 17 out of 20 as a percentage?");
                        option1.setText("85");
                        option2.setText("86");
                        option3.setText("82");
                        option4.setText("87");
                        queno.setText("Question 2");
                        break;
                    case 8:
                        question.setText("36 is 12 percent of what number?");
                        option1.setText("216");
                        option2.setText("300");
                        option3.setText("330");
                        option4.setText("408");
                        queno.setText("Question 2");
                        break;
                    case 9:
                        question.setText("22 is 44% of what number?");
                        option1.setText("36");
                        option2.setText("50");
                        option3.setText("72");
                        option4.setText("66");
                        queno.setText("Question 2");
                        break;
                }
                break;
            case 3:
                switch (rand3 / 1000) {
                    case 0:
                        question.setText("What smallest number should be added to 4456 so that the sum is completely divisible by 6?");
                        option1.setText("1");
                        option2.setText("2");
                        option3.setText("3");
                        option4.setText("4");
                        queno.setText("Question 3");
                        break;
                    case 1:
                        question.setText("The difference of the squares of two consecutive even integers is divisible by which of the following integers ?");
                        option1.setText("4");
                        option2.setText("3");
                        option3.setText("6");
                        option4.setText("7");
                        queno.setText("Question 3");
                        break;
                    case 2:
                        question.setText("The largest 4 digit number exactly divisible by 88 is:");
                        option1.setText("9956");
                        option2.setText("9984");
                        option3.setText("9936");
                        option4.setText("9944");
                        queno.setText("Question 3");
                        break;
                    case 3:
                        question.setText("If n is a natural number, then (n\u00B2 + 6n) is always divisible by:");
                        option1.setText("6 only");
                        option2.setText("12 only");
                        option3.setText("6 and 12 both");
                        option4.setText("18 only");
                        queno.setText("Question 3");
                        break;
                    case 4:
                        question.setText("When a number is divided by 13,the remainder is 11.When the same number is divided by 17,then remainder is 9.What is the number ? ");
                        option1.setText("339");
                        option2.setText("345");
                        option3.setText("349");
                        option4.setText("371");
                        queno.setText("Question 3");
                        break;
                    case 5:
                        question.setText("If x and y are positive integers such that (3x + 7y) is a multiple of 11, then which of the following will be divisible by 11 ?  ");
                        option1.setText("9x+4y");
                        option2.setText("4x-9y");
                        option3.setText("4x+6y");
                        option4.setText("x+y+4");
                        queno.setText("Question 3");
                        break;
                    case 6:
                        question.setText("If 60% of 3/5 of a number is 36, then the number is:");
                        option1.setText("100");
                        option2.setText("80");
                        option3.setText("72");
                        option4.setText("90");
                        queno.setText("Question 3");
                        break;
                    case 7:
                        question.setText("The difference of the squares of two consecutive odd integers is divisible by which of the following integers?");
                        option1.setText("3");
                        option2.setText("6");
                        option3.setText("7");
                        option4.setText("8");
                        queno.setText("Question 3");
                        break;
                    case 8:
                        question.setText("A number was divided successively in order by 4, 5 and 6. The remainders were respectively 2, 3 and 4. The number is:");
                        option1.setText("214");
                        option2.setText("476");
                        option3.setText("954");
                        option4.setText("1608");
                        queno.setText("Question 3");
                        break;
                    case 9:
                        question.setText("On dividing a number by 68,we get 269 as quotient and 0 as remainder.On dividing the same number by 67,what will the remainder?");
                        option1.setText("0");
                        option2.setText("2");
                        option3.setText("1");
                        option4.setText("3");
                        queno.setText("Question 3");
                        break;

                }
                break;
            case 4:
                switch (rand4/1000) {
                    case 0:
                        question.setText("If a light flashes every 6 seconds, how many times will it flash in ¾ of an hour?");
                        option1.setText("450");
                        option2.setText("451");
                        option3.setText("350");
                        option4.setText("425");
                        queno.setText("Question 4");
                        break;
                    case 1:
                        question.setText("If 20% of a = b, then b% of 20 is the same as :");
                        option1.setText("6% of a");
                        option2.setText("10% of a");
                        option3.setText("8% of a");
                        option4.setText("4% of a");
                        queno.setText("Question 4");
                        break;
                    case 2:
                        question.setText("A clock is set right at 8 a.m. The clock gains 10 minutes in 24 hours will be the true time when the clock indicates 1 p.m. on the following day?");
                        option1.setText("45 min. past 12.");
                        option2.setText("47 min. past 12.");
                        option3.setText("48 min. past 12.");
                        option4.setText("46 min. past 12.");
                        queno.setText("Question 4");
                        break;
                    case 3:
                        question.setText("If sin 3A = cos (A – 26°), where 3A is an acute angle then the value of A is");
                        option1.setText("23");
                        option2.setText("26");
                        option3.setText("28");
                        option4.setText("29");
                        queno.setText("Question 4");
                        break;
                    case 4:
                        question.setText("\u221A3 cosec 20° – sec 20° = ?");
                        option1.setText("4");
                        option2.setText("sin20°/sin40°");
                        option3.setText("2");
                        option4.setText(" 4sin 20°/sin 40°");
                        queno.setText("Question 4");
                        break;
                    case 5:
                        question.setText("If A = tan 11° tan 29°, B = 2 cot 61° cot 79°, then:");
                        option1.setText("A = 2B");
                        option2.setText("2A = B");
                        option3.setText("A = – 2B");
                        option4.setText("2A = – B");
                        queno.setText("Question 4");
                        break;
                    case 6:
                        question.setText("If sin 17° = x/y then the value of (sec 17° – sin 73°) is");
                        option1.setText("y\u00B2/x\u221Ay\u00B2-x\u00B2");
                        option1.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option2.setText("x\u00B2/y\u221Ax\u00B2-y\u00B2");
                        option2.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option3.setText("x²/y√y²-x²");
                        option3.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option4.setText("y\u00B2/x\u221Ax\u00B2-y\u00B2");
                        option4.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        queno.setText("Question 4");
                        break;
                    case 7:
                        question.setText("If x sin 45° = y cosec 30°, then x\u2074/y\u2074  is equal to:");
                        option1.setText("6\u00B3");
                        option2.setText("8\u00B3");
                        option3.setText("7\u00B3");
                        option4.setText("4\u00B3");
                        queno.setText("Question 4");
                        break;
                    case 8:
                        question.setText("If cos Θ + sin Θ = \u221A2cos Θ, then cos Θ – sin Θ is");
                        option1.setText("\u221A2sin Θ");
                        option2.setText("\u221A2tan Θ");
                        option3.setText("-\u221A2cos Θ");
                        option4.setText("-\u221A2sin Θ");
                        queno.setText("Question 4");
                        break;
                    case 9:
                        question.setText("If cosΘ + secΘ = 2 ,then the value of  cos\u2076\u2078Θ  +  sec\u2076\u2078Θ  equal to");
                        option1.setText("2");
                        option2.setText("0");
                        option3.setText("3");
                        option4.setText("68");
                        queno.setText("Question 4");
                        break;

                }
                break;
            case 5:
                switch (rand5 / 1000) {
                    case 0:
                        question.setText("A wheel makes 12 revolutions per min. The angle in radian described by a spoke of the wheel in 1 s is:");
                        option1.setText("5π/2");
                        option2.setText("4π/5");
                        option3.setText("3π/5");
                        option4.setText("2π/5");
                        queno.setText("Question 5");
                        break;
                    case 1:
                        question.setText("If the arms of one angles are respectively parallel to the arms of another angle, then the two angles are");
                        option1.setText("Neither equal nor supplementary");
                        option1.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option2.setText("Either equal or supplementary");
                        option2.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option3.setText("Equal but not supplementary");
                        option3.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option4.setText("Not equal but supplementary");
                        option4.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        queno.setText("Question 5");
                        break;
                    case 2:
                        question.setText("In a right angled triangle, the circumcentre of the triangle lies.");
                        option1.setText("Inside the triangle");
                        option1.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option2.setText("Outside the triangle");
                        option2.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option3.setText("On the midpoint of hypotenous");
                        option3.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option4.setText("On one vertex");
                        option4.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        queno.setText("Question 5");
                        break;
                    case 3:
                        question.setText("The radius of a wheel is 21 cm. How many revolutions will it make in travelling 924 meters?(π = 22/7)");
                        option1.setText("700");
                        option2.setText("200");
                        option3.setText("7");
                        option4.setText("110");
                        queno.setText("Question 5");
                        break;
                    case 4:
                        question.setText("The length of the chord of a circle is 10 cm and perpendicular distance between the centre and the chord is 12 cm. then the radius of the circle is:");
                        option1.setText("13");
                        option2.setText("15");
                        option3.setText("18");
                        option4.setText("21");
                        queno.setText("Question 5");
                        break;
                    case 5:
                        question.setText("The distance between two parallel chords of length 10 cm each in a circle of diameter 26 cm is:");
                        option1.setText("12");
                        option2.setText("24");
                        option3.setText("32");
                        option4.setText("38");
                        queno.setText("Question 5");
                        break;
                    case 6:
                        question.setText("The chord AB of a circle of centre O subtends an angle Θ with tangent at A to the circle. ∠ABO is");
                        option1.setText("Θ");
                        option2.setText("90+Θ");
                        option3.setText("90-Θ");
                        option4.setText("2(π-Θ)");
                        queno.setText("Question 5");
                        break;
                    case 7:
                        question.setText("In a circle with centre O, AB and CD are two diameters perpendicular to each other. The length of chord AC is:");
                        option1.setText("1/\u221A2AB");
                        option2.setText("\u221A2AB");
                        option3.setText("2AB");
                        option4.setText("1/2AB");
                        queno.setText("Question 5");
                        break;
                    case 8:
                        question.setText("A rectangle of area 48 cm\u00B2 is inscribed inside a circle of radius 5 cm. What will be the perimeter (in cm) of the rectangle?");
                        option1.setText("25");
                        option2.setText("28");
                        option3.setText("32");
                        option4.setText("30");
                        queno.setText("Question 5");
                        break;
                    case 9:
                        question.setText("In ΔABC, ∠ABC = 70°, ∠BCA = 40°. O is the point of intersection of the perpendicular bisectors of the sides, then the angle ∠BOC is");
                        option1.setText("100");
                        option2.setText("110");
                        option3.setText("120");
                        option4.setText("140");
                        queno.setText("Question 5");
                        break;

                }
                break;
            case 6:
                switch (rand6 / 1000) {
                    case 0:
                        question.setText("A train 110 m long is running with speed of 60 km/hr .In what time will it pass a man who is running at 6 km/hr in the direction opposite to that in which the train is going?");
                        option1.setText("4 sec");
                        option2.setText("5 sec");
                        option3.setText("6 sec");
                        option4.setText("10 sec");
                        queno.setText("Question 6");
                        break;
                    case 1:
                        question.setText(" How many seconds will a 500 m long train take to cross a man walking with a speed of 3 km/hr in the direction of the moving train if the speed of the train is 63 km/hr? ");
                        option1.setText("25");
                        option2.setText("20");
                        option3.setText("30");
                        option4.setText("45");
                        queno.setText("Question 6");
                        break;
                    case 2:
                        question.setText("A train moves past a telegraph post and a bridge 264 m long in 8 seconds and 20 seconds respectively. What is the speed of the train?");
                        option1.setText("69.5 km/hr");
                        option2.setText("79.2 km/hr");
                        option3.setText("80.5 km/hr");
                        option4.setText("81.4 km/hr");
                        queno.setText("Question 6");
                        break;
                    case 3:
                        question.setText("A train speeds past pole in 15 seconds and a platform 100 m long in 25 seconds ,its length is:");
                        option1.setText("150 m");
                        option2.setText("100 m");
                        option3.setText("200 m");
                        option4.setText("50 m");
                        queno.setText("Question 6");
                        break;
                    case 4:
                        question.setText("A 300 m long train crosses a platform in 39 seconds while it crosses a signal pole in 18 seconds .What is the length of the platform?");
                        option1.setText("320 m");
                        option2.setText("350 m");
                        option3.setText("500 m");
                        option4.setText("650 m");
                        queno.setText("Question 6");
                        break;
                    case 5:
                        question.setText(" A train passes a station platform in 36 seconds and a man standing on the platform in 20 seconds. If the speed of the train is 54 km/hr ,what is the length of the platform?");
                        option1.setText("260 m");
                        option2.setText("200 m");
                        option3.setText("300 m");
                        option4.setText("240 m");
                        queno.setText("Question 6");
                        break;
                    case 6:
                        question.setText(" A goods train runs at the speed of 72 km/hr and crosses a 250 m long platform in 26 seconds .What is the length of the goods train?");
                        option1.setText("270 m");
                        option2.setText("230 m");
                        option3.setText("130 m");
                        option4.setText("250 m");
                        queno.setText("Question 6");
                        break;
                    case 7:
                        question.setText("A train 800 m long is running at a speed of 78 km/hr. If it crosses a tunnel in 1 minute, then the length of the tunnel is:");
                        option1.setText("130 m");
                        option2.setText("330 m");
                        option3.setText("540 m");
                        option4.setText("500 m");
                        queno.setText("Question 6");
                        break;
                    case 8:
                        question.setText("The length of the bridge , which a train 130 m long and travelling at 45 km/hr can cross in 30 seconds, is:");
                        option1.setText("250 m");
                        option2.setText("245 m");
                        option3.setText("200 m");
                        option4.setText("225 m");
                        queno.setText("Question 6");
                        break;
                    case 9:
                        question.setText("A train 240 m long passed a pole in 24 seconds .How long will it take to pass a platform 650 m long?");
                        option1.setText("89 sec");
                        option2.setText("150 sec");
                        option3.setText("100 sec");
                        option4.setText("65 sec");
                        queno.setText("Question 6");
                        break;

                }
                break;
            case 7:
                switch (rand7 / 1000) {
                    case 0:
                        question.setText("One day, the traffic light at a certain intersection is red when you reach it and no other cars are in front of you. You wait 45 seconds for it to turn green. The next day you reach the same light and it's red again. Additionally, another car is already there, waiting for the light to change, and you pull to a stop behind him. Which scenario is more likely to occur on the second day?");
                        option1.setText("You wait less than 45 seconds ");
                        option1.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option2.setText("You wait more than 45 seconds ");
                        option2.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option3.setText("You wait exactly 45 seconds");
                        option3.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option4.setText("None");
                        option4.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        queno.setText("Question 7");
                        break;
                    case 1:
                        question.setText("Disease Z infects 1 out of every 1000 people. There's a test for Disease Z which is guaranteed to test positive for someone with the disease. For those without the disease, they will test positive 1% of the time.You tested positive for Disease Z, and your doctor wants to place you on an expensive emergency treatment. What's the probability you actually have it? ");
                        option1.setText("Between 5% and 10%");
                        option2.setText("Between 10% and 100%");
                        option3.setText("Between 1% and 5%");
                        option4.setText("Less then 1%");
                        queno.setText("Question 7");
                        break;
                    case 2:
                        question.setText("Whose statement is the most reasonable?\nAli: I just flipped 3 heads in a row with a fair coin. My next flip is very likely to also be heads.\nBen: I rolled a fair six-sided die 10 times and I never rolled a 6. The next roll is especially likely to be a 6 because I am \"due\" for one.\n Cam: Usually, if it rains in Brilliantia (40 km west of where I live), it rains here a couple of hours later. It just started raining in Brilliantia, so it will probably rain here soon.");
                        option1.setText("Ali");
                        option2.setText("Cam");
                        option3.setText("Ben");
                        option4.setText("None");
                        queno.setText("Question 7");
                        break;
                    case 3:
                        question.setText("Probability allows for the quantification of extremely rare events.For example, suppose Tim has two ways to try to win a large sum of money:\nWin at a lottery with a chance of 1 in 300 million.\nRoll a fair six-sided die 20 times and roll all 6s.\nWhich winning event is more likely to happen?");
                        option1.setText("Rolling all 6s");
                        option2.setText("Neither of them");
                        option3.setText("Both");
                        option4.setText("Winning the lottery");
                        queno.setText("Question 7");
                        break;
                    case 4:
                        question.setText("Scientists use something called 5-sigma statistical significance to confirm phenomena observed at the Large Hadron Collider. This means that such an event is 5 standard deviations or more from what is expected in the status quo(without the phenomena),and could only happen by chance with a probability of approximately 3 x 10\u207B\u2077.\nRecently, scientists at CERN have attributed a recent observation of a new particle to \"statistical fluctuation\".The significance of the observation was downgraded to 2-sigma, which translates to a probability of approximately that the observation would have happened by chance.\nApproximately how many times more likely would an observation of 2-sigma significance be than an observation of 5-sigma significance, assuming that the observation happens by chance?");
                        option1.setText("15,00,000");
                        option2.setText("1,500");
                        option3.setText("15,000");
                        option4.setText("1,50,000");
                        queno.setText("Question 7");
                        break;
                    case 5:
                        question.setText("In a certain game of tennis, Alex has a 60% probability to win any given point against Blake.The player who gets to 4 points first wins the game, and points cannot end in a tie.\nWhat is Alex's probability to win the game?");
                        option1.setText("Less then 60%");
                        option2.setText("Less then 40%");
                        option3.setText("Greater then 60%");
                        option4.setText("Exactly 40%");
                        queno.setText("Question 7");
                        break;
                    case 6:
                        question.setText("A magic word is needed to open a certain box. A secret code assigns each letter of the alphabet to a unique number. The code for the magic word is\n 9 23 14 14 18 5\nWhat could be the magic word?");
                        option1.setText("PASSES");
                        option2.setText("WINNER");
                        option3.setText("SECRET");
                        option4.setText("SLEEPS");
                        queno.setText("Question 7");
                        break;
                    case 7:
                        question.setText("In a certain code language, three messages are encoded as follows:\nCats don't like apples = pic sip dip rit\nParrots really like apples = dip pic tif nit\nCats like parrots = sip dip tif\nHow is the word \"don't\" written in the code language?");
                        option1.setText("sip");
                        option2.setText("dip");
                        option3.setText("rit");
                        option4.setText("nit");
                        queno.setText("Question 7");
                        break;
                    case 8:
                        question.setText("A triangle has perimeter 14 and area 2\u221A14 If the shortest side has length 3, find the positive difference between the lengths of other two sides.");
                        option1.setText("1.000");
                        option2.setText("2.025");
                        option3.setText("1.200");
                        option4.setText("2.517");
                        queno.setText("Question 7");
                        break;
                    case 9:
                        question.setText("Three states are being allocated 62 seats in a legislative body.State A has 17% of the population, State B has 37%, and State C has 46%.\nApplying these percentages to the 62 seats and rounding to the nearest integer means State A gets 11 seats, State B gets 23 seats, and State C gets 29 seats.\nWhat’s wrong with this approach?\nI.The algorithm will generally be biased towards larger populations\nII.The number of seats doesn't add up to 62\nIII.The algorithm will generally be biased towards smaller populations.\nIV.Nothing is wrong,the algorithm is correct");
                        option1.setText("IV");
                        option2.setText("I");
                        option3.setText("III");
                        option4.setText("II");
                        queno.setText("Question 7");
                        break;

                }
                break;
            case 8:
                switch (rand8 / 1000) {
                    case 0:
                        question.setText("Three friends find out their birthdays are all within the same week.\nSupposing their birthdays are otherwise random, what is the probability they all have their birthday on the same day?");
                        option1.setText("1/7");
                        option2.setText("3/7\u00B3");
                        option3.setText("3/49");
                        option4.setText("1/49");
                        queno.setText("Question 8");
                        break;
                    case 1:
                        question.setText("A political score P is a number between 0 and 100 where P=0 represents the extreme left-wing and P=100 represents the extreme right-wing.A candidate's positions are also assigned a score, and each voter will vote for whichever candidate has positions with a score closest to their own.\nIn a two-candidate race where each candidate wants to get as many votes as possible, what position(s) will they take?\nNote: In the case where two candidates are equidistant from a voter, assume the voter decides randomly.\nI.They will both take positions corresponding to the average voter political score\nII.They will both take positions corresponding to the median voter political score\nIII.They will take positions corresponding to political scores of 25 and 75\nIV.They will take positions corresponding to political scores of 0 and 100");
                        option1.setText("I");
                        option2.setText("II");
                        option3.setText("III");
                        option4.setText("IV");
                        queno.setText("Question 8");
                        break;
                    case 2:
                        question.setText("The sum of N real numbers (not necessarily unique) is 20. The sum of the 3 smallest of these numbers is 5. The sum of the 3 largest is 7. Which of the following are possible values for N?\nI. 9\nII. 10\nIII. 11");
                        option1.setText("II only");
                        option2.setText("I only");
                        option3.setText("I and II only");
                        option4.setText("II and III only");
                        queno.setText("Question 8");
                        break;
                    case 3:
                        question.setText("Jane went grocery shopping with her mom and bought 7 cucumbers for thirty cents each, a bunch of bananas for two dollars and eighty cents, and 5 apples for one dollar and twenty cents. How much would it cost (in cents) to buy one apple and one cucumber at this grocery store?");
                        option1.setText("31");
                        option2.setText("47");
                        option3.setText("54");
                        option4.setText("150");
                        queno.setText("Question 8");
                        break;
                    case 4:
                        question.setText("Sarah has 17 cousins and 3 sisters. If she and her sisters want to take 4 other boys to the dance, in how many ways can they be paired up in boy-girl pairs?");
                        option1.setText("24");
                        option2.setText("26");
                        option3.setText("17");
                        option4.setText("21");
                        queno.setText("Question 8");
                        break;
                    case 5:
                        question.setText("A number is called 4-average if it is the average of four positive integers. If is a 4-average number, which of the following statements is true?\nI. k is an integer\nII. 4k is an integer\nIII. k is positive");
                        option1.setText("II only");
                        option2.setText("II and III only");
                        option3.setText("I and III only");
                        option4.setText("I,II and III all.");
                        queno.setText("Question 8");
                        break;
                    case 6:
                        question.setText("John leaves Chicago bound for New York at 5 a.m. He drives at an average speed of 60 miles per hour and arrives at a rest area to take a breakfast for half an hour. He leaves the rest area at 8 a.m. and drives 200 miles before taking one-hour break at another rest area. At 11 a.m. John leaves the second area and drives the remaining 450 miles straight on, taking only a 10-minute break at the third rest area, until he arrives at New York at 6 p.m. What is John's average speed between Chicago and the second rest area (including the first rest time where is speed is 0 miles per hour in the calculation)?");
                        option1.setText("60 mph");
                        option2.setText("84 mph");
                        option3.setText("80 mph");
                        option4.setText("70 mph");
                        queno.setText("Question 8");
                        break;
                    case 7:
                        question.setText("If today is a Monday, then what day will it be 100 days later?");
                        option1.setText("Monday");
                        option2.setText("Saturday");
                        option3.setText("Friday");
                        option4.setText("Wednesday");
                        queno.setText("Question 8");
                        break;
                    case 8:
                        question.setText("Can an even number, divided by another even number, times another even number ever equal an odd number?");
                        option1.setText("Yes");
                        option2.setText("Maybe");
                        option3.setText("Never");
                        option4.setText("Data Insufficient");
                        queno.setText("Question 8");
                        break;
                    case 9:
                        question.setText("A-B=A/B\n If whole numbers A and B satisfy this equation then what is A+B?");
                        option1.setText("3");
                        option2.setText("6");
                        option3.setText("8");
                        option4.setText("2");
                        queno.setText("Question 8");
                        break;

                }
                break;
            case 9:
                switch (rand9 / 1000) {
                    case 0:
                        question.setText("Which of these numbers is largest?\n\t200\u2085 \t 100\u2087 \t  56\u2089\n100\u2085 means that the number is in base 5 and so for all.");
                        option1.setText("100\u2085");
                        option2.setText("56\u2089");
                        option3.setText("200\u2085");
                        option4.setText("All are Equal");
                        queno.setText("Question 9");
                        break;
                    case 1:
                        question.setText("A number that consists entirely of 1s (like 1, 11, 111, etc.) is called a repunit. How many digits long is the smallest repunit that is divisible by 9?");
                        option1.setText("6");
                        option2.setText("8");
                        option3.setText("9");
                        option4.setText("5");
                        queno.setText("Question 9");
                        break;
                    case 2:
                        question.setText("You are about to play a game with a coin that is weighted so that there is a 90% chance that it lands heads and a 10% chance that it lands tails. If you want to maximize the expected amount of money you will win, would you rather...\n(You may assume that there is at most a 0.0000001% chance that the coin will spontaneously combust in the air.)");
                        option1.setText("win $10 if it lands heads");
                        option1.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option2.setText("win $50 if it lands tails");
                        option2.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option3.setText("win $1,000,000 if it spontaneously combusts in the air. ");
                        option3.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        option4.setText("Data is Insufficient,more data required");
                        option4.setTextSize(TypedValue.COMPLEX_UNIT_PX,getResources().getDimension(R.dimen.textsize));
                        queno.setText("Question 9");
                        break;
                    case 3:
                        question.setText("Richard is a strange liar. He lies on six days of the week, but on the seventh day, he always tells the truth. He made the following statements on three successive days:\nDay 1: \"I lie on Monday and Tuesday.\"\nDay 2: \"Today, it's Thursday, Saturday, or Sunday.\"\nDay 3: \"I lie on Wednesday and Friday.\"\nOn which day does Richard tell the truth?\n");
                        option1.setText("Monday");
                        option2.setText("Sunday");
                        option3.setText("Thursday");
                        option4.setText("Tuesday");
                        queno.setText("Question 9");
                        break;
                    case 4:
                        question.setText("In a contest, four fruits (an apple, a banana, an orange, and a pear) have been placed in four closed boxes (one fruit per box). People may guess which fruit is in which box. 123 people participate in the contest. When the boxes are opened, it turns out that 43 people have guessed none of the fruits correctly, 39 people have guessed one fruit correctly, and 31 people have guessed two fruits correctly.\nThe question: How many people have guessed three fruits correctly, and how many people have guessed four fruits correctly?\n");
                        option1.setText("10,0");
                        option2.setText("10,10");
                        option3.setText("15,0");
                        option4.setText("0,10");
                        queno.setText("Question 9");
                        break;
                    case 5:
                        question.setText("A frog is at the bottom of a 30 meter well. Each day he summons enough energy for one 3 meter leap up the well. Exhausted, he then hangs there for the rest of the day. At night, while he is asleep, he slips 2 meters backwards. How many days does it take him to escape from the well?\nNote: Assume after the first leap that his hind legs are exactly three meters up the well. His hind legs must clear the well for him to escape.");
                        option1.setText("28");
                        option2.setText("25");
                        option3.setText("30");
                        option4.setText("29");
                        queno.setText("Question 9");
                        break;
                    case 6:
                        question.setText("What day comes three days after the day which comes two days after the day which comes immediately after the day which comes two days after Monday?");
                        option1.setText("Sunday");
                        option2.setText("Tuesday");
                        option3.setText("Wedesday");
                        option4.setText("Saturday");
                        queno.setText("Question 9");
                        break;
                    case 7:
                        question.setText("Three ants are sitting at the three corners of an equilateral triangle. Each ant starts randomly picks a direction and starts to move along the edge of the triangle. What is the probability that none of the ants collide?");
                        option1.setText("0.45");
                        option2.setText("0.20");
                        option3.setText("0.25");
                        option4.setText("0.60");
                        queno.setText("Question 9");
                        break;
                    case 8:
                        question.setText("In the middle of a round pool lies a beautiful water lily. The water lily doubles in size every day. After exactly 20 days, the lily will cover the complete pool.\n After how many days will the water lily cover one fourth of the pool?");
                        option1.setText("10");
                        option2.setText("18");
                        option3.setText("5");
                        option4.setText("19");
                        queno.setText("Question 9");
                        break;
                    case 9:
                        question.setText("Ronald and Michelle have two children. The probability that the first child is a girl is 50%. The probability that the second child is a girl is also 50%. Ronald and Michelle tell you that they have a daughter.\nWhat is the probability that their other child is also a girl?");
                        option1.setText("50%");
                        option2.setText("25%");
                        option3.setText("75%");
                        option4.setText("33%");
                        queno.setText("Question 9");
                        break;

                }
                break;
            case 10:
                switch (rand10 / 1000) {
                    case 0:
                        question.setText("Danny has a bunch of dice in his drawer. He recalls that 5 of them are green, 6 of them are blue and 7 of them are red. He reaches in and grabs several without looking. How many does he have to grab, in order to ensure that 3 of them are the same color?");
                        option1.setText("6");
                        option2.setText("8");
                        option3.setText("7");
                        option4.setText("9");
                        queno.setText("Question 10");
                        break;
                    case 1:
                        question.setText("5 integers are randomly chosen from 1 to 2015. What is the probability that there is a pair of integers whose difference is a multiple of 4?");
                        option1.setText("0.25");
                        option2.setText("0.50");
                        option3.setText("0.75");
                        option4.setText("1.00");
                        queno.setText("Question 10");
                        break;
                    case 2:
                        question.setText("In Melinda's messy dresser drawer, there is a jumble of 5 red socks, 7 blue socks, 7 green socks, and 4 yellow socks. If Melinda grabs a big handful of socks without looking at what she's taking, what is the minimum number of socks Melinda has to grab in order to guarantee that she has at least 4 socks of the same color?");
                        option1.setText("21");
                        option2.setText("13");
                        option3.setText("11");
                        option4.setText("10");
                        queno.setText("Question 10");
                        break;
                    case 3:
                        question.setText("Alice, Bob, Candice and David run for school president. There are 201 students in the school and each student can vote for only one candidate. The person with the largest number of votes is the winner. If every student votes, what is the minimum number of votes needed for it to be at least possible to win the election?\nDetails and assumptions\nTies for the winner are not allowed in this election.\n");
                        option1.setText("51");
                        option2.setText("21");
                        option3.setText("71");
                        option4.setText("41");
                        queno.setText("Question 10");
                        break;
                    case 4:
                        question.setText("It was around 4 in the morning, and I'm all dressed up, ready for school,when the electricity was cut off.Too bad,I haven't put on my socks yet.\nI have 2343 pairs of gray socks, 3212 pairs of pink socks and 6525 pairs of blue socks. Everything is mixed in my drawer (I'm a bit of irresponsible, sorry about that.).As there was no light,I was not able to identify the color of the socks.How many of the socks did I need to take to match one pair?\n");
                        option1.setText("4");
                        option2.setText("6");
                        option3.setText("7");
                        option4.setText("11");
                        queno.setText("Question 10");
                        break;
                    case 5:
                        question.setText("In a box there are red and blue balls. If you select a handful of them with eyes closed, you have to grab at least of them to make sure at least one of them is red and you have to grab at least of them to make sure both colors appear among the balls selected. How many balls are there in the box?");
                        option1.setText("11");
                        option2.setText("12");
                        option3.setText("13");
                        option4.setText("10");
                        queno.setText("Question 10");
                        break;
                    case 6:
                        question.setText("An intelligent trader travels from 1 place to another carrying 3 sacks having 30 coconuts in each of them. No sack can hold more than 30 coconuts and he can move the coconuts between sacks. On the way, he passes through 30 checkpoints and on each checkpoint he has to give 1 coconut from each sack he is carrying.\nWhat is the maximum number of coconuts he can have after passing through every checkpoint?\n");
                        option1.setText("21");
                        option2.setText("0");
                        option3.setText("30");
                        option4.setText("25");
                        queno.setText("Question 10");
                        break;
                    case 7:
                        question.setText("The nim is a mathematical game of strategy where two players take turns removing objects from distinct heaps. A player must remove at least one object at his/her turn, and can remove as many as he/she wants as long as they come from a single heap. The player who removes the last object is the winner.\nSeth and Gordon play nim with three heaps of ten coins each. If Seth goes first, who can guarantee a win?");
                        option1.setText("Gordon");
                        option2.setText("Insufficient Data");
                        option3.setText("Cannnot be said anything");
                        option4.setText("Seth");
                        queno.setText("Question 10");
                        break;
                    case 8:
                        question.setText("Three married couples arrange a party. They arrive at the party one at a time, the couples not necessarily arriving together. They all, upon arriving, shake the hand of everyone already there, except their own spouse. When everyone has arrived, someone asks all the others how many hands they shook upon arriving, and gets five different answers. How many hands did he himself shake upon arriving?");
                        option1.setText("3");
                        option2.setText("2");
                        option3.setText("5");
                        option4.setText("9");
                        queno.setText("Question 10");
                        break;
                    case 9:
                        question.setText("1,2,2,3,3,3,4,4,4,4,5,5,5,5,5,.... \nWhat is the 1000th term of this sequence?");
                        option1.setText("45");
                        option2.setText("39");
                        option3.setText("50");
                        option4.setText("34");
                        queno.setText("Question 10");
                        break;

                }
                break;


        }

    }

    public void getAnswer(View view) {

        RadioGroup option = (RadioGroup) findViewById(R.id.myRadioGroup);
        int btn = option.getCheckedRadioButtonId();
        RadioButton optio1 = (RadioButton) findViewById(R.id.option1);
        RadioButton optio2 = (RadioButton) findViewById(R.id.option2);
        RadioButton optio3 = (RadioButton) findViewById(R.id.option3);
        RadioButton optio4 = (RadioButton) findViewById(R.id.option4);
        int ans1 = optio1.getId();
        int ans2 = optio2.getId();
        int ans3 = optio3.getId();
        int ans4 = optio4.getId();
        TextView scoreval = (TextView) findViewById(R.id.scoreplayer);
        TextView time = (TextView) findViewById(R.id.timeleft);
        switch (n) {
            case 1:
                switch (rand1 / 1000) {
                    case 0:

                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(1);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 1:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);

                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(1);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 2:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(1);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 3:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(1);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 4:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(1);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 5:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(1);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 6:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(1);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 7:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(1);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 8:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(1);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 9:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(1);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                }
                break;
            case 2:
                switch (rand2 / 1000) {
                    case 0:

                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(2);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 1:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(2);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 2:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(2);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 3:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(2);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 4:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(2);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 5:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(2);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 6:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(2);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 7:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(2);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 8:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(2);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 9:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(2);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                }
                break;
            case 3:
                switch (rand3 / 1000) {
                    case 0:

                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 1:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 2:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 3:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 4:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 5:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 6:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 7:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 8:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 9:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                }
                break;
            case 4:
                switch (rand4 / 1000) {
                    case 0:

                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 1:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 2:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 3:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 4:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 5:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 6:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 7:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 8:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 9:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(3);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                }
                break;
            case 5:
                switch (rand5 / 1000) {
                    case 0:

                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 1:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 2:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 3:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 4:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 5:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 6:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 7:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 8:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 9:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                }
                break;
            case 6:
                switch (rand6 / 1000) {
                    case 0:

                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 1:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 2:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 3:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 4:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 5:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 6:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 7:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 8:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 9:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(4);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                }
                break;
            case 7:
                switch (rand7 / 1000) {
                    case 0:

                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 1:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 2:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 3:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 4:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 5:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 6:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 7:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 8:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 9:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                }
                break;
            case 8:
                switch (rand8 / 1000) {
                    case 0:

                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 1:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 2:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 3:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 4:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 5:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 6:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 7:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 8:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 9:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(5);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                }
                break;
            case 9:
                switch (rand9 / 1000) {
                    case 0:

                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(6);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 1:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(6);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 2:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(6);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 3:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(66);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 4:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(6);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 5:
                        if (btn == ans1) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(6);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 6:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(6);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 7:
                        if (btn == ans3) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(6);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 8:
                        if (btn == ans2) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(6);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 9:
                        if (btn == ans4) {
                            n++;
                            toastdisplay(true);
                            displayQuestion(n);
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            timeLeft(6);

                            score += 10;
                            scoreval.setText("" + score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                }
                break;
            case 10:
                switch (rand10 / 1000) {
                    case 0:
                        if (btn == ans3) {
                            toastdisplay(true);
                            score += 10;
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            getResult(score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 1:
                        if (btn == ans4) {
                            toastdisplay(true);
                            score += 10;
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            getResult(score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 2:
                        if (btn == ans2) {
                            toastdisplay(true);
                            score += 10;
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            getResult(score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 3:
                        if (btn == ans1) {
                            toastdisplay(true);
                            score += 10;
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            getResult(score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 4:
                        if (btn == ans1) {
                            toastdisplay(true);
                            score += 10;
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            getResult(score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 5:
                        if (btn == ans3) {
                            toastdisplay(true);
                            score += 10;
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            getResult(score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 6:
                        if (btn == ans4) {
                            toastdisplay(true);
                            score += 10;
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            getResult(score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 7:
                        if (btn == ans4) {
                            toastdisplay(true);
                            score += 10;
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            getResult(score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 8:
                        if (btn == ans2) {
                            toastdisplay(true);
                            score += 10;
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            getResult(score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                    case 9:
                        if (btn == ans1) {
                            toastdisplay(true);
                            score += 10;
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            getResult(score);
                            break;
                        } else {
                            if (waitTimer != null) {
                                waitTimer.cancel();
                                waitTimer = null;
                            }
                            toastdisplay(false);
                            getResult(score);
                        }
                        break;
                }
                break;

        }


    /* score.setText(""+btn);
    RadioButton radiooptionButton=(RadioButton)findViewById(btn);
    String  ans=radiooptionButton.getText().toString();
   // score.setText(ans);
    */

    }

    public void getResult(int score1) {
        score=score1;
        if(secondchance==true) {

            AlertDialog.Builder builder = new AlertDialog.Builder(this);

            builder.setTitle("Wrong Answer");
            builder.setMessage("Get a Second Chance by watching full video?");


            builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

                public void onClick(DialogInterface dialog, int which) {
                    loadRewardedVideoAd();
                    onRewardedVideoAdLoaded();
                    secondchance=false;
                    dialog.dismiss();
                }
            });

            builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {


                    Intent i = new Intent(Quizactivity.this, Showscore.class);
                    i.putExtra("marks", score);
                    i.putExtra("name", yourname);
                    startActivity(i);

                    dialog.dismiss();
                }
            });

            AlertDialog alert = builder.create();
            alert.show();
        }
        else{
            Intent i = new Intent(Quizactivity.this, Showscore.class);
            i.putExtra("marks", score);
            i.putExtra("name", yourname);
            startActivity(i);


        }
    }

    @Override
    public void onRewarded(RewardItem reward1) {
//        Toast.makeText(this, "Hurray! YOU GET A SECOND CHANCE! CLOSE THIS AND START PLAYING!", Toast.LENGTH_LONG).show();
        Toast toast = Toast.makeText(this, "Yay! You get a Second Chance! Close this and Start Playing!", Toast.LENGTH_LONG);
        View view = toast.getView();

        //To change the Background of Toast
        view.setBackgroundColor(Color.BLACK);
        TextView text = (TextView) view.findViewById(android.R.id.message);

        //Shadow of the Of the Text Color
        text.setShadowLayer(0, 0, 0, Color.TRANSPARENT);
        text.setTextColor(Color.CYAN);
        text.setTextSize(25);
        toast.show();
         reward=true;

        // Reward the user.
    }

    @Override
    public void onRewardedVideoAdLeftApplication() {
       }

    @Override
    public void onRewardedVideoAdClosed() {
   if(reward==true){
       TextView timeleft=findViewById(R.id.timeleft);
       timeleft.setText("NO");
   }
        else if(reward==false){
     Intent i = new Intent(Quizactivity.this, Showscore.class);
        i.putExtra("marks", score);
        i.putExtra("name", yourname);
        startActivity(i);
        }
    }

    @Override
    public void onRewardedVideoAdFailedToLoad(int errorCode) {
     }

    @Override
    public void onRewardedVideoAdLoaded() {
        mRewardedVideoAd.show();

    }

    @Override
    public void onRewardedVideoAdOpened() {
          }

    @Override
    public void onRewardedVideoStarted() {
        Toast toast = Toast.makeText(this, "Be patient and watch full to get second chance!", Toast.LENGTH_LONG);
        View view = toast.getView();

        //To change the Background of Toast
        view.setBackgroundColor(Color.BLACK);
        TextView text = (TextView) view.findViewById(android.R.id.message);

        //Shadow of the Of the Text Color
        text.setShadowLayer(0, 0, 0, Color.TRANSPARENT);
        text.setTextColor(Color.CYAN);
        text.setTextSize(20);
        toast.show();
          }


    @Override
    public void onResume() {
        mRewardedVideoAd.resume(this);
        super.onResume();
    }

    @Override
    public void onPause() {
        mRewardedVideoAd.pause(this);
        super.onPause();
    }

    @Override
    public void onDestroy() {
        mRewardedVideoAd.destroy(this);
        super.onDestroy();
    }
    public void timeLeft(int question) {
        switch (question) {
            case 1:
            waitTimer = new CountDownTimer(16000, 1000) {
               public void onTick(long millisUntilFinished) {
                    TextView timeleft = (TextView) findViewById(R.id.timeleft);

                    timeleft.setText("" + millisUntilFinished / 1000);
             if(millisUntilFinished/1000<=5)
             {

                 ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);
                 toneGen1.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD,1000);
             }
                }

                public void onFinish() {
                    getResult(score);
                    if (waitTimer != null) {
                        waitTimer.cancel();
                        waitTimer = null;

                    }
                }

            }.start();
            break;
            case 2:
                waitTimer = new CountDownTimer(21000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        TextView timeleft = (TextView) findViewById(R.id.timeleft);
                        timeleft.setText("" + millisUntilFinished / 1000);
                        if(millisUntilFinished/1000<=5)
                        {

                            ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);
                            toneGen1.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD,1000);
                        }
                    }

                    public void onFinish() {
                        getResult(score);
                        if (waitTimer != null) {
                            waitTimer.cancel();
                            waitTimer = null;

                        }
                    }

                }.start();
                break;
            case 3:
                waitTimer = new CountDownTimer(31000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        TextView timeleft = (TextView) findViewById(R.id.timeleft);
                        timeleft.setText("" + millisUntilFinished / 1000);
                        if(millisUntilFinished/1000<=5)
                        {

                            ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);
                            toneGen1.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD,1000);
                        }
                    }

                    public void onFinish() {
                        getResult(score);
                        if (waitTimer != null) {
                            waitTimer.cancel();
                            waitTimer = null;

                        }
                    }

                }.start();
                break;
            case 4:
                waitTimer = new CountDownTimer(61000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        TextView timeleft = (TextView) findViewById(R.id.timeleft);
                        timeleft.setText("" + millisUntilFinished / 1000);
                        if(millisUntilFinished/1000<=10)
                        {

                            ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);
                            toneGen1.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD,1000);
                        }
                    }

                    public void onFinish() {
                        getResult(score);
                        if (waitTimer != null) {
                            waitTimer.cancel();
                            waitTimer = null;

                        }
                    }

                }.start();
                break;
            case 5:
                waitTimer = new CountDownTimer(81000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        TextView timeleft = (TextView) findViewById(R.id.timeleft);
                        timeleft.setText("" + millisUntilFinished / 1000);
                        if(millisUntilFinished/1000<=10)
                        {

                            ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);
                            toneGen1.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD,1000);
                        }
                    }

                    public void onFinish() {
                        getResult(score);
                        if (waitTimer != null) {
                            waitTimer.cancel();
                            waitTimer = null;

                        }
                    }

                }.start();
                break;
            case 6:
                waitTimer = new CountDownTimer(101000, 1000) {

                    public void onTick(long millisUntilFinished) {
                        TextView timeleft = (TextView) findViewById(R.id.timeleft);
                        timeleft.setText("" + millisUntilFinished / 1000);
                        if(millisUntilFinished/1000<=15)
                        {

                            ToneGenerator toneGen1 = new ToneGenerator(AudioManager.STREAM_MUSIC, 100);
                            toneGen1.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD,1000);
                        }
                    }

                    public void onFinish() {
                        getResult(score);
                        if (waitTimer != null) {
                            waitTimer.cancel();
                            waitTimer = null;

                        }
                    }

                }.start();
                break;
        }
    }
    public void toastdisplay(boolean number) {
        if (number) {
            Toast toast = Toast.makeText(this, "Right \u2713", Toast.LENGTH_SHORT);

            ViewGroup group = (ViewGroup) toast.getView();
            TextView messageTextView = (TextView) group.getChildAt(0);
            messageTextView.setTextSize(30);
            //To change the Background of Toast
            group.setBackgroundColor(Color.BLACK);
            TextView text = (TextView) group.findViewById(android.R.id.message);
            text.setTextColor(Color.GREEN);
            toast.show();

        } else {


            Toast toast1 = Toast.makeText(this, "Wrong \u274C", Toast.LENGTH_SHORT);

            ViewGroup group = (ViewGroup) toast1.getView();
            TextView messageTextView = (TextView) group.getChildAt(0);
            messageTextView.setTextSize(30);
            //To change the Background of Toast
            group.setBackgroundColor(Color.BLACK);
            TextView text = (TextView) group.findViewById(android.R.id.message);
            text.setTextColor(Color.RED);
            toast1.show();
        }
    }
    @Override
    public void onBackPressed() {
        Intent i=new Intent(Quizactivity.this,MainActivity.class);
        startActivity(i);
        android.os.Process.killProcess(android.os.Process.myPid());
        // This above line close correctly
    }
}
