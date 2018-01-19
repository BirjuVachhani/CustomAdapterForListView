package com.birjuvachhani.customadapterforlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private String []titles;
    private String []desc;
    private int []images={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,
                            R.drawable.img6,R.drawable.img7,R.drawable.img8,R.drawable.img9,R.drawable.img10,
                            R.drawable.img11,R.drawable.img12,R.drawable.img13,R.drawable.img14,R.drawable.img15,
                            R.drawable.img16,R.drawable.img17,R.drawable.img18,R.drawable.img19,R.drawable.img20};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mlist=(ListView)findViewById(R.id.lv_list);

        titles=getResources().getStringArray(R.array.titles);
        desc=getResources().getStringArray(R.array.descriptions);

        CustomAdapter adapter=new CustomAdapter(MainActivity.this,R.layout.layout_single_row,titles,desc,images);
        mlist.setAdapter(adapter);
        mlist.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent(MainActivity.this,DetailedActivity.class);
        intent.putExtra(Constants.TITLE_LABEL,titles[position]);
        intent.putExtra(Constants.DESC_LABEL,desc[position]);
        intent.putExtra(Constants.IMAGE_LABEL,images[position]);
        startActivity(intent);
    }

}
