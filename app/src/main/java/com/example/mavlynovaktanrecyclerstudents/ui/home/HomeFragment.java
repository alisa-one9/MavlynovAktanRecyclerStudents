package com.example.mavlynovaktanrecyclerstudents.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.mavlynovaktanrecyclerstudents.Day;
import com.example.mavlynovaktanrecyclerstudents.R;
import com.example.mavlynovaktanrecyclerstudents.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HomeFragment extends Fragment  {
    FragmentHomeBinding binding;
    private HomeAdapter adapter;
    private ArrayList<Day> list = new ArrayList<>();


    public HomeFragment() {
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new HomeAdapter();
        adapter.setList(list);
        createList();

    }


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.rvDays.setAdapter(adapter);
           }


    private void createList() {
        list.add(new Day("9 -16 июня", R.drawable.summer08));
        list.add(new Day("16 -23 июня", R.drawable.summer033));
        list.add(new Day("24 июня -2 июля", R.drawable.summer044));
        list.add(new Day("25 июня- 2июля", R.drawable.summer055));
        list.add(new Day("3 июля-10 июля", R.drawable.summer066));
        list.add(new Day("11 июля-18 июля", R.drawable.summer077));
        list.add(new Day("19 июля-24 июля", R.drawable.summer08));
        list.add(new Day("25 июля- 2 августа", R.drawable.summer09));
        list.add(new Day("3 августа - 10 августа", R.drawable.summer10));
        list.add(new Day("11 августа -18 августа", R.drawable.summer11));
        list.add(new Day("19 августа - 26 августа", R.drawable.summer12));
        list.add(new Day("27 августа -4 сентября ", R.drawable.summer02));

    }

}