package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.biz.MemberService;

public class MemberDeleteController implements Controller {

	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		
		MemberService service = new MemberService();
		int n = service.memberDelete(id);
		
		if(n > 0) {
			req.setAttribute("id", id);
			HttpUtil.forword(req, resp, "/view/memberDeleteOutput.jsp");
		} else {
			req.setAttribute("error", "회원정보 삭제 오류입니다");
			HttpUtil.forword(req, resp, "/view/memberDelete.jsp");
		}
	}
}
