package com.umb.bike.ui.storage;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.umb.bike.R;
import com.umb.bike.databinding.FragmentStorageBinding;

public class StorageFragment extends Fragment {

    private FragmentStorageBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        StorageViewModel storageViewModel = new ViewModelProvider(this).get(StorageViewModel.class);


        binding = FragmentStorageBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        RecyclerView recyclerView = root.findViewById(R.id.listVehicle);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);

        final ListAdapter listAdapter = new ListAdapter();
        recyclerView.setAdapter(listAdapter);
        //storageViewModel.deleleAllVehicle();
        storageViewModel.getData().observe(getViewLifecycleOwner(),
                vehicles -> listAdapter.setVehicleList(vehicles));

        return root;
    }




}