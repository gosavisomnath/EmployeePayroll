import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeePayrollServiceTest {

    @Test
    void givenDataInDB_WhenRetrieved_ShouldMatchTheCount() {
        EmployeePayrollService employeePayrollService = new EmployeePayrollService();
        List<EmployeePayroll> employeePayrolls = employeePayrollService.readEmployeePayrollData();
        Assertions.assertEquals(3, employeePayrolls.size());
    } @Test
    public void givenEmployeePayrollUpdateDetails_whenUpdated_shouldMatch() {
        EmployeePayrollService  employeePayrollService= new EmployeePayrollService();
        List<EmployeePayroll> employeePayrolls = employeePayrollService.readEmployeePayrollData();
        boolean result=employeePayrollService.updateSalary("soma",360.0);
        Assertions.assertTrue(result);

    }


}