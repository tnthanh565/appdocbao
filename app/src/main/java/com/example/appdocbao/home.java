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

public class home extends AppCompatActivity {

    private RecyclerView rcvBXH;
    private RecyclerView rcvhot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvBXH = findViewById(R.id.rcv_bxh);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvBXH.setLayoutManager(linearLayoutManager);

        bxhAdapter adapter = new bxhAdapter(getListbxh());
        rcvBXH.setAdapter(adapter);
    }

    private List<bxh> getListbxh(){
        List<bxh> list = new ArrayList<>();
        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));
        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        list.add(new bxh(R.drawable.ts1 , "Vợ ung thư mang 140 triệu"));

        return list;
    }

}