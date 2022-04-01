/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
/**
 *
 * @author Dell
 */
public class FirstServlet  implements Servlet{
    // Life Cycle
    ServletConfig conf;
    public void init(ServletConfig conf){
        
        System.out.println("Creating Object ...");
    }
    
    public void service(ServletRequest req, ServletResponse resp) throws IOException{
        System.out.println("Serviceing...");
        //set the content type of the responce
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h2>Welcome to java </h2>");
        out.println("<h3>Today Date is:- "+ new Date()+ "<h3>");
        
    }
    
    public void destroy(){
        System.out.println("going to destroing ");
    }
    
    // Non life cycle
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    public String getServletInfo(){
        return "Returning String";
    }
}
