package bmt;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest
{

    @Test(expected = IllegalArgumentException.class)
    public void test_fact_raises_exception_for_null_number() {
        Integer number = null;
        Integer power = 1;
        App.power(number,power);
    }

    @Test
    public void power_0_and_numper_0_returns_1()
    {
        assertEquals(1.0, App.power(0, 0), 0.0001);
    }

    @Test
    public void power_0_and_any_namper_returns_1()
    {
        assertEquals(1.0, App.power(1, 0), 0.0001);
    }

    @Test
    public void power_2_and_numper_2_returns_4()
    {
        assertEquals(4.0, App.power(2,2 ), 0.0001);
    }

    
}