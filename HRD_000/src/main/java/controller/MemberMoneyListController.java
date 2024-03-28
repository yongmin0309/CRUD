package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.MemberService;
import vo.memberMoneyVo;

public class MemberMoneyListController implements Controller{
	public String execute(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException{
		MemberService service = new MemberService();
		ArrayList<memberMoneyVo> list = service.memberMoneyList();
		
		req.setAttribute("list", list);
		return "memberMoneyList";
	}
}
