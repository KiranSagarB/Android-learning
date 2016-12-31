package com.example.boston.interactive;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
//import android.

import static android.widget.RelativeLayout.CENTER_HORIZONTAL;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//creating a layout through java code, we have to import android.widget.Relative layout and then the follwing line//
        RelativeLayout kiranlayout = new RelativeLayout(this);

        // adding background color to the relative layout of instance kiranlayout
        kiranlayout.setBackgroundColor(Color.GRAY);

        //creating a button through java code , we have to import android.widget.Button and then the following line//
        Button redbutton = new Button(this);



        // positioning the button
        // create a container in RelativeLayout using Layoutparams which is the rules for creating a space
        // we can create many container, so a new instance of buttonposition is created
        //RelativeLayout.LayoutParams.MATCH_PARENT gives out height of the container
        // RelativeLayout.LayoutParams.WRAP_CONTENT gives out width of the container
        RelativeLayout.LayoutParams buttonposition = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT);

        // positioning the container i.e buttonposition
        buttonposition.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonposition.addRule(RelativeLayout.CENTER_VERTICAL);



        //Setting text to the button of instance redbutton
        redbutton.setText("Log In");

        // adding background color to the button of instance redbutton
        redbutton.setBackgroundColor(Color.BLUE);


  // the following line is for adding the button to the relative layout and its position
        kiranlayout.addView(redbutton,buttonposition);

    // to display the layout we use the following line
        setContentView(kiranlayout);

    }
}
