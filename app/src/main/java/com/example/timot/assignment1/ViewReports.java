package com.example.timot.assignment1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;



/**
 * A simple {@link Fragment} subclass.
 */
public class ViewReports extends Fragment {


    RecyclerView recyclerView;
    incidentAdapter incidentAdapter;
    List<Incident> incidentList;


    public ViewReports() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_reports, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        incidentList = new ArrayList<>();


        recyclerView = getView().findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        incidentList.add(new Incident("Tonsley", "Serious", "Help we Neeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeedddddddddddddddddddddddddddddd HELPPPPPPPPPPPPP", "Bob", "123456789"));
        incidentList.add(new Incident("Bedford", "Serious", "Help we Neeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeedddddddddddddddddddddddddddddd HELPPPPPPPPPPPPP", "Bob", "123456789"));
        incidentList.add(new Incident("Sturt", "Serious", "Help we Neeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeedddddddddddddddddddddddddddddd HELPPPPPPPPPPPPP", "Bob", "123456789"));


        incidentAdapter = new incidentAdapter(getContext(), incidentList);
        recyclerView.setAdapter(incidentAdapter);

    }
}
