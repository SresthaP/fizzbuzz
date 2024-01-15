package com.doSelect.fizzbuzz.configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;

import com.doSelect.fizzbuzz.controller.SatisticsEndPointController;

public class RequestTrackingInterceptor implements HandlerInterceptor {

	@Autowired
	private SatisticsEndPointController satisticEndPointController;
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
       
        String requestInfo = request.getMethod() + " " + request.getRequestURI();
        satisticEndPointController.trackHTTPRequest(requestInfo);
        return true;
    }
}
