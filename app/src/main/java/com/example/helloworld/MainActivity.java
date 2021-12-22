package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.text);

        // User can tap a button to change the text color of the label.
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Change the color of the label
                ((TextView) findViewById(R.id.text)).setTextColor(getResources().getColor(R.color.white));
            }
        });

        //User can tap a button to change the background color
        findViewById(R.id.ChangeBackgroundButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //change the color of the background
                    findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.lightBlue));
            }
        });
        findViewById(R.id.ChangeTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.text)).setText("Android is Awesome!");
            }
        });

        //To reset all views to default setting
        //Reset to "Hello from Viktoriia" @+id/text
        //Reset to background color "Blue" @+id/parent
        //Reset to original text color "lightBlue"
        findViewById(R.id.parent).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hello from Viktoriia!");
                findViewById(R.id.parent).setBackgroundColor(getResources().getColor(R.color.Blue));
                textView.setTextColor(getResources().getColor(R.color.Yellow));
            }
        });

        // To change the text string with custom text
        findViewById(R.id.ChangeCustomTextButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userEnterText=((EditText)findViewById(R.id.editText)).getText().toString();

                if(userEnterText.isEmpty()) {
                    textView.setText("Create your own text");
                }else{
                    textView.setText(userEnterText);
                        }
            }
        });


    }
}