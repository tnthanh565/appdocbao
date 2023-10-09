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

    private List<hot> mhot;

    public hotAdapter(List<hot> mhot) {
        this.mhot = mhot;
    }

    @NonNull
    @Override
    public hotViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hot, parent, false);
        return new hotViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull hotViewHoler holder, int position) {
        hot hot = mhot.get(position);
        if (hot == null) {
            return;
        }
        holder.imghot.setImageResource(hot.getImgBXH());
        holder.tvhot.setText(hot.getTvhot());
    }

    @Override
    public int getItemCount() {
        if (mhot != null) {
            return mhot.size();
        }
        return 0;
    }

    public class hotViewHoler extends RecyclerView.ViewHolder {
        private ImageView imghot;
        private TextView tvhot;

        public hotViewHoler(@NonNull View itemView) {
            super(itemView);


            imghot = itemView.findViewById(R.id.img_hot);
            tvhot = itemView.findViewById(R.id.tv_hot);


        }
    }

}
