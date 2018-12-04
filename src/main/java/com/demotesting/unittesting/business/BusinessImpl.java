package com.demotesting.unittesting.business;

import com.demotesting.unittesting.data.DataService;

import java.util.Arrays;

public class BusinessImpl {

    private DataService dataService;

    public int calculateSum(int[] data){
       int sum = Arrays.stream(data).reduce(0, (x, y) -> x + y);
       return sum;
    }

    public int calculateSumUsingDataService() {
        int[] data = dataService.retrieveAllData();
        int sum = Arrays.stream(data).reduce(0, (x, y) -> x + y);
        return sum;
    }

    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }
}
