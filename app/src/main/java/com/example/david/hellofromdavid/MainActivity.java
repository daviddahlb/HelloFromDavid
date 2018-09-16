package com.example.david.hellofromdavid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.change_text_color_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((TextView) findViewById(R.id.HelloFromDavid)).setTextColor(getResources().getColor(R.color.colorPrimary));
            }
        });

        findViewById(R.id.change_background_color).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.lilac));
            }
        });

        findViewById(R.id.changeString).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //grab the text user inputted
                //put the text into our text view once the 'change text' button is clicked
                String newText = ((EditText)findViewById(R.id.editText)).getText().toString();
                if(TextUtils.isEmpty(newText)) {
                    ((TextView) findViewById(R.id.HelloFromDavid)).setText("Hello from David!");
                }else {
                    ((TextView) findViewById(R.id.HelloFromDavid)).setText(newText);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener()
        {
           @Override
           public void onClick(View view)
           {

               //reset text color back to black
               ((TextView) findViewById(R.id.HelloFromDavid)).setTextColor(getResources().getColor(R.color.black));

               //reset background color color colorAccent
               findViewById(R.id.rootView).setBackgroundColor(getResources().getColor(R.color.colorAccent));

               //reset text back to "Hello from David!"
               ((TextView) findViewById(R.id.HelloFromDavid)).setText("Hello from David!");
           }
        });






    }
}

