package com.example.appdocbao;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import demo.bxh;
import demo.bxhAdapter;
import demo.hot;
import demo.hotAdapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvBXH;
    private RecyclerView rcvhot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvBXH = findViewById(R.id.rcv_bxh);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvBXH.setLayoutManager(linearLayoutManager1);

        bxhAdapter adapter1 = new bxhAdapter(getListbxh());
        rcvBXH.setAdapter(adapter1);

        rcvhot = findViewById(R.id.rcv_hot);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rcvhot.setLayoutManager(linearLayoutManager2);

        hotAdapter adapter2 = new hotAdapter(getListhot());
        rcvhot.setAdapter(adapter2);
    }

    private List<bxh> getListbxh(){
        List<bxh> list = new ArrayList<>();
        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));
        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));
        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));
        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));
        return list;
    }

    private List<hot> getListhot(){
        List<hot> list = new ArrayList<>();
        list.add(new hot(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));
        list.add(new hot(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        list.add(new hot(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        list.add(new hot(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));



        return list;
    }
}