package com.demotesting.unittesting.business;

import com.demotesting.unittesting.data.DataService;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[] {1,2,3};
    }
}

public class BusinessImplStubTest {

    @Test
    public void calculateSumUsingDataService_basic() {
        BusinessImpl business = new BusinessImpl();
        business.setDataService(new DataServiceStub());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 6;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_empty(){
        BusinessImpl business = new BusinessImpl();
        business.setDataService(new DataServiceStub());
        int actualResult = business.calculateSumUsingDataService();
        int expectedResult = 0;

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateSumUsingDataService_oneValue(){
        BusinessImpl business = new BusinessImpl();
        int actualResult = business.calculateSum(new int[] {5});
        int expectedResult = 5;

        assertEquals(expectedResult, actualResult);
    }
}