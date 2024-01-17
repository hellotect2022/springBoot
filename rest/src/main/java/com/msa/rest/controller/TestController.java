package com.msa.rest.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.msa.rest.dto.Response;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {
    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public String checkString() {
        return "Check";
    }

    @RequestMapping(value = "/check2", method = RequestMethod.GET)
    @ResponseBody
    public Response checkJson() {
        Response<List> response = new Response();
        response.setStatus("OK!!!");
        List<String> fuck = new ArrayList<String>();
        fuck.add("t1");
        fuck.add("t2");
        fuck.add("t3");
        fuck.add("t4");
        fuck.add("t5");
        fuck.add("t6");
        fuck.add("t7");
        response.setResult(fuck);

        return response;
    }
}
