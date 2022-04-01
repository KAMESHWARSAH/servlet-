/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.GenericServlet;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 *
 * @author Dell
 */
public class thirdServlet extends GenericServlet {
    public void service(ServletRequest req, ServletResponse resp) throws IOException{
        System.out.println("Serviceing...");
        //set the content type of the responce
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();
        out.println("<h2>Welcome to java  third</h2>");
       
        
    }
}
