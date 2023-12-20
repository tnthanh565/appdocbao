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
import com.example.appdocbao.databinding.Item1Binding;

import java.util.ArrayList;

public class kp1Adapter extends RecyclerView.Adapter<kp1Adapter.Kp1ViewHolder>{
    Context context;
    ArrayList<news> news;

    public kp1Adapter(Context context, ArrayList<news> news) {
        this.context = context;
        this.news = news;
    }

    @NonNull
    @Override
    public Kp1ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_1, parent,false);
        return new Kp1ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Kp1ViewHolder holder, int position) {
        news n = news.get(position);
        holder.binding.tvTitle1.setText(n.getNewtitle());
        Bitmap imageContent = BitmapFactory.decodeByteArray(n.getNewImage(), 0, n.getNewImage().length);
        holder.binding.imgNews1.setImageBitmap(imageContent);
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
    public class Kp1ViewHolder extends RecyclerView.ViewHolder{
        Item1Binding binding;

        public Kp1ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = Item1Binding.bind(itemView);
        }
    }
}
