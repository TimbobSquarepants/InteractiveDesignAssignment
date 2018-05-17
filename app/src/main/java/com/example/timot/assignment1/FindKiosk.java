package com.example.timot.assignment1;


import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class FindKiosk extends Fragment implements OnMapReadyCallback {

    private GoogleMap mMap;

    public static final CameraPosition TONSLEY =
            new CameraPosition.Builder().target(new LatLng(-33.891614, 151.276417))
                    .zoom(15.5f)
                    .bearing(300)
                    .tilt(50)
                    .build();

    public static final CameraPosition BEDFORD =
            new CameraPosition.Builder().target(new LatLng(-33.87365, 151.20689))
                    .zoom(15.5f)
                    .bearing(0)
                    .tilt(25)
                    .build();

    public static final CameraPosition STURT =
            new CameraPosition.Builder().target(new LatLng(-33.87365, 151.20689))
                    .zoom(15.5f)
                    .bearing(0)
                    .tilt(25)
                    .build();

    public static final CameraPosition MEDICALCENTRE =
            new CameraPosition.Builder().target(new LatLng(-33.87365, 151.20689))
                    .zoom(15.5f)
                    .bearing(0)
                    .tilt(25)
                    .build();

    public FindKiosk() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.activity_maps, container, false);
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        return view;
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // Add a marker in Sydney and move the camera
        LatLng tonsley = new LatLng(-35.007925, 138.571887);
        mMap.addMarker(new MarkerOptions().position(tonsley).title("Security Kiosk Tonsley").snippet("located on level three across from the elevators"));
        LatLng bedford = new LatLng(-35.0216942, 138.5682452);
        mMap.addMarker(new MarkerOptions().position(bedford).title("Security Kiosk Bedford").snippet("Located in the student hub on level 2"));
        LatLng medical = new LatLng(-35.020886, 138.5668933);
        mMap.addMarker(new MarkerOptions().position(medical).title("Security Kiosk Medical Centre").snippet("Located on Level 2 next to the main Canteen"));
        LatLng sturt = new LatLng(-35.020997, 138.572649);
        mMap.addMarker(new MarkerOptions().position(sturt).title("Security Kiosk Sturt").snippet("Located in main Sturt building level 1 next to reception"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(tonsley));

        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(tonsley, 14));

        if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
    }


}
