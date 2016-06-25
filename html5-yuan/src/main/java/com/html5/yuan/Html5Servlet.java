package com.html5.yuan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Html5Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Html5Servlet() {
        super();
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/event-stream");
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer =response.getWriter();
		for(int i=0;i<10;i++){
			writer.write("data: "+ "ѭ��"+i +"\n\n");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			//��response ����ˢ��
			response.flushBuffer();
		}	
		writer.close();
	}
}
