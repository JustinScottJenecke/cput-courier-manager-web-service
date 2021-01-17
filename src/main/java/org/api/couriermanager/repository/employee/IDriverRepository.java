package org.api.couriermanager.repository.employee;


import org.api.couriermanager.entity.employee.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDriverRepository extends JpaRepository<Driver, String> {
}
