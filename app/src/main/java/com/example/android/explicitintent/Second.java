package com.example.android.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    TextView txt1; //define the textview
    // so we can access it, where we show the data

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt1 = (TextView)findViewById(R.id.result);
        // so the txt1 will referning ot result

        //get data form intent
        Bundle b1 = getIntent().getExtras();
                    //these will return a bundle object
        String s1 = b1.getString("userKey");
        //data now is s1, so need to send s1 to the result textview
        txt1.setText(s1);

    }
}
