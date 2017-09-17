package graphql.ilde;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

public class Query implements GraphQLRootResolver {
    
    private final EmployeeRepository employeeRepository;

    public Query(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> allEmployees() {
        return employeeRepository.getAllEmployees();
    }
}
