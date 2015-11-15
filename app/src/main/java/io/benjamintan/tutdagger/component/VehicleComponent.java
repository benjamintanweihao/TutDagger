package io.benjamintan.tutdagger.component;

import javax.inject.Singleton;

import dagger.Component;
import io.benjamintan.tutdagger.model.Vehicle;
import io.benjamintan.tutdagger.module.VehicleModule;

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();
}
