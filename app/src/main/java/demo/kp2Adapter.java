package demo;

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
import com.example.appdocbao.databinding.Item2Binding;
import com.example.appdocbao.databinding.ItemNewBinding;

import java.util.ArrayList;

public class kp2Adapter extends RecyclerView.Adapter<kp2Adapter.Kp2ViewHolder>{
    Context context;
    ArrayList<news> news;

    public kp2Adapter(Context context, ArrayList<news> news) {
        this.context = context;
        this.news = news;
    }

    @NonNull
    @Override
    public Kp2ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item2, parent,false);
        return new kp2Adapter.Kp2ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Kp2ViewHolder holder, int position) {
        news n = news.get(position);
        holder.binding.tvTitle.setText(n.getNewtitle());
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

    public class Kp2ViewHolder extends RecyclerView.ViewHolder{
        Item2Binding binding;

        public Kp2ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = Item2Binding.bind(itemView);
        }
    }
}
