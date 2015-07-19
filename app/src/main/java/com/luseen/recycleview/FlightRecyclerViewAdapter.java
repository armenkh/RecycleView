package com.luseen.recycleview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by armkha01 on 19/07/2015.
 */
public class FlightRecyclerViewAdapter extends RecyclerView.Adapter<FlightRecyclerViewAdapter.ViewHolder>{


    // Store a member variable for the users
    private ArrayList<Flight> flights;
    // Store the context for later use
    private Context context;

    // Pass in the context and users array into the constructor
    public FlightRecyclerViewAdapter(Context context, ArrayList<Flight> flights) {
        this.flights = flights;
        this.context = context;
    }

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView code;
        public TextView airportOfOrigin;
        public TextView flightNo;
        public ImageView icone;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            super(itemView);
            this.code = (TextView) itemView.findViewById(R.id.code);
            this.airportOfOrigin = (TextView) itemView.findViewById(R.id.airportOfOrigin);
            this.flightNo = (TextView) itemView.findViewById(R.id.flightNo);
            this.icone = (ImageView) itemView.findViewById(R.id.imageView);
        }
    }

    @Override
    public FlightRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        // Inflate the custom layout
        View itemView = LayoutInflater.from(context).
                inflate(R.layout.item_flight, viewGroup, false);
        // Return a new holder instance
        return new FlightRecyclerViewAdapter.ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(FlightRecyclerViewAdapter.ViewHolder holder, int position) {
        // Get the data model based on position
        Flight flight = flights.get(position);
        // Set item views based on the data model
        holder.code.setText(flight.getCode());
        holder.airportOfOrigin.setText(flight.getAirportOfOrigin());
        holder.flightNo.setText(flight.getFlightNo());
        holder.icone.setImageResource(context.getResources().getIdentifier(flight.getIconeName(), "drawable", context.getPackageName()));
    }

    @Override
    public int getItemCount() {
        return flights.size();
    }
}
