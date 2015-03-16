package com.sole.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.Constants;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	private static final Log LOGGER = LogFactory.getLog(LoginInterceptor.class);
	private static final String[] IGNORE_URI = {"/login.jsp", "/login/","login.do","frontui/"};
	 
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = false;
        String url = request.getRequestURL().toString();
        LOGGER.debug("LoginInterceptor: " + url);
        for (String s : IGNORE_URI) {
        	//System.out.println("LoginInterceptor:s==="+s);
            if (url.contains(s)) {
                flag = true;
                break;
            }
        }
        if (!flag) {
        	Object obj = request.getSession().getAttribute("isLogin");  
            if (obj != null) {
            	flag = true;
            	LOGGER.debug("LoginInterceptor: It is Logined!");
            }else{
            	 // 未登录  
            	LOGGER.debug("LoginInterceptor: Not Logined");
            	response.sendRedirect(request.getContextPath()+"/views/login.jsp");
            }
        }
        return flag;
    }
	
	
}
