package com.example.kouhai;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterQuiz extends RecyclerView.Adapter<AdapterQuiz.MyViewHolder> {
    private final ArrayList <Courses> myList;

    private OnRecyclerViewClickListener listener;

    public interface OnRecyclerViewClickListener{
        void OnItemClick(int position);
    }

    public void OnRecyclerViewClickListener (OnRecyclerViewClickListener listener){
        this.listener = listener;
    }

    //--> Constructor
    public AdapterQuiz(ArrayList<Courses> myList) {
        this.myList = myList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_quiz_grid,parent,false);
        return new MyViewHolder(view, listener);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Courses item = myList.get(position);
        holder.imageView_img.setImageResource(item.getImage());
        holder.textView_name.setText(item.getName());
    }

    @Override
    public int getItemCount() {
        return myList.size();
    }


    //--> My ViewHolder
    public static class MyViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView_img;
        public TextView textView_name;


        //--> Constructor
        public MyViewHolder(@NonNull View itemView, OnRecyclerViewClickListener listener) {
            super(itemView);

            imageView_img = itemView.findViewById(R.id.imageGrid);
            textView_name = itemView.findViewById(R.id.headlineGrid);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener!=null && getAbsoluteAdapterPosition()!=RecyclerView.NO_POSITION){
                        listener.OnItemClick(getAbsoluteAdapterPosition());
                    }
                }
            });
        }
    }

}
