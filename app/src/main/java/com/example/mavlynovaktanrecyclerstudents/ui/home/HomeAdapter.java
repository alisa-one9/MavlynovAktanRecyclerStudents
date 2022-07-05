package com.example.mavlynovaktanrecyclerstudents.ui.home;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.mavlynovaktanrecyclerstudents.Day;
import com.example.mavlynovaktanrecyclerstudents.R;
import com.example.mavlynovaktanrecyclerstudents.databinding.ItemDaysBinding;

import java.util.ArrayList;
import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private ItemDaysBinding binding;
    private List<Day> day_list = new ArrayList<>();
        private NavController navController;

    public HomeAdapter() {
    }

    public void setList(ArrayList<Day> day_list) {
        this.day_list = day_list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        binding = ItemDaysBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding.getRoot());
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(day_list.get(position));

    }
    @Override
    public int getItemCount() {
        return day_list.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(v -> {
                navController = Navigation.findNavController((Activity) itemView.getContext(),
                        R.id.nav_host_fragment_activity_main);
                navController.navigate(R.id.action_navigation_home_to_navigation_notifications);
            });
        }

        public void onBind(Day day) {
            Glide.with(binding.getRoot())
                    .load(day.getDayImage())
                    .centerCrop()
                    .into(binding.imageDay);
            binding.nameDay.setText(day.getName_day());


        }
    }
}

