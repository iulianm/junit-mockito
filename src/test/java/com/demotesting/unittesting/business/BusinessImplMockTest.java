package com.demotesting.unittesting.business;

import com.demotesting.unittesting.data.DataService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class BusinessImplMockTest {

    BusinessImpl business = new BusinessImpl();
    DataService dataServiceMock = mock(DataService.class);

    @Before
    public void before(){
    business.setDataService(dataServiceMock);
    }

    @Test
    public void calculateSumUsingDataService_basic() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
        assertEquals(6, business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSumUsingDataService_empty(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(0, business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSumUsingDataService_oneValue(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
        assertEquals(5, business.calculateSumUsingDataService());
    }
}