package com.lalithsharma.chennaitourguideapp.adapter_Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lalithsharma.chennaitourguideapp.R;
import com.lalithsharma.chennaitourguideapp.dataModels_Fragments.attraction_dataModel;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class attraction_adapter extends RecyclerView.Adapter<attraction_adapter.viewholder> {

    ArrayList<attraction_dataModel> dataholder;


    public attraction_adapter(ArrayList<attraction_dataModel> dataholder) {
        this.dataholder = dataholder;
    }


    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerecyclerviewfragments,parent,false);
       return new viewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position) {

        holder.img.setImageResource(dataholder.get(position).getImage());
        holder.header.setText(dataholder.get(position).getHeader());
        holder.address.setText(dataholder.get(position).getAddress());


    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class viewholder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView header,address;

        public viewholder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.image_single_recyclerView);
            header = itemView.findViewById(R.id.thing_name_single_recyclerView);
            address = itemView.findViewById(R.id.address_single_recyclerView);

        }
    }

}
