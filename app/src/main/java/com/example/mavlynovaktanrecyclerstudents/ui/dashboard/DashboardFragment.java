package com.example.mavlynovaktanrecyclerstudents.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.airbnb.lottie.LottieAnimationView;
import com.example.mavlynovaktanrecyclerstudents.R;


public class DashboardFragment extends Fragment {


    private LottieAnimationView lotty;
    private TextView main_text;
    private Button btn_start;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        clickStart();
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dashboard, container, false);
        lotty = view.findViewById(R.id.lotty);
        main_text = view.findViewById(R.id.main_text);
        btn_start = view.findViewById(R.id.btn_start);

        lotty.setAnimation(R.raw.fun_time);
        return view;
    }


    private void clickStart() {
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavController navController = Navigation.findNavController(requireActivity(), R.id.nav_host_fragment_activity_main);
                navController.navigate(R.id.action_navigation_dashboard_to_navigation_home);
            }
        });
    }


}