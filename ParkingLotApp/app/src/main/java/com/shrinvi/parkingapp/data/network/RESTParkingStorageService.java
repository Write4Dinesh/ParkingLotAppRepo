package com.shrinvi.parkingapp.data.network;

import com.shrinvi.parkingapp.data.ParkingStorageService;
import com.shrinvi.parkingapp.model.IParkingSpace;
import com.shrinvi.parkingapp.model.Vehicle;

import java.util.List;

public class RESTParkingStorageService extends ParkingStorageService {

    @Override
    public void storeVehicle(Vehicle vehicle) {

    }

    @Override
    public void storeSpace(IParkingSpace space) {

    }

    @Override
    public void storeAllSpaces(List<IParkingSpace> spaces) {

    }

    @Override
    public Vehicle getVehicleByRegiNo(String regiNo) {
        return null;
    }

    @Override
    public IParkingSpace getSpaceById(String spaceId) {
        return null;
    }

    @Override
    public List<IParkingSpace> getAllSpaces() {
        return null;
    }
}
