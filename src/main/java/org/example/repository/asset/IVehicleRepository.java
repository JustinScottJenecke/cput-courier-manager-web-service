package org.example.repository.asset;


import org.example.entity.asset.Vehicle;
import org.example.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVehicleRepository extends JpaRepository<Vehicle, String> {
}
