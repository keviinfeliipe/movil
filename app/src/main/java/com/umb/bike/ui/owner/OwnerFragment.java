package com.umb.bike.ui.owner;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.umb.bike.databinding.FragmentOwnerBinding;

public class OwnerFragment extends Fragment {

    private FragmentOwnerBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        OwnerViewModel ownerViewModel =
                new ViewModelProvider(this).get(OwnerViewModel.class);

        binding = FragmentOwnerBinding.inflate(inflater,container,false);
        View root = binding.getRoot();
        final TextView textView = binding.textOwner;
        ownerViewModel.getText().observe(getViewLifecycleOwner(),textView::setText);
        return root;
    }
}