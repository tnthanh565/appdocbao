package com.example.appdocbao;

import static android.content.Intent.getIntent;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import com.example.appdocbao.databinding.FragmentHomefragmentBinding;

import java.util.ArrayList;

import demo.NewsAdapter;
import demo.news;

public class homefragment extends Fragment {

    Button button2;
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

        button2 = view.findViewById(R.id.button2);
        img = view.findViewById(R.id.img_news);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Login.class);
                startActivity(intent);
            }
        });

        database db = new database(getActivity());
        ArrayList<news> news = db.getAllnews();
        RecyclerView rcv = view.findViewById(R.id.rcv_new);
        NewsAdapter adapter = new NewsAdapter(getActivity(), news);
        rcv.setAdapter(adapter);
        rcv.hasFixedSize();
        rcv.setLayoutManager(new LinearLayoutManager(getActivity()));
        RecyclerView.ItemDecoration itemDecoration = new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);
        rcv.addItemDecoration(itemDecoration);



        return view;
    }

    private void gotURL(String path) {
        Uri uri = Uri.parse(path);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}