package com.dev.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dev.biz.MemberService;
import com.dev.vo.MemberVO;

public class memberUpdateController implements Controller{
	
	public void execute(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		
		String id = req.getParameter("id");
		String passwd = req.getParameter("passwd");
		String name = req.getParameter("name");
		String mail = req.getParameter("mail");
		
		if(id.isEmpty() || passwd.isEmpty() || name.isEmpty() || mail.isEmpty()) {
			req.setAttribute("error", "모든 항목을 입력하세요");
			HttpUtil.forword(req, resp, ".view/memberUpdate.jsp");
			return;
		}
		
		MemberVO member = new MemberVO();
		member.setId(id);
		member.setPasswd(passwd);
		member.setName(name);
		member.setMail(mail);
		
		
		MemberService service = new MemberService();
		int n = service.memberUpdate(member);
		
		if(n > 0) { 
			req.setAttribute("id", id);
			HttpUtil.forword(req, resp, "/view/memberUpdateOutput.jsp");
		} else {
			req.setAttribute("member", member);
			req.setAttribute("error", "회원정보 수정 오류입니다");
			HttpUtil.forword(req, resp, "/view/memberUpdate.jsp");		}
	}
	
}
