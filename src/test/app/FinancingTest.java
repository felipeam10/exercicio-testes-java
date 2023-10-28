package test.app;

import static org.junit.jupiter.api.Assertions.*;

import entities.Financing;
import org.junit.Test;

import java.util.Optional;

public class FinancingTest {

    @Test
    public void testConstructorShouldCreateObjectWhenValidData() {
        Financing f1 = new Financing(100000.0, 2000.0, 80);
        assertEquals(100000.0, f1.getTotalAmount());
        assertEquals(2000.0, f1.getIncome());
        assertEquals(80, f1.getMonths());
    }

    @Test
    public void testConstructorShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        assertThrows(IllegalArgumentException.class, () -> {
            Financing f2 = new Financing(100000.0, 2000.0, 20);
        });
    }

    @Test
    public void testSetTotalAmountShouldUpdateValueWhenDataIsValid() {
        Financing f3 = new Financing(100000.0, 2000.0, 80);
        f3.setTotalAmount(90000.0);
        assertEquals(90000.0, f3.getTotalAmount());
    }

    @Test
    public void testSetTotalAmountShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        assertThrows(IllegalArgumentException.class, () -> {
            Financing f4 = new Financing(100000.0, 2000.0, 80);
            f4.setTotalAmount(110000.0);
        });
    }

    @Test
    public void testSetIncomeShouldUpdateValueWhenDataIsValid() {
        Financing f5 = new Financing(100000.0, 2000.0, 80);
        f5.setIncome(2100.0);
        assertEquals(2100.0, f5.getIncome());
    }

    @Test
    public void testSetIncomeShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        assertThrows(IllegalArgumentException.class, () -> {
            Financing f6 = new Financing(100000.0, 2000.0, 80);
            f6.setIncome(1900.0);
        });
    }

    @Test
    public void testSetMonthsShouldUpdateValueWhenDataIsValid() {
        Financing f7 = new Financing(100000.0, 2000.0, 80);
        f7.setMonths(81);
        assertEquals(81, f7.getMonths());
    }

    @Test
    public void testSetMonthsShouldThrowIllegalArgumentExceptionWhenInvalidData() {
        assertThrows(IllegalArgumentException.class, () -> {
            Financing f8 = new Financing(100000.0, 2000.0, 80);
            f8.setMonths(79);
        });
    }

    @Test
    public void testEntryShouldUpdateValueWhenDataIsValid() {
        Financing f9 = new Financing(100000.0, 2000.0, 80);
        assertEquals(20000.0, f9.entry());
    }

    @Test
    public void testQuotaShouldUpdateValueWhenDataIsValid() {
        Financing f10 = new Financing(100000.0, 2000.0, 80);
        assertEquals(1000.0, f10.quota());
    }


}

