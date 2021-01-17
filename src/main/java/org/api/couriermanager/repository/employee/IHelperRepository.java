package org.api.couriermanager.repository.employee;

import org.api.couriermanager.entity.employee.Helper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHelperRepository extends JpaRepository<Helper, String> {
}
