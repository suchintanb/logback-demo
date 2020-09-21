package com.demo.app;

import org.junit.jupiter.api.Test;

import com.demo.business.LogbackBusiness;
import com.demo.service.LogbackService;

public class LogbackPropertiesTest {
    @Test
    public void testPerformSomeTask() throws Exception {
        LogbackService logbackService=new LogbackService();
        logbackService.performSomeTask();
        LogbackBusiness logbackBusiness = new LogbackBusiness();
        logbackBusiness.performSomeTask();
    }
}