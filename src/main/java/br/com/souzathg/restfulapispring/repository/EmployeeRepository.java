package br.com.souzathg.restfulapispring.repository;

import br.com.souzathg.restfulapispring.model.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
