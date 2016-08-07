package com.tonymaces.viewpager_fragments.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tonymaces.viewpager_fragments.model.Car;
import com.tonymaces.viewpager_fragments.R;

import java.util.List;

/**
 * Created by tonym on 06/08/2016.
 */
public class CarAdapter extends  RecyclerView.Adapter<CarAdapter.CarViewHolder> {

    private List<Car> mCars;

    public CarAdapter(List<Car> cars) {
        this.mCars = cars;
    }

    @Override

    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView =  LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item,parent,false);
        return new CarViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {
        Car car = mCars.get(position);
        holder.mPhoto.setImageResource(car.getPhoto());
        holder.mName.setText(car.getName());
    }

    @Override
    public int getItemCount() {
        return  mCars.size();
    }

    public  static class CarViewHolder extends RecyclerView.ViewHolder{

        private ImageView mPhoto;
        private TextView mName;

        public CarViewHolder(View itemView) {
            super(itemView);
            mPhoto = (ImageView) itemView.findViewById(R.id.imgPhoto);
            mName = (TextView) itemView.findViewById(R.id.tvName);
        }
    }

}
