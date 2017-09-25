package com.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Refresh
 */
@WebServlet("/RefreshServlet")
public class RefreshServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // ����ˢ���Զ����ص��¼����Ϊ 5 ��
        response.setIntHeader("Refresh", 1);
     
        // ������Ӧ��������
        response.setContentType("text/html;charset=UTF-8");
     
        // ��ȡ��ǰ��ʱ��
        Calendar calendar = new GregorianCalendar();
        String am_pm;
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        if(calendar.get(Calendar.AM_PM) == 0)
            am_pm = "AM";
        else
            am_pm = "PM";
     
        String CT = hour+":"+ minute +":"+ second +" "+ am_pm;
        
        PrintWriter out = response.getWriter();
        String title = "ʹ�� Servlet �Զ�ˢ��ҳ��";
        String docType = "<!DOCTYPE html> \n";
        out.println(docType +
            "<html>\n" +
            "<head><title>" + title + "</title></head>\n"+
            "<body bgcolor=\"#f0f0f0\">\n" +
            "<h1 align=\"center\">" + title + "</h1>\n" +
            "<p>��ǰʱ���ǣ�" + CT + "</p>\n");
    }

}
