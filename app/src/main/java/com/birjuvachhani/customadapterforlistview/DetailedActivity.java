package com.birjuvachhani.customadapterforlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        SquareImageView mimg = (SquareImageView) findViewById(R.id.iv_img);
        TextView mtitle=(TextView)findViewById(R.id.tv_title);
        TextView mdesc=(TextView)findViewById(R.id.tv_desc);

        if(getIntent()!=null) {
            Intent intent=getIntent();
            String title = intent.getStringExtra(Constants.TITLE_LABEL);
            String desc = intent.getStringExtra(Constants.DESC_LABEL);
            int imageId = intent.getIntExtra(Constants.IMAGE_LABEL,0);

            mimg.setImageResource(imageId);

            /*DisplayMetrics metrics=new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(metrics);
            int height=metrics.widthPixels;
            mimg.setMinimumHeight(height);*/

            mtitle.setText(title);
            mdesc.setText(desc);
        }
    }
}
