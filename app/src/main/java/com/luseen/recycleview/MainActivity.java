package com.luseen.recycleview;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flights);
        // ...
        // Lookup the recyclerview in activity layout
        RecyclerView rvFlights = (RecyclerView) findViewById(R.id.rvFlights);
            // Create adapter passing in the sample user data
        FlightRecyclerViewAdapter adapter = new FlightRecyclerViewAdapter(this, getThronesCharacters());
        // Attach the adapter to the recyclerview to populate items
        rvFlights.setAdapter(adapter);
        // Set layout manager to position the items
        rvFlights.setLayoutManager(new LinearLayoutManager(this));
        // That's all!


    }


    private ArrayList<Flight> getThronesCharacters() {
        ArrayList<Flight> items = new ArrayList<>();
        //airportOfOrigin, String code, String flightNo
        items.add(new Flight("Dubay", "DXT", "FT 502"));
        items.add(new Flight("Moscow", "SVO", "FT 503"));
        items.add(new Flight("Yerevan", "EVN", "FT 542"));
        items.add(new Flight("London", "HTR", "FF 502"));
        items.add(new Flight("Paris", "AXD", "AT 502"));
        items.add(new Flight("Amsterdam", "HFG", "FT 502"));
        items.add(new Flight("Dubay", "DXT", "FT 502"));
        items.add(new Flight("Moscow", "SVO", "FT 503"));
        items.add(new Flight("Yerevan", "EVN", "FT 542"));
        items.add(new Flight("London", "HTR", "FF 502"));
        items.add(new Flight("Paris", "AXD", "AT 502"));
        items.add(new Flight("Amsterdam", "HFG", "FT 502"));
        items.add(new Flight("Dubay", "DXT", "FT 502"));
        items.add(new Flight("Moscow", "SVO", "FT 503"));
        items.add(new Flight("Yerevan", "EVN", "FT 542"));
        items.add(new Flight("London", "HTR", "FF 502"));
        items.add(new Flight("Paris", "AXD", "AT 502"));
        items.add(new Flight("Amsterdam", "HFG", "FT 502"));
        return items;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
