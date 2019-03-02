package com.shackman.funfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();
    // Declare our View variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assign the views from the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        relativeLayout = findViewById(R.id.relativeLayout);

        changeFact();

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeFact();
            }
        };
        showFactButton.setOnClickListener(listener);

        Log.d(TAG, "We're logging from the onCreate() method!");
    }

    public void changeFact() {
        String fact = factBook.getFact();

        // Update the screen with our new fact
        factTextView.setText(fact);

        int color = colorWheel.getColor();
        relativeLayout.setBackgroundColor(color);
        showFactButton.setTextColor(color);
    }
}
