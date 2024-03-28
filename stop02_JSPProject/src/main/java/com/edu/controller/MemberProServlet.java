package com.edu.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Request;

import com.edu.biz.MemberService;
import com.edu.vo.MemberVo;
@WebServlet("/memberProc")
public class MemberProServlet extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		MemberVo member = new MemberVo();
		member.setId(req.getParameter("id"));
		member.setPassd(req.getParameter("passwd"));
		member.setName(req.getParameter("name"));
		member.setMail(req.getParameter("mail"));
		
		MemberService service = new MemberService();
		service.memberInsert(member);
		
		RequestDispatcher rd =
				req.getRequestDispatcher("view/memberOutput.jsp") ;
		rd.forward(req, resp);
			
		}
	}
	

