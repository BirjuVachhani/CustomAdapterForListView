package com.birjuvachhani.customadapterforlistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by birju.vachhani on 19/01/18.
 */

public class CustomAdapter extends ArrayAdapter<String> {

    private Context context;
    private String []titles;
    private String []desc;
    private int []images;
    private int singleRowLayoutId;

    public CustomAdapter(Context context, int singleRowLayoutId, String []titles, String []desc, int []images ) {
        super(context, singleRowLayoutId,titles);
        this.context=context;
        this.titles=titles;
        this.desc=desc;
        this.images=images;
        this.singleRowLayoutId=singleRowLayoutId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View row=convertView;
        CustomViewHolder holder=null;
        if(row==null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            //view object of single row of list view
            row = inflater.inflate(singleRowLayoutId, parent, false);
            //by using holder, we make sure that findViewById() is not called every time.
            holder=new CustomViewHolder(row);
            row.setTag(holder);
        }
        else
        {
            holder=(CustomViewHolder)row.getTag();
        }

        holder.mimg.setImageResource(images[position]);
        holder.mtitle.setText(titles[position]);
        holder.mdesc.setText(desc[position]);

        return row;
    }

    class CustomViewHolder {
        private ImageView mimg;
        private TextView mtitle;
        private TextView mdesc;

        CustomViewHolder(View view)
        {
            mimg=(ImageView)view.findViewById(R.id.iv_img);
            mtitle=(TextView)view.findViewById(R.id.tv_title);
            mdesc=(TextView)view.findViewById(R.id.tv_desc);
        }
    }
}
