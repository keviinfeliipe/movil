package com.umb.bike.ui.report;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.umb.bike.R;
import com.umb.bike.databinding.FragmentReportBinding;


public class ReportFragment extends Fragment {

    private FragmentReportBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ReportViewModel reportViewModel =
                new ViewModelProvider(this).get(ReportViewModel.class);

        binding = FragmentReportBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        final TextView textView=binding.textReport;
        reportViewModel.getmText().observe(getViewLifecycleOwner(),textView::setText);

        return root;
    }
}