package com.example.appdocbao;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import demo.NewsAdapter;
import demo.kp1Adapter;
import demo.kp2Adapter;
import demo.news;


public class kp extends Fragment {

    public kp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_kp, container, false);
        database db = new database(getActivity());
        ArrayList<news> news = db.getAllnews();

        RecyclerView rcv1 = view.findViewById(R.id.rcvKp1);
        kp1Adapter adapter1 = new kp1Adapter(getActivity(), news);
        rcv1.setAdapter(adapter1);
        rcv1.hasFixedSize();
        rcv1.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        RecyclerView rcv2 = view.findViewById(R.id.rcvKp2);
        kp2Adapter adapter = new kp2Adapter(getActivity(), news);
        rcv2.setAdapter(adapter);
        rcv2.hasFixedSize();
        rcv2.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);
        rcv2.addItemDecoration(itemDecoration);

        return view;
    }

}