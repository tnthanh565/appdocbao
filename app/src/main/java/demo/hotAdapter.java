package demo;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.appdocbao.R;

import java.util.List;

public class hotAdapter extends RecyclerView.Adapter<hotAdapter.hotViewHoler> {

    private List<hot> hotList;

    public hotAdapter(List<hot> hotList) {
        this.hotList = hotList;
    }

    @NonNull
    @Override
    public hotViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hot, parent, false);
        return new hotViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull hotViewHoler holder, int position) {
        hot hot = hotList.get(position);
        holder.imghot.setImageResource(hot.getImgHot());
        holder.tvhot.setText(hot.getTvHots());
    }

    @Override
    public int getItemCount() {

        return hotList.size();
    }

    public static class hotViewHoler extends RecyclerView.ViewHolder {
        private ImageView imghot;
        private TextView tvhot;

        public hotViewHoler(@NonNull View itemView) {
            super(itemView);


            imghot = itemView.findViewById(R.id.img_hot);
            tvhot = itemView.findViewById(R.id.tv_hot);


        }
    }

}
