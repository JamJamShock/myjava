package demo;
import org.junit.jupiter.api.BeforeEach;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
public class HourlyEmployeeTest {

    HourlyEmployee hourlyEmployee;

    @BeforeEach
    public void init(){ hourlyEmployee=new HourlyEmployee(1,"nyi","nyi");}

    @
    public void should_hour_return(){
        hourlyEmployee.setWorkHours(3);
        hourlyEmployee.setWorkRate(8000);
        assertThat(hourlyEmployee.calculateSalary(),equalTo(24000.0));
    }


}
