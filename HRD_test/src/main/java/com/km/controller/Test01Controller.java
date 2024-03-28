package com.km.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test01Controller
 */
public class Test01Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test01Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Servlet 이용 프로그래밍 연습</title></head>");
		out.print("<body>");
		out.print("<h1>Servlet 이용 프로그래밍 연습</h1>");
		
		String num = req.getParameter("num");
		String na = req.getParameter("na");
		String ph = req.getParameter("ph");
		String ju = req.getParameter("ju");
		String ct = req.getParameter("ct");
		java.sql.Date ja =  java.sql.Date.valueOf(req.getParameter("ja"));
		String gogak = req.getParameter("gogak");
		
		out.print("회원번호 : "+ num + "<br>");
		out.print("회원성명 : "+ na + "<br>");
		out.print("회원전화 : "+ ph + "<br>");
		out.print("회원주소 : "+ ju + "<br>");
		out.print("가입일자 : "+ ja + "<br>");
		out.print("도시코드 : "+ ct + "<br>");
		out.print("고객등급 : "+ gogak + "<br>");
		out.print("<a href='http://localhost:8090/test01.html'>이전으로</a>");
		
		out.print("</body></html>");
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Servlet 이용 프로그래밍 연습</title></head>");
		out.print("<body>");
		out.print("<h1>Servlet 이용 프로그래밍 연습</h1>");
		
		String num = req.getParameter("num");
		String na = req.getParameter("na");
		String ph = req.getParameter("ph");
		String ju = req.getParameter("ju");
		String ct = req.getParameter("ct");
		java.sql.Date ja =  java.sql.Date.valueOf(req.getParameter("ja"));
		String gogak = req.getParameter("gogak");
		
		out.print("회원번호 : "+ num + "<br>");
		out.print("회원성명 : "+ na + "<br>");
		out.print("회원전화 : "+ ph + "<br>");
		out.print("회원주소 : "+ ju + "<br>");
		out.print("가입일자 : "+ ja + "<br>");
		out.print("도시코드 : "+ ct + "<br>");
		out.print("고객등급 : "+ gogak + "<br>");
		out.print("<a href='http://localhost:8090/test01.html'>이전</a>");
		
		out.print("</body></html>");
		out.close();
	}
	
	}
