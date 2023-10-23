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

import demo.bxh;
import demo.bxhAdapter;
import demo.hot;
import demo.hotAdapter;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link kp#newInstance} factory method to
 * create an instance of this fragment.
 */
public class kp extends Fragment {
    private List<bxh> bxhList;
    RecyclerView rcvBXH;
    private demo.bxhAdapter bxhAdapter;

    public kp() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_kp, container, false);

        bxhList = addList();

        rcvBXH = rootView.findViewById(R.id.rcvBXH);
        rcvBXH.setLayoutManager(new LinearLayoutManager(getActivity()));
        bxhAdapter = new bxhAdapter(bxhList);
        rcvBXH.setAdapter(bxhAdapter);
        return rootView;
    }
    private List<bxh> addList(){
        List<bxh> bxhs = new ArrayList<>();
        bxhs.add(new bxh(R.drawable.ic_launcher_background, "jgfhksf"));
        bxhs.add(new bxh(R.drawable.ic_launcher_background, "khglsdaja"));
        bxhs.add(new bxh(R.drawable.ic_launcher_background, "jbkjs"));
        bxhs.add(new bxh(R.drawable.ic_launcher_background, "người chồng bất lực"));
        bxhs.add(new bxh(R.drawable.ic_launcher_background, "anh thợ sưả ống nước"));
        bxhs.add(new bxh(R.drawable.ic_launcher_background, "QUản lý"));
        bxhs.add(new bxh(R.drawable.ic_launcher_background, "Con ngoan"));

        return bxhs;
    }
}