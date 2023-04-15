package com.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener("AwsListener")
public class AwsListener implements ServletContextListener, HttpSessionListener {

 
	public void contextInitialized(ServletContextEvent arg0)  
    { 
		System.out.println("server :: contextInitialized()");
    }

    public void contextDestroyed(ServletContextEvent arg0)  
    { 
    	System.out.println("server :: contextDestroyed()");
    }
	
    
    
    public void sessionCreated(HttpSessionEvent arg0)  
    { 
    	System.out.println("server :: sessionCreated");
    }

    public void sessionDestroyed(HttpSessionEvent arg0)  
    {
    	System.out.println("server :: sessionDestroyed");
    }
    


    
	
}
