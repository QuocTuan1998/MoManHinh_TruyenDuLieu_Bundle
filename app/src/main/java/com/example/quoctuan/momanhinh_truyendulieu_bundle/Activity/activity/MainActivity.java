package com.example.quoctuan.momanhinh_truyendulieu_bundle.Activity.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.quoctuan.momanhinh_truyendulieu_bundle.R;

import com.example.quoctuan.momanhinh_truyendulieu_bundle.Activity.model.SanPham;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void xuLyMoVaGuiDuLieu(View view) {
        Intent intent = new Intent(MainActivity.this,ManHinh2Activity.class);
//        khởi tạo Bundle để đóng gói dữ liệu
        Bundle bundle = new Bundle();
//        thêm dữ liệu cơ sở vào bundle
        bundle.putInt("X",123);
        bundle.putChar("Y",'x');
        bundle.putFloat("D", 15.9f);
//      khởi tạo đối tượng và đẩy đối tượng vào bundle
        SanPham coca = new SanPham(1,"Coca",15000.0) ;
        bundle.putSerializable("SANPHAM",coca);
//      đẩy bundle vào intent
        intent.putExtra("BUNDLE",bundle);

        startActivity(intent);
    }
}
