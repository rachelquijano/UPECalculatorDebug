package com.DataFlair.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    double in1 = 0, i2 = 0;
    TextView displaytext1;
    boolean Add, Sub, Multiply, Divide, Remainder, deci;
    Button button_0, button_Add;
    //Implement all other button variables

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_0 = (Button) findViewById(R.id.b0);

        //Instantiate ALL other button variables



        displaytext1 = (TextView) findViewById(R.id.display);



        //On Click Listeners
        button_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displaytext1.setText(displaytext1.getText() + "0");
            }
        });

        //Add onClick Listeners for every other button


        button_Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displaytext1.getText().length() != 0) {
                    in1 = Float.parseFloat(displaytext1.getText() + "");
                    Add = true;
                    deci = false;
                    displaytext1.setText(null);
                }
            }
        });

        //Repeat for subtract, multiply, and add.


        //Fix these errors
        button_Remainder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (displaytext1.getText().length() != 0) {
                    in1 = Float.parseFloat(displaytext1.getText() + "");
                    Remainder = true;
                    deci = false;
                    displaytext1.setText(null);
                }
            }
        });

        button_Equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Add || Sub || Multiply || Divide || Remainder) {
                    i2 = Float.parseFloat(displaytext1.getText() + "");
                }

                if (Add) {

                    displaytext1.setText(in1 + i2 + "");
                    Add = false;
                }

                //Handle other cases here...


                if (Remainder) {
                    displaytext1.setText(in1 % i2 + "");
                    Remainder = false;
                }
            }
        });

        "what goes here?".setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displaytext1.setText("");
                in1 = 0.0;
                i2 = 0.0;
            }
        });

        "what goes here?".setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (deci) {
                    //do nothing or you can show the error
                } else {
                    displaytext1.setText(displaytext1.getText() + ".");
                    deci = true;
                }

            }
        });
    }
}
