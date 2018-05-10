package com.example.timot.assignment1;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CreateReport extends Fragment {

    Context context;

    public CreateReport() {
        // Required empty public constructor
        this.context = context;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        final View view = inflater.inflate(R.layout.fragment_create_report, container, false);

        Button button = view.findViewById(R.id.submitButton);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                new AlertDialog.Builder(getActivity())
                        .setTitle("Submit Report")
                        .setMessage("Are you sure you want to submit your report to Administration ? (Reports need to be approved before showing) ").setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Snackbar.make(view, "Report Submitted Succesfully Thankyou for your help", Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();


                    }
                }).setNegativeButton("NO", null).show();

            }
        });


        return view;


    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


    }
}








