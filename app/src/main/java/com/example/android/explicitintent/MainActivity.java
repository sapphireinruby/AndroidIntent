package com.example.android.explicitintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1; //define e1

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText)findViewById(R.id.edit1); // make e1 link with edit1 textview
    }

    public void doSomething(View view) {
        Intent i1 = new Intent(this,Second.class);
        //get data form edit1 textview
        i1.putExtra("userKey",e1.getText().toString());
        //under the same Intent i1
        //use any name for the key of name
        //put what user enter, so it's data form e1
        startActivity(i1); //then it will start the intent 1
        // and the data will pass to 2nd activity
    }
}
