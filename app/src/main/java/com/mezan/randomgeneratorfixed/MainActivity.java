package com.mezan.randomgeneratorfixed;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
TextView txt;
EditText etxt;
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=(TextView) findViewById(R.id.txt);
        etxt=(EditText) findViewById(R.id.input);
        btn=(Button) findViewById(R.id.btnGuess);
        final Random rand=new Random();
        //final int n=rand.nextInt(20)+1; //one time generated
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val=etxt.getText().toString();
                int n=rand.nextInt(20)+1; //20 max and 1 is min //each time generate a random number
                    int vuser=Integer.parseInt(val);
                    if(n==vuser){
                        txt.setText("Correct Guess :" +vuser);
                    }else {
                        txt.setText("Wrong Guess :"+vuser+"\nGenerated Value :"+n);
                    }
            }
        });
    }
}
