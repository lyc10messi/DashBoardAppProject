package com.lenovo.androidlearningproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TestActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        Intent i = getIntent();
        tv = (TextView) findViewById(R.id.tv);
        //tv.setText(i.getStringExtra("data"));
//        Bundle data  = i.getExtras();
//        tv.setText(String.format("name=%s, age=%d, name=%s", data.getString("name")
//                , data.getInt("age"), data.getString("name1", "leo")));
        User user = i.getParcelableExtra("user");
        tv.setText(String.format("UserInfo is : name %s age %d", user.getName(), user.getAge() ));


        findViewById(R.id.browseButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.baidu.com")));
            }
        });
    }

}
