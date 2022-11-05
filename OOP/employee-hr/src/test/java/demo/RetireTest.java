package demo;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RetireTest {

    Retire retire;

    @BeforeEach
    public void init(){
        retire=new Retire();
    }

    @Test
    public void should_return_amount_when_pension_for_retire(){
        retire.setPensionManager(new PensionManager());
        assertThat(retire.makePension(180),equalTo(180.0));
    }
    @Test
    public void should_return_200_when_amount_is_more_than_200(){
        retire.setPensionManager(new PensionManager());
        assertThat(retire.makePension(250),equalTo(200.0));
    }
    @Test
    public void should_return_70000_for_life_insurance(){
        retire.setLifeInsurance(new RetireLifeInsurance());
        assertThat(retire.makeLifeInsurance(),equalTo(70000.0));
    }
}
