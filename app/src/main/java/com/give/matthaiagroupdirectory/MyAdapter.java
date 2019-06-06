package com.give.matthaiagroupdirectory;


import android.support.v7.widget.RecyclerView;
import android.transition.CircularPropagation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder> {

    ArrayList<String> names= new ArrayList<>();
    ArrayList<String> details = new ArrayList<>();
    ArrayList<String> phones = new ArrayList<>();
    public MyAdapter(){
/*
        names.add("name1");
        names.add("name2");
        names.add("name3");
        names.add("name4");
        names.add("name5");

        details.add("details1");
        details.add("details2");
        details.add("details3");
        details.add("details4");
        details.add("details5");
*/

    }

    public void add(String name, String phone, String detail) {
        names.add(name);
        phones.add(phone);
        details.add(detail);

    }

    //INITIALIE VH
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent,false);
        MyHolder holder=new MyHolder(v);

        return holder;
    }

    //BIND DATA
    @Override
    public void onBindViewHolder(final MyHolder holder, int position) {
        holder.memberName.setText(names.get(position));
        holder.details.setText(details.get(position));
    }

    /*
    TOTAL ITEMS
     */
    @Override
    public int getItemCount() {
        return names.size();
    }


    /*
    VIEW HOLDER CLASS
     */
    class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener  {

        TextView memberName;
        TextView details;
        CircleImageView image;

        public MyHolder(View itemView) {
            super(itemView);

            this.memberName= (TextView) itemView.findViewById(R.id.name);
            this.details= (TextView) itemView.findViewById(R.id.details);
            this.image= (CircleImageView) itemView.findViewById(R.id.image);


            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View view) {

        }
    }
}
