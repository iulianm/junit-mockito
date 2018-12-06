package com.demotesting.unittesting.business;

import com.demotesting.unittesting.data.DataService;

import java.util.Arrays;
import java.util.OptionalInt;

public class BusinessImpl {

    private DataService dataService;

    public int calculateSum(int[] data){
       int sum1 = Arrays.stream(data).reduce(0, (x, y) -> x + y);

       /*OptionalInt sum2 = Arrays.stream(data).reduce(Integer::sum);
       return number.orElse(0);

       or

       return Arrays.stream(data).reduce(Integer::sum).orElse(0);

       */

       return sum1;
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
