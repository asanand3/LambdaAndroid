package net.anandsingh.lambdaandroid.lambdaandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button lamdaTest = (Button) findViewById(R.id.button);

        lamdaTest.setOnClickListener(v -> {
            Log.i("Result:", "Hello");
        });

        runOnUiThread(() -> Log.i("Result:", "Hello"));

        new Thread(()-> Log.i("Result:", "Hello")).start();

    }

}
