package demo;

import demo.SalariedEmployee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class SalariedEmployeeTest {
    SalariedEmployee salariedEmployee;

    @BeforeEach
    public void init(){
        salariedEmployee=new SalariedEmployee(1,"John","Doe");
    }

    @Test
    public void should_be_return_monthly_salary(){
        salariedEmployee.setSalary(3000);
        assertThat(salariedEmployee.calculateSalary(),equalTo(3000.0));
    }

}
