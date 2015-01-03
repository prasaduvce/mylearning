package com.test.web.controllers;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
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
        List<JSONArray> responseList = new ArrayList<JSONArray>();
        for (int i=0; i<5; i++ ) {
            JSONArray jsonArray = new JSONArray();
            //jsonArray.add(i);
            jsonArray.add((i+1)*10);
            responseList.add(jsonArray);
        }
        return responseList;
    }
}
