package com.example.mavlynovaktanrecyclerstudents.ui.notifications;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mavlynovaktanrecyclerstudents.Day;
import com.example.mavlynovaktanrecyclerstudents.OnItemClickListener;
import com.example.mavlynovaktanrecyclerstudents.databinding.ItemPlanBinding;

import java.util.ArrayList;
import java.util.List;

public class NotifAdapter extends RecyclerView.Adapter<NotifAdapter.ViewHolder> {

    ItemPlanBinding binding;
    private List<Day> plan_list = new ArrayList<>();
    private int position;
    private OnItemClickListener onItemClickListener;


    public NotifAdapter() {
    }
    public void setList(ArrayList<Day> plan_list) {
        this.plan_list = plan_list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding =ItemPlanBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new ViewHolder(binding.getRoot()) ;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    holder.onBind(plan_list.get(position));
    }

    @Override
    public int getItemCount() {
        return plan_list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });
        }

        public void onBind(Day day) {

            binding.textViewPlan.setText(day.getPlan_text());
        }
    }
}
