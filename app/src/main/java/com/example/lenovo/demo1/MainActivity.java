package com.example.lenovo.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
/*生命周期---获得焦点*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}
