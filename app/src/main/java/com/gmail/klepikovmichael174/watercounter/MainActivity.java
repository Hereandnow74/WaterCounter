package com.gmail.klepikovmichael174.watercounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int waterQuantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayWaterCount(0);
    }
    /**
     * Displays the number of water you have drunk.
     */
    public void displayWaterCount(int score) {
        TextView scoreView = (TextView) findViewById(R.id.watercounter);
        scoreView.setText(String.valueOf(score));
    }
    //decrement button (decrease number of drunken water)
    public void decrement (View view){
        if (waterQuantity == 0) {
            //Show toast message
            Toast.makeText(this, "You cannot drink less than 0 litres of water", Toast.LENGTH_SHORT).show();
            //Exit method early because there is nothing left to do
            return;
        }
        waterQuantity -= 1;
        displayWaterCount(waterQuantity);
    }
    //increment button (increase number of drunken water)
    public void increment (View view){
        waterQuantity += 1;
        displayWaterCount(waterQuantity);
    }
    //reset button (set counter back to 0)
    public void reset (View view){
        waterQuantity = 0;
        displayWaterCount(waterQuantity);
    }

}