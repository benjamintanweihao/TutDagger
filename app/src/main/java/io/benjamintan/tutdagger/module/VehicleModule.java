package io.benjamintan.tutdagger.module;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.benjamintan.tutdagger.model.Motor;
import io.benjamintan.tutdagger.model.Vehicle;

@Module
public class VehicleModule {

    @Provides @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}
