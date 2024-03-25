package com.dev.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class FrontController
 */
@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	String charset = null;
	HashMap<String, Controller> list = null;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		charset = config.getInitParameter("charset");
		
		list = new HashMap<String, Controller>();
		list.put("/memberInsert.do", new MemberInsertController());
		list.put("/memberSearch.do", new MemberSearchController());
		list.put("/memberUpdate.do", new memberUpdateController());
		list.put("/memberDelete.do", new MemberDeleteController());
		list.put("/memberList.do",  new MemberListController());
	}
	
	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		req.setCharacterEncoding(charset);
		
		String url = req.getRequestURI(); 
		System.out.println(url);
		String contextPath = req.getContextPath();
		System.out.println(contextPath);
		String path = url.substring(contextPath.length());
		System.out.println(path);
		
		Controller subController = list.get(path);
		subController.execute(req,resp);
		
	}

}
