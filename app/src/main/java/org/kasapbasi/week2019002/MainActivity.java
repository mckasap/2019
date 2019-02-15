package org.kasapbasi.week2019002;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btgit;

    class mylistener implements  View.OnClickListener{
        @Override
        public void onClick(View view) {

            Intent myInt = new Intent(MainActivity.this,Main2Activity.class);

            startActivity(myInt);
            Toast.makeText(MainActivity.this," HELLLO",Toast.LENGTH_LONG).show();
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btgit= (Button) findViewById(R.id.btnGo);


        btgit.setOnClickListener(new mylistener());
    }
}
