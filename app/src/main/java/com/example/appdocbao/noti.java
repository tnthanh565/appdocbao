package com.example.appdocbao;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import demo.hot;

public class noti extends Fragment {


    private List<hot> hotList;
    RecyclerView rcvNot;
    public noti() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_noti, container, false);

        hotList = addList();

        rcvNot = rootView.findViewById(R.id.rcv_not);
        rcvNot.setLayoutManager(new LinearLayoutManager(getActivity()));

        return rootView;
    }
    private List<hot> addList(){
        List<hot> hots = new ArrayList<>();
        hots.add(new hot(R.drawable.img_1, "aaaaaaaaaaaaaaaaaaaaaaaaa"));
        hots.add(new hot(R.drawable.img_1, "aaaaaaaaaaaaaaaaaaaaaaaaa"));
        hots.add(new hot(R.drawable.img_1, "aaaaaaaaaaaaaaaaaaaaaaaaa"));
        hots.add(new hot(R.drawable.img_1, "aaaaaaaaaaaaaaaaaaaaaaaaa"));
        hots.add(new hot(R.drawable.img_1, "aaaaaaaaaaaaaaaaaaaaaaaaa"));
        hots.add(new hot(R.drawable.img_1, "aaaaaaaaaaaaaaaaaaaaaaaaa"));
        hots.add(new hot(R.drawable.img_1, "aaaaaaaaaaaaaaaaaaaaaaaaa"));

        return hots;
    }
}