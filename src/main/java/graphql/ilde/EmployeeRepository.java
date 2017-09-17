package graphql.ilde;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
    
    private final List<Employee> employees;

    public EmployeeRepository() {
    	employees = new ArrayList<Employee>();
    	employees.add(new Employee("Ilde Lucena", "Collibra"));
    	employees.add(new Employee("Jose Jurado", "Sky"));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }
    
    public void saveEmployee(Employee employee) {
    	employees.add(employee);
    }
}
