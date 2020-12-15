package org.example.repository.employee;


import org.example.entity.employee.Driver;
import org.example.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDriverRepository extends JpaRepository<Driver, String> {
}
