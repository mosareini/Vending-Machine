package com.techelevator.view;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ChipsTest {

    Chips testChips = new Chips("CHAAPS", 5000.00, 1);

    @Before
    public void setUp(){}

    @After
    public void tearDown(){}

    @Test
    public void test_Chips_GetName(){

        //Arrange
        String expectedResult = "CHAAPS";

        //Act
        String actualResult = testChips.getName();

        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test_Chips_GetPrice(){

        //Arrange
        double expectedResult = 5000.00;

        //Act
        double actualResult = testChips.getPrice();

        //Assert
        Assert.assertEquals(expectedResult, actualResult, 0.1);
    }

    @Test
    public void test_Chips_GetQuantity(){

        //Arrange
        int expectedResult = 1;

        //Act
        int actualResult = testChips.getQuantity();

        //Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

}
