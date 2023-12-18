package demo;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdocbao.R;
import com.example.appdocbao.databinding.ItemNewBinding;
import com.example.appdocbao.homefragment;

import java.util.ArrayList;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder>{
    Context context;
    ArrayList<news> news;

    public NewsAdapter(Context context, ArrayList<news> news) {
        this.context = context;
        this.news = news;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_new, parent,false);
        return new NewsAdapter.NewsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsViewHolder holder, int position) {
        news n = news.get(position);
        holder.binding.tvTitleNews.setText(n.getNewtitle());
        Bitmap imageContent = BitmapFactory.decodeByteArray(n.getNewImage(), 0, n.getNewImage().length);
        holder.binding.imgNews.setImageBitmap(imageContent);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse(n.getPath());
                context.startActivity(new Intent(Intent.ACTION_VIEW,uri));
            }
        });
    }


    @Override
    public int getItemCount() {
        return news.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder{
        ItemNewBinding binding;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = ItemNewBinding.bind(itemView);
        }
    }
}
