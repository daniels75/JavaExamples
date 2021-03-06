package org.daniels.examples.cdi.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.daniels.examples.cdi.bean.SimpleService;

@WebServlet(name = "SimpleServletWithCdi", urlPatterns = {"/servletcdi"})
public class SimpleServletWithCdi extends HttpServlet {

	private static final long serialVersionUID = 1;
	
	@Inject
	private SimpleService service;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
		
        PrintWriter out = response.getWriter();
        if (service != null) {
        	out.println("SimpleServletWithCdi: " + service.createMessage("Simple Message from Servlet"));
        } else {
        	out.println("SimpleServletWithCdi - !!! service has not been created !!!");
        }
        
        
        out.close();
    }

}
