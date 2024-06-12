package gorzela.izabela.MapStructDemo.basicMappings.case3;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    //The case there the target or the source has one less/one more instance variable (property).

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);
    EmployeeDto employeeToEmployeeDto(Employee employee);
    Employee employeeDtoToEmployee(EmployeeDto employeeDto);
}