package com.doSelect.fizzbuzz.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SatisticsEndPointController {
	
	
	private Map<String, Integer> requestCounts = new HashMap<>();

   @RequestMapping("/statistics")
    public Map<String, Object> getStatistics() {
        String mostUsedRequest = this.getMostUsedRequest();
        int hitCount = requestCounts.getOrDefault(mostUsedRequest, 0);

        Map<String, Object> satisticEndPointresult = new HashMap<>();
        satisticEndPointresult.put("mostUsedRequest", mostUsedRequest);
        satisticEndPointresult.put("hitCount", hitCount);

        return satisticEndPointresult;
    }

   
    private String getMostUsedRequest() {
        return requestCounts.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("No requests yet");
    }

    public void trackHTTPRequest(String requestInfo) {
        requestCounts.put(requestInfo, requestCounts.getOrDefault(requestInfo, 0) + 1);
    }
}
