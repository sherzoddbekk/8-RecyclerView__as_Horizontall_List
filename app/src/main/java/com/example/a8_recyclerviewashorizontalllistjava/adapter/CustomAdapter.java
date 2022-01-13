package com.example.a8_recyclerviewashorizontalllistjava.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a8_recyclerviewashorizontalllistjava.R;
import com.example.a8_recyclerviewashorizontalllistjava.model.Member;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<Member> members;
    Context context;

    public CustomAdapter(List<Member> members, Context context) {
        this.members = members;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_custom_view,parent,false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Member member = members.get(position);

        if (holder instanceof CustomViewHolder){

            TextView first_name = ((CustomViewHolder) holder).firstName;
            TextView last_name = ((CustomViewHolder) holder).lastName;
            first_name.setText(member.getFirstName());
            last_name.setText(member.getLastName());
        }
    }

    @Override
    public int getItemCount() {
        return members.size();
    }
    private  class CustomViewHolder extends  RecyclerView.ViewHolder{

        TextView firstName,lastName;
        View view;
        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);
            view = itemView;
            firstName = itemView.findViewById(R.id.firstName);
            lastName = itemView.findViewById(R.id.lastName);
        }
    }
}
