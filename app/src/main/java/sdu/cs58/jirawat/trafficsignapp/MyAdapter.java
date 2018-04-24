package sdu.cs58.jirawat.trafficsignapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 37-SDU on 3/28/2018.
 */

//class นี้ทำหน้าที่สร้าง Layout เสมือนเพื่อนำไปเเสดงผมในหน้า MainActivity

public class MyAdapter extends BaseAdapter{
    //Explicit
    private Context context;
    private int[] ints;
    private String[] titleStrings,detailStrings;

    public MyAdapter(Context context, int[] ints, String[] titleStrings, String[] detailStrings) {
        this.context = context;
        this.ints = ints;
        this.titleStrings = titleStrings;
        this.detailStrings = detailStrings;
    }

    @Override
    public int getCount() {//นับจำนวนข้อมูลใน Array เเล้วส่งข้อมูลไปยัง Method getView()
        return ints.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {//หน้าที่ของ Method คือรับข้อมูลจาก getCount () มาเเสดงผล
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview,viewGroup,false);

        //ผูกตัวแปร JAVA กับอิลิเมนท์บร XML ที่หน้า my_listview
        ImageView imageView = view1.findViewById(R.id.imageView2);
        TextView titleTextview = view1.findViewById(R.id.textView2);
        TextView detailTextview = view1.findViewById(R.id.textView3);

        //Show data นำข้อมูลไปเเสดงบนเเอป
        imageView.setImageResource(ints[i]);
        titleTextview.setText(titleStrings[i]);
        detailTextview.setText(detailStrings[i]);
        return view1;


    }
}//end class

