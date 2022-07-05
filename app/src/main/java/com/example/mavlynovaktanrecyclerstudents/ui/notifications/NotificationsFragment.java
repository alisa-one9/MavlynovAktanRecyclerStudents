package com.example.mavlynovaktanrecyclerstudents.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mavlynovaktanrecyclerstudents.Day;
import com.example.mavlynovaktanrecyclerstudents.databinding.FragmentNotificationsBinding;

import java.util.ArrayList;

public class NotificationsFragment extends Fragment {

    private FragmentNotificationsBinding binding;
   private NotifAdapter adapter;
    private ArrayList<Day> list = new ArrayList<>();



    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new NotifAdapter();
        adapter.setList(list);
        createList();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentNotificationsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.rvPlan.setAdapter(adapter);
            }



    private void createList() {
        list.add(new Day("Я буду:"));
        list.add(new Day("Я буду:"));
        list.add(new Day("Я буду:"));
        list.add(new Day("Я буду:"));
        list.add(new Day("Я буду:"));
        list.add(new Day("Я буду:"));
        list.add(new Day("Я буду:"));
        list.add(new Day("Я буду:"));
        list.add(new Day("Я буду:"));
        list.add(new Day("Я буду:"));
        list.add(new Day("Я буду:"));
        list.add(new Day("Я буду:"));

    }


}