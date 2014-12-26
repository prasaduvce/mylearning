package com.test.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ChartController {

    @RequestMapping(value = "/barChart")
    public String showBarChart() {
        return "charts/barChart";
    }

    @RequestMapping(value = "/numberOfInvoicesProcessedPerChannel")
    @ResponseBody
    public Object getNumberOfInvoicesProcessedPerChannel() {
        List<Integer> row1 = new ArrayList();
        row1.add(1);
        row1.add(10);

        List<Integer> row2 = new ArrayList();
        row2.add(2);
        row2.add(100);

        List<Integer> row3 = new ArrayList();
        row3.add(3);
        row3.add(129);

        List<Integer> row4 = new ArrayList();
        row4.add(4);
        row4.add(45);

        List<List<Integer>> responseList = new ArrayList();
        responseList.add(row1);
        responseList.add(row2);
        responseList.add(row3);
        responseList.add(row4);
        return responseList;
    }
}
