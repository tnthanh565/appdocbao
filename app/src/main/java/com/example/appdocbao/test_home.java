package com.example.appdocbao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import demo.CategoryAdapter;

import android.os.Bundle;
import demo.Book;
import demo.Category;
import java.util.ArrayList;
import java.util.List;

public class test_home extends AppCompatActivity {
    private RecyclerView rcvCategory;
    private CategoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_home);
        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvCategory.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter);

    }
    private List<Category> getListCategory() {
        List<Category> listCat = new ArrayList<>();

        List<Book> listBook = new ArrayList<>();
        listBook.add(new Book(R.drawable.img_1, "Book 1"));
        listBook.add(new Book(R.drawable.img_1, "Book 2"));
        listBook.add(new Book(R.drawable.img_1, "Book 3"));
        listBook.add(new Book(R.drawable.img_1, "Book 4"));

        listBook.add(new Book(R.drawable.img_1, "Book 1"));
        listBook.add(new Book(R.drawable.img_1, "Book 2"));
        listBook.add(new Book(R.drawable.img_1, "Book 3"));
        listBook.add(new Book(R.drawable.img_1, "Book 4"));

        listCat.add(new Category("Category 1", listBook));
        listCat.add(new Category("Category 2", listBook));
        listCat.add(new Category("Category 3", listBook));
        listCat.add(new Category("Category 4", listBook));
        listCat.add(new Category("Category 1", listBook));
        listCat.add(new Category("Category 1", listBook));

        return listCat;
    }
}