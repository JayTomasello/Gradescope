package com.gradescope.Program3.tests;

import org.junit.Test;
import static org.junit.Assert.*;
import com.gradescope.jh61b.grader.GradedTest;
import com.gradescope.Program3.Program3;

public class Program3Test {
    @Test
    @GradedTest(name="Test commission calculation for sales less than 200", max_score=12.5)
    public void testCommissionLowRange() {
        Program3 program = new Program3();
        double sales = 150.0;
        double expectedCommission = 150.0 * 0.08;
        assertEquals(expectedCommission, program.calculateCommission(sales), 0.01);
    }

    @Test
    @GradedTest(name="Test commission calculation for sales between 200 and 399.99", max_score=12.5)
    public void testCommissionMidRange() {
        Program3 program = new Program3();
        double sales = 300.0;
        double expectedCommission = 300.0 * 0.10;
        assertEquals(expectedCommission, program.calculateCommission(sales), 0.01);
    }

    @Test
    @GradedTest(name="Test commission calculation for sales 400 and above", max_score=12.5)
    public void testCommissionHighRange() {
        Program3 program = new Program3();
        double sales = 500.0;
        double expectedCommission = 500.0 * 0.12;
        assertEquals(expectedCommission, program.calculateCommission(sales), 0.01);
    }

    @Test
    @GradedTest(name="Test total income calculation", max_score=12.5)
    public void testTotalIncome() {
        Program3 program = new Program3();
        double sales = 300.0;
        double expectedIncome = 300.0 + (300.0 * 0.10);
        assertEquals(expectedIncome, program.calculateIncome(sales), 0.01);
    }
    
    @Test
    @GradedTest(name="Test commission rate for sales less than 200", max_score=12.5)
    public void testLowSalesCommission() {
        Program3 program = new Program3();
        double sales = 150.0;
        double commission = program.calculateCommission(sales);
        assertTrue("Commission should be 8% for sales < 200", commission == sales * 0.08);
    }

    @Test
    @GradedTest(name="Test commission rate for sales between 200 and 399.99", max_score=12.5)
    public void testMediumSalesCommission() {
        Program3 program = new Program3();
        double sales = 300.0;
        double commission = program.calculateCommission(sales);
        assertTrue("Commission should be 10% for sales between 200 and 399.99", commission == sales * 0.10);
    }

    @Test
    @GradedTest(name="Test commission rate for sales 400 and above", max_score=12.5)
    public void testHighSalesCommission() {
        Program3 program = new Program3();
        double sales = 500.0;
        double commission = program.calculateCommission(sales);
        assertTrue("Commission should be 12% for sales >= 400", commission == sales * 0.12);
    }
    
    @Test
    @GradedTest(name="Test total income calculation accuracy", max_score=12.5)
    public void testTotalIncomeAccuracy() {
        Program3 program = new Program3();
        double sales = 350.0;
        double expectedIncome = sales + sales * 0.10; // 10% commission for this sales range
        assertTrue("Total income calculation should be accurate", program.calculateIncome(sales) == expectedIncome);
    }
}
