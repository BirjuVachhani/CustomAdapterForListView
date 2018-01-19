package com.birjuvachhani.customadapterforlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private String []titles;
    private String []desc;
    private int []images={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,
                            R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mlist=(ListView)findViewById(R.id.lv_list);

        titles=getResources().getStringArray(R.array.titles);
        desc=getResources().getStringArray(R.array.descriptions);
    }
}
