package com.example.raghu.databetweenactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b=(Button)findViewById(R.id.button);
        et1=(EditText)findViewById(R.id.editText);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),Display.class);


                Bundle b=new Bundle();


                b.putString("name",et1.getText().toString());

                i.putExtras(b);


                startActivity(i);
            }
        });


    }
}
