package com.lenovo.androidlearningproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.nextActivityButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, TestActivity.class);
 //               i.putExtra("data", "hello lenovo!");
//                Bundle b = new Bundle();
//                b.putString("name", "lenovo");
//                b.putInt("age", 2);
//                i.putExtra("bundle",b);

                User user = new User("liuyc17", 26);
                i.putExtra("user", user);
                startActivity(i);
            }
        });

        System.out.println("onCreate11");
    }

}
