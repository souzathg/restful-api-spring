package br.com.souzathg.restfulapispring.config;

import br.com.souzathg.restfulapispring.model.entities.Employee;
import br.com.souzathg.restfulapispring.model.entities.Order;
import br.com.souzathg.restfulapispring.model.enums.Status;
import br.com.souzathg.restfulapispring.repository.EmployeeRepository;
import br.com.souzathg.restfulapispring.repository.OrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDB {
    private static final Logger log = LoggerFactory.getLogger(LoadDB.class);

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository employeeRepository, OrderRepository orderRepository) {

        return args -> {
            employeeRepository.save(new Employee("Bilbo","Baggins", "burglar")));
            employeeRepository.save(new Employee("Frodo", "Baggins", "thief")));

            employeeRepository.findAll().forEach(employee -> {
                log.info("Preloaded " + employee)
            });

            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });
        };
    }
}
