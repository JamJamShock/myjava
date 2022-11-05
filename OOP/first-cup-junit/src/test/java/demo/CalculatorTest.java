package demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void init(){
        calculator =new Calculator();
    }

    @Test
    @DisplayName("should return sum when two integers are given.")
    public void should_return_sum(){
        assertThat(calculator.add(5,7),equalTo(12));
    }
}
