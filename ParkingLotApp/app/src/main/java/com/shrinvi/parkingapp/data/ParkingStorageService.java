package com.shrinvi.parkingapp.data;

import com.shrinvi.parkingapp.model.ParkingSpace;
import com.shrinvi.parkingapp.model.Vehicle;

import java.util.List;

public class ParkingStorageService implements IParkingStore {

    @Override
    public void storeVehicle(Vehicle vehicle) {

    }

    @Override
    public void storeSpace(ParkingSpace space) {

    }

    @Override
    public void storeAllSpaces(List<ParkingSpace> spaces) {

    }

    @Override
    public Vehicle getVehicleByRegiNo(String regiNo) {
        return null;
    }

    @Override
    public ParkingSpace getSpaceById(String spaceId) {
        return null;
    }

    @Override
    public List<ParkingSpace> getAllSpaces() {
        return null;
    }
}