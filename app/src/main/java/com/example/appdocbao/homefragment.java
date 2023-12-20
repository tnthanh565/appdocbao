package com.example.appdocbao;

import static android.content.Intent.getIntent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.appdocbao.databinding.FragmentHomefragmentBinding;

import java.util.ArrayList;

import demo.NewsAdapter;
import demo.kp2Adapter;
import demo.news;

public class homefragment extends Fragment {

    SearchView searchView;
    ArrayList<news> news;
    NewsAdapter adapter;
    View view;
    ImageView img;

    public homefragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_homefragment, container, false);

        img = view.findViewById(R.id.img_news);
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(), Login.class);
//                startActivity(intent);
//            }
//        });

        searchView = view.findViewById(R.id.searchview);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                searchList(newText);
                return true;
            }
        });

        database db = new database(getActivity());
        news = db.getAllnews();
        RecyclerView rcv = view.findViewById(R.id.rcv_new);
        adapter = new NewsAdapter(getActivity(), news);
        rcv.setAdapter(adapter);
        rcv.hasFixedSize();
        rcv.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);
        rcv.addItemDecoration(itemDecoration);

        RecyclerView rcv2 = view.findViewById(R.id.rcv_new2);
        kp2Adapter adapter = new kp2Adapter(getActivity(), news);
        rcv2.setAdapter(adapter);
        rcv2.hasFixedSize();
        rcv2.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView.ItemDecoration itemDecoration2 = new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);
        rcv2.addItemDecoration(itemDecoration2);

        return view;
    }

    private void searchList(String Text) {
        ArrayList<news> newsSearchList = new ArrayList<>();
        for (news news1 : news){
            if (news1.getNewtitle().toLowerCase().contains(Text.toLowerCase())) {
                newsSearchList.add(news1);
            }
        }
        if (newsSearchList.isEmpty()){
            Toast.makeText(getActivity(),"Not found", Toast.LENGTH_SHORT).show();
        }
        else {
            adapter.setSearchList(newsSearchList);
        }
    }

}