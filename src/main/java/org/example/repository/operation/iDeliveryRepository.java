package org.example.repository.operation;

import org.example.entity.operation.Delivery;
import org.example.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iDeliveryRepository extends JpaRepository<Delivery, String> {
}