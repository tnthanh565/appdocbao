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

public class demoAdapter extends RecyclerView.Adapter<demoAdapter.demoViewHoler> {
    private List<demo> mdemos;
    public void setData(List<demo> list){
        this.mdemos = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public demoViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_demo,parent,false);
        return new demoViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull demoViewHoler holder, int position) {
        demo dm = mdemos.get(position);
        if(dm == null) {
            return;
        }
        holder.TS1I.setImageResource(demo.getResourceId());
        holder.TS1T.setText(dm.getTitle());

    }

    @Override
    public int getItemCount() {
        if(mdemos != null){
            return  mdemos.size();
        }

        return 0;
    }

    public static class demoViewHoler extends RecyclerView.ViewHolder{
        private ImageView TS1I;
        private TextView TS1T;

        public demoViewHoler(@NonNull View itemView) {
            super(itemView);


            TS1I = itemView.findViewById(R.id.ts1i);
            TS1T = itemView.findViewById(R.id.ts1t);


        }
    }
}
