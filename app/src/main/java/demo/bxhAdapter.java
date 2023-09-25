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

public class bxhAdapter extends RecyclerView.Adapter<bxhAdapter.bxhViewHoler>{

    private List<bxh> mbxh;

    public bxhAdapter(List<bxh> mbxh) {
        this.mbxh = mbxh;
    }

    @NonNull
    @Override
    public bxhViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bxh,parent,false);
        return new bxhViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull bxhViewHoler holder, int position) {
        bxh bxh = mbxh.get(position);
        if(bxh == null) {
            return;
        }
        holder.imgbxh.setImageResource(bxh.getImgBXH());
        holder.tvbxh.setText(bxh.getTvBXH());
    }

    @Override
    public int getItemCount() {
        if(mbxh != null){
            return  mbxh.size();
        }
        return 0;
    }

    public class bxhViewHoler extends RecyclerView.ViewHolder{
        private ImageView imgbxh;
        private TextView tvbxh;

        public bxhViewHoler(@NonNull View itemView) {
            super(itemView);


            imgbxh = itemView.findViewById(R.id.img_bxh);
            tvbxh = itemView.findViewById(R.id.tv_bxh);


        }
    }

}
