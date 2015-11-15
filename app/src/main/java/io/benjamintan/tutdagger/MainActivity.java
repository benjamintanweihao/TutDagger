package io.benjamintan.tutdagger;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import io.benjamintan.tutdagger.component.DaggerVehicleComponent;
import io.benjamintan.tutdagger.component.VehicleComponent;
import io.benjamintan.tutdagger.model.Vehicle;
import io.benjamintan.tutdagger.module.VehicleModule;

public class MainActivity extends AppCompatActivity {

    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        VehicleComponent component = DaggerVehicleComponent
                .builder()
                .vehicleModule(new VehicleModule())
                .build();

        vehicle = component.provideVehicle();

        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_LONG).show();
    }
}
