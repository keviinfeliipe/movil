package com.umb.bike.ui.vehicle;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import com.umb.bike.data.entity.Vehicle;
import com.umb.bike.databinding.FragmentVehicleBinding;


public class VehicleFragment extends Fragment {

    private FragmentVehicleBinding binding;
    private VehicleViewModel vehicleViewModel;
    private EditText plate;
    private EditText personId;
    private EditText serial;
    private EditText brand;
    private EditText color;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        vehicleViewModel = new ViewModelProvider(this).get(VehicleViewModel.class);

        binding = FragmentVehicleBinding.inflate(inflater,container,false);
        View root = binding.getRoot();

        final Spinner spinner = binding.spVehicleClass;
        String[] options = {"Carro","Moto"};

        final Button button = binding.btSave;

        plate = binding.etPlate;
        personId = binding.etPersonId;
        brand = binding.etBrand;
        color = binding.etColor;
        serial=binding.etSerial;

        button.setOnClickListener(view -> {
            Log.i("plate", plate.getText().toString());
            Log.i("personId", plate.getText().toString());
            Log.i("serial", serial.getText().toString());
            Log.i("brand", brand.getText().toString());
            Log.i("color", color.getText().toString());
            Log.i("vehicle class", spinner.getSelectedItem().toString());

            vehicleViewModel.insert(new Vehicle(
                    plate.getText().toString(),
                    personId.getText().toString(),
                    spinner.getSelectedItem().toString(),
                    serial.getText().toString(),
                    brand.getText().toString(),
                    color.getText().toString()
            ));
            clearInput();
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, options);
        spinner.setAdapter(adapter);

        return root;
    }

    public void clearInput(){
        plate.setText("");
        personId.setText("");
        brand.setText("");
        color.setText("");
        serial.setText("");
        Toast.makeText(getContext(),"Se guardó el usuario con exitó", Toast.LENGTH_SHORT).show();
    }

}