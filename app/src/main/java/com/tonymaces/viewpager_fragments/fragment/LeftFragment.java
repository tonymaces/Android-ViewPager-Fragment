package com.tonymaces.viewpager_fragments.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tonymaces.viewpager_fragments.R;
import com.tonymaces.viewpager_fragments.adapter.CarAdapter;
import com.tonymaces.viewpager_fragments.model.Car;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class LeftFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private ArrayList<Car> mCars;
    private CarAdapter mCarAdapter;

    public LeftFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_left, container, false);

        mRecyclerView = (RecyclerView) v.findViewById(R.id.rvCars);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(linearLayoutManager);

        LoadCars();
        IniAdapter();

        return v;
    }

    public  void  LoadCars() {
        mCars = new ArrayList<>();
        mCars.add(new Car(R.drawable.camarobleu,"Car Blue"));
        mCars.add(new Car(R.drawable.camarogrise,"Car Grise"));
        mCars.add(new Car(R.drawable.camaromarron,"Car Marrom"));
        mCars.add(new Car(R.drawable.camaropourpre,"Car Pourpre"));
        mCars.add(new Car(R.drawable.camarorose,"Car Rose"));



    }

    public  void IniAdapter(){
        mCarAdapter = new CarAdapter(mCars);
        mRecyclerView.setAdapter(mCarAdapter);
    }

}
