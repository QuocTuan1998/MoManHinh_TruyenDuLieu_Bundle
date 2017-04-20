package com.example.quoctuan.momanhinh_truyendulieu_bundle.Activity.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.quoctuan.momanhinh_truyendulieu_bundle.R;

public class ManHinh2Activity extends AppCompatActivity {

    TextView txtKQ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh2);

        addConTrols();
    }

    private void addConTrols() {
        txtKQ = (TextView) findViewById(R.id.txtKQ);
//        lấy Bundle
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("BUNDLE");
//        nhận dữ liệu
        txtKQ.setText(
                "X = " + bundle.getInt("X") + "\n" +
                "Y = "+ bundle.getChar("Y") + "\n" +
                "D = "+ bundle.getFloat("D") + "\n" +
                "Sản Phẩm = " + bundle.getSerializable("SANPHAM")
        );
    }
}
