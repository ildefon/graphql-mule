package graphql.ilde;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

public class Mutation implements GraphQLRootResolver {
    
    private final EmployeeRepository employeeRepository;

    public Mutation(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    
    public Employee createEmployee(String name, String project) {
    	Employee newEmployee = new Employee(name, project);
        employeeRepository.saveEmployee(newEmployee);
        return newEmployee;
    }
}
