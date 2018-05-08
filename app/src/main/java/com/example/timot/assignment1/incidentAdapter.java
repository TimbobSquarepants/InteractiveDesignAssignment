package com.example.timot.assignment1;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Creates an adapter to manage the information from the ioncidents and add it into the recycler view
 */

public class incidentAdapter extends RecyclerView.Adapter<incidentAdapter.IncidentViewHolder> {


    private Context context;
    private List<Incident> incidentList;


    public incidentAdapter(Context context, List<Incident> incidentList) {
        this.context = context;
        this.incidentList = incidentList;
    }

    @NonNull
    @Override
    public IncidentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_layout, null);

        IncidentViewHolder incidentViewHolder = new IncidentViewHolder(view);

        return incidentViewHolder;

    }


    /**
     * binds incidents data to recycler view elements..
     *
     * @param holder
     * @param position
     */
    @Override
    public void onBindViewHolder(@NonNull IncidentViewHolder holder, int position) {


        Incident incident = incidentList.get(position);

        holder.textViewLocation.setText(incident.getLocation());
        holder.textViewStatus.setText(incident.getStatus());
        holder.textViewDescription.setText(incident.getDescription());


    }


    /**
     * size of the list.
     *
     * @return
     */

    @Override
    public int getItemCount() {
        return incidentList.size();
    }


    /**
     * Assign all the fields in the recycler view to fields here for manipulation.
     */

    class IncidentViewHolder extends RecyclerView.ViewHolder {
        TextView textViewLocation, textViewStatus, textViewDescription, textViewOfficer, textViewOfficerPhone;

        public IncidentViewHolder(View itemView) {


            super(itemView);

            textViewLocation = itemView.findViewById(R.id.locationText);
            textViewStatus = itemView.findViewById(R.id.statusText);
            textViewDescription = itemView.findViewById(R.id.incidentDescription);


        }
    }


}
