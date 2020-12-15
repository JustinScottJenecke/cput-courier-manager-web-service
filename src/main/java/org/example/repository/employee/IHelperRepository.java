package org.example.repository.employee;

import org.example.entity.employee.Helper;
import org.example.repository.IRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHelperRepository extends JpaRepository<Helper, String> {
}
