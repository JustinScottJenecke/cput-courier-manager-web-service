package org.api.couriermanager.repository.operation;

import org.api.couriermanager.entity.operation.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeliveryRepository extends JpaRepository<Delivery, String> {
}
