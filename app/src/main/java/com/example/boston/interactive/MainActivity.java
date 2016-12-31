package com.example.boston.interactive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//creating a layout through java code, we have to import android.widget.Relative layout and then the follwing line//
        RelativeLayout kiranlayout = new RelativeLayout(this);

 //creating a button through java code , we have to import android.widget.Button and then the following line//
        Button redbutton = new Button(this);

  // the following line is for adding the button to the relative layout
        kiranlayout.addView(redbutton);

    // to display the layout we use the following line
        setContentView(kiranlayout);

    }
}
