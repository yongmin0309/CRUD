package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestForm
 */
@WebServlet("/testform")
public class TestForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestForm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head>");
		out.print("<body>");
		
		String id = req.getParameter("id");
		String password = req.getParameter("pwd");
		String[] car = req.getParameterValues("car");
		String gender = req.getParameter("gender");
		String jiyak = req.getParameter("jiyak");
		String tong = req.getParameter("tong");
		
		out.print("ID : "+ id + "<br>");
		out.print("비밀번호 : "+ password + "<br>");
		out.print("car : ");
		for (int i = 0; i < car.length; i++) {
			out.print(car[i] + "");
		}
		out.print("<br>");
		out.print("성별 : "+ gender + "<br>");
		out.print("지역 : "+ jiyak + "<br>");
		out.print("통신사 : "+ tong + "<br>");
		out.print("전체 Query 문자열 : "+ req.getQueryString());
		
		out.print("</body></html>");
		out.close();
		
		
		doGet(req, resp);
	}

}
