package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PageHitCounter
 */
@WebServlet("/PageHitCounter")
public class PageHitCounter extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private int hitCount; 
    
    public void init() 
    { 
        // ���õ��������
        hitCount = 0;
    } 
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        // ���� hitCount 
//        hitCount++; 
        if(request.getSession().isNew()){
        	hitCount++;
        }
        PrintWriter out = response.getWriter();
        String title = "�ܵ����";
        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
            "<html>\n" +
            "<head><title>" + title + "</title></head>\n" +
            "<body bgcolor=\"#f0f0f0\">\n" +
            "<h1 align=\"center\">" + title + "</h1>\n" +
            "<h2 align=\"center\">" + hitCount + "</h2>\n" +
            "</body></html>");
    }
    
    public void destroy() 
    { 
        // ��һ���ǿ�ѡ�ģ����������Ҫ�������԰� hitCount ��ֵд�뵽���ݿ�
    } 

}