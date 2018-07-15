package com.londonappbrewery.destini;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyText;
    Button topButton,bottomButton;
    int index;

    private check[] storyBank = new check[]{
            new check(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2, R.string.T3_Story, R.string.T2_Story),
            new check(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2, R.string.T3_Story, R.string.T4_End),
            new check(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2, R.string.T6_End, R.string.T5_End),
            new check(R.string.T4_End, 0, 0, 0, 0),
            new check(R.string.T5_End, 0, 0, 0, 0),
            new check(R.string.T6_End, 0, 0, 0, 0)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        storyText = (TextView) findViewById(R.id.storyTextView);
        topButton = (Button) findViewById(R.id.buttonTop);
        bottomButton = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        topButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateScreen(1);
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        bottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                updateScreen(2);
            }
        });


    }

    public void updateScreen(int n){

        if(n == 1)
        {
            storyText.setText(storyBank[index].getNextStory1());
            for(int i = 0;i < storyBank.length;i++){
               if(storyBank[i].getStoryId() == storyBank[index].getNextStory1()){
                   index = i; break;
               }

            }
            if(storyBank[index].getChoice1() != 0)
            {
                topButton.setText(storyBank[index].getChoice1());
                bottomButton.setText(storyBank[index].getChoice2());
            }
            else
            {
                topButton.setVisibility(View.INVISIBLE);
                bottomButton.setVisibility(View.INVISIBLE);
            }


        }
        else if(n == 2)
        {
            storyText.setText(storyBank[index].getNextStory2());
            for(int i = 0;i < storyBank.length;i++){
                if(storyBank[i].getStoryId() == storyBank[index].getNextStory2()){
                    index = i; break;
                }

            }
            if(storyBank[index].getChoice1() != 0)
            {
                topButton.setText(storyBank[index].getChoice1());
                bottomButton.setText(storyBank[index].getChoice2());
            }
            else
            {
                topButton.setVisibility(View.INVISIBLE);
                bottomButton.setVisibility(View.INVISIBLE);
            }
        }


    }
}