package com.example.lotterynumbergenerator;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.widget.Button;
import android.widget.TextView;
import java.lang.String;
//import android.view.View.OnKeylistener;
import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Button rnd, clr;
    TextView one, two, three, four, five, six, seven, eight, nine, ten, eleven, twelve, thirteen, fourteen, fifteen, sixteen, seventeen, eighteen, nineteen, twenty, twentyone, twentytwo, twentythree, twentyfour, twentyfive, twentysix, twentyseven, twentyeight, twentynine, thirty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        clr = (Button) findViewById(R.id.button2);
        rnd = (Button) findViewById(R.id.button);

        one = (TextView) findViewById(R.id.textView);
        two = (TextView) findViewById(R.id.textView2);
        three = (TextView) findViewById(R.id.textView3);
        four = (TextView) findViewById(R.id.textView4);
        five = (TextView) findViewById(R.id.textView5);
        six = (TextView) findViewById(R.id.textView6);

        seven = (TextView) findViewById(R.id.textView7);
        eight = (TextView) findViewById(R.id.textView8);
        nine = (TextView) findViewById(R.id.textView9);
        ten = (TextView) findViewById(R.id.textView10);
        eleven = (TextView) findViewById(R.id.textView11);
        twelve = (TextView) findViewById(R.id.textView12);

        thirteen = (TextView) findViewById(R.id.textView13);
        fourteen = (TextView) findViewById(R.id.textView14);
        fifteen = (TextView) findViewById(R.id.textView15);
        sixteen = (TextView) findViewById(R.id.textView16);
        seventeen = (TextView) findViewById(R.id.textView17);
        eighteen = (TextView) findViewById(R.id.textView18);

        nineteen = (TextView) findViewById(R.id.textView19);
        twenty = (TextView) findViewById(R.id.textView20);
        twentyone = (TextView) findViewById(R.id.textView21);
        twentytwo = (TextView) findViewById(R.id.textView22);
        twentythree = (TextView) findViewById(R.id.textView23);

        twentyfour = (TextView) findViewById(R.id.textView24);
        twentyfive = (TextView) findViewById(R.id.textView25);
        twentysix= (TextView) findViewById(R.id.textView26);
        twentyseven = (TextView) findViewById(R.id.textView27);

        twentyeight = (TextView) findViewById(R.id.textView28);
        twentynine = (TextView) findViewById(R.id.textView29);
        thirty = (TextView) findViewById(R.id.textView30);


        rnd.setOnClickListener(v -> {
            Random numGen = new Random();
            Random numGen6 = new Random();
            Random numGen2 = new Random();
            Random numGen3 = new Random();
            Random numGen4 = new Random();
            Random numGen5 = new Random();

            Random numGen7 = new Random();
            Random numGen8 = new Random();
            Random numGen9 = new Random();
            Random numGen10 = new Random();
            Random numGen11 = new Random();
            Random numGen12 = new Random();

            Random numGen13 = new Random();
            Random numGen14 = new Random();
            Random numGen15 = new Random();
            Random numGen16 = new Random();
            Random numGen17 = new Random();
            Random numGen18 = new Random();

            Random numGen19 = new Random();
            Random numGen20 = new Random();
            Random numGen21 = new Random();
            Random numGen22 = new Random();
            Random numGen23 = new Random();

            Random numGen24 = new Random();
            Random numGen25 = new Random();
            Random numGen26 = new Random();
            Random numGen27 = new Random();

            Random numGen28 = new Random();
            Random numGen29 = new Random();
            Random numGen30 = new Random();


            int numg;
            int num6;
            int num2;
            int num3;
            int num4;
            int num5;

            int num7;
            int num8;
            int num9;
            int num10;
            int num11;
            int num12;

            int num13;
            int num14;
            int num15;
            int num16;
            int num17;
            int num18;

            int num19;
            int num20;
            int num21;
            int num22;
            int num23;

            int num24;
            int num25;
            int num26;
            int num27;

            int num28;
            int num29;
            int num30;

            numg = numGen.nextInt(25);
            num6 = numGen2.nextInt(70);
            num2 = numGen3.nextInt(70);
            num3 = numGen.nextInt(70);
            num4 = numGen2.nextInt(70);
            num5 = numGen3.nextInt(70);

            num7 = numGen7.nextInt(26);
            num8 = numGen8.nextInt(69);
            num9 = numGen9.nextInt(69);
            num10 = numGen10.nextInt(69);
            num11 = numGen11.nextInt(69);
            num12 = numGen12.nextInt(69);

            num13 = numGen13.nextInt(4);
            num14 = numGen14.nextInt(60);
            num15 = numGen15.nextInt(60);
            num16 = numGen16.nextInt(60);
            num17 = numGen17.nextInt(60);
            num18 = numGen18.nextInt(60);

            num19 = numGen19.nextInt(9);
            num20 = numGen20.nextInt(9);
            num21 = numGen21.nextInt(9);
            num22 = numGen22.nextInt(9);
            num23 = numGen23.nextInt(9);

            num24 = numGen24.nextInt(9);
            num25 = numGen25.nextInt(9);
            num26 = numGen26.nextInt(9);
            num27 = numGen27.nextInt(9);

            num28 = numGen28.nextInt(9);
            num29 = numGen29.nextInt(9);
            num30 = numGen30.nextInt(9);

            String stringG = String.valueOf(numg);
            String string6 = String.valueOf(num6);
            String string2 = String.valueOf(num2);
            String string3 = String.valueOf(num3);
            String string4 = String.valueOf(num4);
            String string5 = String.valueOf(num5);

            String string7 = String.valueOf(num7);
            String string8 = String.valueOf(num8);
            String string9 = String.valueOf(num9);
            String string10 = String.valueOf(num10);
            String string11 = String.valueOf(num11);
            String string12 = String.valueOf(num12);

            String string13 = String.valueOf(num13);
            String string14 = String.valueOf(num14);
            String string15 = String.valueOf(num15);
            String string16 = String.valueOf(num16);
            String string17 = String.valueOf(num17);
            String string18 = String.valueOf(num18);

            String string19 = String.valueOf(num19);
            String string20 = String.valueOf(num20);
            String string21 = String.valueOf(num21);
            String string22 = String.valueOf(num22);
            String string23 = String.valueOf(num23);

            String string24 = String.valueOf(num24);
            String string25 = String.valueOf(num25);
            String string26 = String.valueOf(num26);
            String string27 = String.valueOf(num27);

            String string28 = String.valueOf(num28);
            String string29 = String.valueOf(num29);
            String string30 = String.valueOf(num30);

            one.setText(string5);
            two.setText(string4);
            three.setText(string3);
            four.setText(string2);
            five.setText(stringG);
            six.setText(string6);

            seven.setText(string7);
            eight.setText(string8);
            nine.setText(string9);
            ten.setText(string10);
            eleven.setText(string11);
            twelve.setText(string12);

            thirteen.setText(string13);
            fourteen.setText(string14);
            fifteen.setText(string15);
            sixteen.setText(string16);
            seventeen.setText(string17);
            eighteen.setText(string18);

            nineteen.setText(string19);
            twenty.setText(string20);
            twentyone.setText(string21);
            twentytwo.setText(string22);
            twentythree.setText(string23);

            twentyfour.setText(string24);
            twentyfive.setText(string25);
            twentysix.setText(string26);
            twentyseven.setText(string27);

            twentyeight.setText(string28);
            twentynine.setText(string29);
            thirty.setText(string30);

        });
        clr.setOnClickListener(v ->{
            one.setText("0");
            two.setText("0");
            three.setText("0");
            four.setText("0");
            five.setText("0");
            six.setText("0");

            seven.setText("0");
            eight.setText("0");
            nine.setText("0");
            ten.setText("0");
            eleven.setText("0");
            twelve.setText("0");

            thirteen.setText("0");
            fourteen.setText("0");
            fifteen.setText("0");
            sixteen.setText("0");
            seventeen.setText("0");
            eighteen.setText("0");

            nineteen.setText("0");
            twenty.setText("0");
            twentyone.setText("0");
            twentytwo.setText("0");
            twentythree.setText("0");

            twentyfour.setText("0");
            twentyfive.setText("0");
            twentysix.setText("0");
            twentyseven.setText("0");

            twentyeight.setText("0");
            twentynine.setText("0");
            thirty.setText("0");

        });



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}