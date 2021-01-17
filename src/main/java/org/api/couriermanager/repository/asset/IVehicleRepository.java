package org.api.couriermanager.repository.asset;


import org.api.couriermanager.entity.asset.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVehicleRepository extends JpaRepository<Vehicle, String> {
}
