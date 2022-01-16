package com.lalithsharma.chennaitourguideapp.View_Pager_Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lalithsharma.chennaitourguideapp.R;
import com.lalithsharma.chennaitourguideapp.adapter_Fragment.attraction_adapter;
import com.lalithsharma.chennaitourguideapp.dataModels_Fragments.attraction_dataModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class attraction_fragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<attraction_dataModel> attractionDataHolder;
    ArrayList<attraction_dataModel> arrAdd;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_attraction, container, false);
        recyclerView = view.findViewById(R.id.recyclerView_attraction);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
//
       attractionDataHolder = new ArrayList<>();

        attraction_dataModel ob1 = new attraction_dataModel(R.drawable.img1marina,"Marina Beach",
                "Marina beach ,chennai,60005, Tamil nadu, India.");
        attraction_dataModel ob2 = new attraction_dataModel(R.drawable.img2vallurkottam,"Valluvar Kottam",
                "147, Valluvar Kottam High Rd, Tirumurthy Nagar, Nungambakkam, Chennai, Tamil Nadu 600034");

        attraction_dataModel ob3 = new attraction_dataModel(R.drawable.img3elliotsbeach,"Elliot’s Beach",
                "Edward Elliot's Beach Chennai Address: 6th Avenue, Besant Nagar, Chennai, Tamil Nadu, 600090, India");

        attraction_dataModel ob4 = new attraction_dataModel(R.drawable.img4temple,"Ashtalakshmi Temple",
                "Mahalakshmi Kovil Street, Besant Nagar, Chennai — 600090.");

        attraction_dataModel ob5 = new attraction_dataModel(R.drawable.img5museum,"Government Museum",
                "Government Maternity Hospital, Pantheon Rd, Egmore, Chennai, Tamil Nadu 600008");

        attraction_dataModel ob6 = new attraction_dataModel(R.drawable.img6mylapore, "Universal Temple",
                "31, Ramakrishna Math Road, Alamelu Manga Puram, Venkatesa Agraharam, Mylapore, Chennai, Tamil Nadu 600004");

        attraction_dataModel ob7 = new attraction_dataModel(R.drawable.img7temple2,
                "Sri Parthasarathy Temple","Car St, Narayana Krishnaraja Puram, Triplicane, Chennai, Tamil Nadu 600005");

        attraction_dataModel ob8 = new attraction_dataModel(R.drawable.img8temple3,"Kapaleeswarar Temple",
                "Vadakku Maada Veethi, Mylapore, Vinayaka Nagar Colony, Mylapore, Chennai, Tamil Nadu, 600004, India");

        attraction_dataModel ob9 = new attraction_dataModel(R.drawable.img9library,"Connemara Public Library",
                "Government Maternity Hospital, Pantheon Rd, Egmore, Chennai, Tamil Nadu 600008");

        attraction_dataModel ob10 = new attraction_dataModel(R.drawable.img10lighthouse,"Light House",
                " Marina Beach Road, Marina Beach, Mylapore, Chennai, Tamil Nadu 600004");

       /* ArrayList <String> arrAdd = new ArrayList();
         arrAdd.add(0,"Marina Beach");
         arrAdd.add(1,"147, Valluvar Kottam High Rd, Tirumurthy Nagar, Nungambakkam, Chennai, Tamil Nadu 600034");
         arrAdd.add(2,"Edward Elliot's Beach Chennai Address: 6th Avenue, Besant Nagar, Chennai, Tamil Nadu, 600090, India");
         arrAdd.add(3,"Mahalakshmi Kovil Street, Besant Nagar, Chennai — 600090.");
         arrAdd.add(4,"Government Maternity Hospital, Pantheon Rd, Egmore, Chennai, Tamil Nadu 600008");
         arrAdd.add(5,"31, Ramakrishna Math Road, Alamelu Manga Puram, Venkatesa Agraharam, Mylapore, Chennai, Tamil Nadu 600004");
         arrAdd.add(6,"Sri Parthasarathy Temple Car St, Narayana Krishnaraja Puram, Triplicane, Chennai, Tamil Nadu 600005");
         arrAdd.add(7,"Vadakku Maada Veethi, Mylapore, Vinayaka Nagar Colony, Mylapore, Chennai, Tamil Nadu, 600004, India");
         arrAdd.add(8,"Government Maternity Hospital, Pantheon Rd, Egmore, Chennai, Tamil Nadu 600008");
         arrAdd.add(9," Marina Beach Road, Marina Beach, Mylapore, Chennai, Tamil Nadu 600004");

        ArrayList <Integer> images = new ArrayList<>();
        images.add(R.drawable.img1marina);
        images.add(R.drawable.img2vallurkottam);
        images.add(R.drawable.img3elliotsbeach);
        images.add(R.drawable.img4temple);
        images.add(R.drawable.img5museum);
        images.add(R.drawable.img6mylapore);
        images.add(R.drawable.img7temple2);
        images.add(R.drawable.img8temple3);
        images.add(R.drawable.img8temple3);
        images.add(R.drawable.img9library);
        images.add(R.drawable.img10lighthouse);

        ArrayList<String> header = new ArrayList<>();
        header.add("Marina Beach");
        header.add("Valluvar Kottam");
        header.add("Elliot’s Beach");
        header.add("Ashtalakshmi Temple");
        header.add("Government Museum");
        header.add("Universal Temple");
        header.add("Sri Parthasarathy Temple");
        header.add("Kapaleeswarar Temple");
        header.add("Connemara Public Library");
        header.add("Light House");*/




        recyclerView.setAdapter(new attraction_adapter(attractionDataHolder));


        return view;
    }
}