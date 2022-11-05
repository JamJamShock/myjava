package demo;

import demo.HourlyEmployee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class HourlyEmployeeTest {
    HourlyEmployee hourlyEmployee;

    @BeforeEach
    public void init(){
        hourlyEmployee=new HourlyEmployee(1,"John","Doe");
    }

    @Test
    public void should_be_return_hourly_salary(){
        hourlyEmployee.setWorkHours(40);
        hourlyEmployee.setWorkingRate(100);
        assertThat(hourlyEmployee.calculateSalary(),equalTo(4000.0));
    }

    public void should_return_15_for_charity(){assertThat(hourlyEmployee.charity(15),equalTo(15));}

    public void should_throw_IllegalArgumentException_when_amount_is_less_than_10(){
        Assertions.assertThrows(IllegalArgumentException.class,()->hourlyEmployee.charity(7));
    }



}
