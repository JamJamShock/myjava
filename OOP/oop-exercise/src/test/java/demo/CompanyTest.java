package demo;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class CompanyTest {

    @Test
    public void should_be_return_total_salary_for_company(){
        SalariedEmployee salariedEmployee1=new SalariedEmployee(1,"Bob","Ko");
        salariedEmployee1.setSalary(5000.0);
        HourlyEmployee hourlyEmployee1=new HourlyEmployee(1,"Nyi","Nyi");
        hourlyEmployee1.setWorkingRate(400);
        hourlyEmployee1.setWorkHours(5);

        Company company=new Company();
        company.addEmployee(salariedEmployee1);
        company.addEmployee(hourlyEmployee1);

        assertThat(company.totalSalary(),equalTo(7000.0));
    }
}
