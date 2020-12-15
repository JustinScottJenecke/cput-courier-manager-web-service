package org.example.repository.operation;

import org.example.entity.operation.Delivery;
import org.example.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDeliveryRepository extends JpaRepository<Delivery, String> {
}
