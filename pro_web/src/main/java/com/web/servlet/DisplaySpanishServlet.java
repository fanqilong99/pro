package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DisplaySpanishServlet")
public class DisplaySpanishServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 设置响应内容类型
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		// 设置西班牙语言代码
//		response.setHeader("Content-Language", "es");

		String title = "En Espa&ntilde;ol";
		String docType = "<!DOCTYPE html> \n";
		out.println(docType + "<html>\n" + "<head><title>" + title + "</title></head>\n"
				+ "<body bgcolor=\"#f0f0f0\">\n" + "<h1>" + "En Espa&ntilde;ol:" + "</h1>\n" + "<h1>"
				+ "&iexcl;Hola Mundo!" + "</h1>\n" + "</body></html>");
	}

}
