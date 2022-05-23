package com.umb.bike.ui.storage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.umb.bike.R;
import com.umb.bike.data.entity.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter  extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<Vehicle> vehicleList = new ArrayList<>();
    public static class ViewHolder extends RecyclerView.ViewHolder{

        private TextView name, plate;

        ViewHolder(View itemView){
            super(itemView);
            name=itemView.findViewById(R.id.name);
            plate=itemView.findViewById(R.id.placa);
        }

        public void bindData(final Vehicle vehicle){
            name.setText(vehicle.getPersonId());
            plate.setText(vehicle.getPlate());
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_element, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindData(vehicleList.get(position));
    }

    @Override
    public int getItemCount() {
        return vehicleList.size();
    }

    public void setVehicleList(List<Vehicle> vehicleList) {
        this.vehicleList = vehicleList;
        notifyDataSetChanged();
    }

}
