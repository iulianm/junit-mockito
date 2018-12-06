package com.demotesting.unittesting.spike;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class JsonPathTest {

    @Test
    public void learning(){
        String responseFromSErvice = "[" +
                "{\"id\": 10000, \"name\":\"Pencil\", \"quntity\":5}," +
                "{\"id\": 10001, \"name\":\"Pen\", \"quntity\":15}," +
                "{\"id\": 10002, \"name\":\"Eraser\", \"quntity\":10}," +
                "]";

        DocumentContext context = JsonPath.parse(responseFromSErvice);

        int length = context.read("$.length()");
        assertThat(length).isEqualTo(3);

        List<Integer> ids = context.read("$..id");
        assertThat(ids).containsExactly(10000, 10001, 10002);
        System.out.println(context.read("$.[1]").toString());
        System.out.println(context.read("$.[0:2]").toString());
        System.out.println(context.read("$.[?(@.name=='Eraser')]").toString());
        System.out.println(context.read("$.[?(@.quantity==5)]").toString());
    }

}
