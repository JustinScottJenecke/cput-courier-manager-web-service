package org.example.repository.employee;

import org.example.entity.employee.Helper;
import org.example.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHelperRepository extends JpaRepository<Helper, String> {
}
