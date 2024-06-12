package gorzela.izabela.MapStructDemo.mappers.basicMappings;

import gorzela.izabela.MapStructDemo.basicMappings.case3.Employee;
import gorzela.izabela.MapStructDemo.basicMappings.case3.EmployeeDto;
import gorzela.izabela.MapStructDemo.basicMappings.case3.EmployeeMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class EmployeeMapperTest {

   @Test
    void shouldMapEmployeeToEmployeeDto() {

        Employee employee = new Employee();
        employee.setName("Jamie");
        employee.setSurname("Oliver");
        employee.setAge(20);

        EmployeeDto employeeDto = EmployeeMapper.INSTANCE.employeeToEmployeeDto(employee);

        assertEquals(employee.getName(), employeeDto.getName());
        assertEquals(employee.getSurname(), employeeDto.getSurname());
    }

   @Test
    void shouldMapEmployeeDtoToEmployee() {

        EmployeeDto employeeDto = new EmployeeDto();
        employeeDto.setName("Diane");
        employeeDto.setSurname("Setterfield");

        Employee employee = EmployeeMapper.INSTANCE.employeeDtoToEmployee(employeeDto);

        assertEquals(employeeDto.getName(), employee.getName());
        assertEquals(employeeDto.getSurname(), employee.getSurname());
        assertNull(employee.getAge());
    }
}