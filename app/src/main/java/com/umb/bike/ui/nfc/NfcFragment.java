package com.umb.bike.ui.nfc;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.umb.bike.R;
import com.umb.bike.databinding.FragmentNfcBinding;

public class NfcFragment extends Fragment {

    private FragmentNfcBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        NfcViewModel nfcViewModel =
                new ViewModelProvider(this).get(NfcViewModel.class);

        binding = FragmentNfcBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        final TextView textView = binding.textNfc;
        nfcViewModel.getmText().observe(getViewLifecycleOwner(),textView::setText);



        return root;
    }
}