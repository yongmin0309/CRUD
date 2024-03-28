package controller;

import java.sql.Date;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import biz.MemberService;
import vo.MemberVo;

public class MemberUpdateController implements Controller{
	public String execute(HttpServletRequest req, HttpServletResponse resp) {
		
		if(req.getMethod().equals("POST")) {
			return processUpdateService(req, resp);
		} else if(req.getMethod().equals("GET")) {
			return processUpdateView(req, resp);
		}
		return "redirect::/";
	}
	
	private String processUpdateService(HttpServletRequest req, HttpServletResponse resp) {
		
		int custno = Integer.parseInt(req.getParameter("custno"));
		String custname = req.getParameter("custname");
		String phone = req.getParameter("phone");
		String address = req.getParameter("address");
		Date joindate = Date.valueOf(req.getParameter("joindate"));
		String grade = req.getParameter("grade");
		String city = req.getParameter("city");
		
		MemberVo member = new MemberVo();
		member.setCustno(custno);
		member.setCustname(custname);
		member.setPhone(phone);
		member.setAddress(address);
		member.setJoindate(joindate);
		member.setGrade(grade);
		member.setCity(city);
		System.out.println(city);
		
		MemberService service = new MemberService();
		int n = 0;
		try {
			n = service.memberUpdate(member);
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		if (n>0) {
			return "redirect::memberList";
		} else {
			return "memberUpdate";
		}
			
	}
	private String processUpdateView(HttpServletRequest req, HttpServletResponse resp) {
		int custno = Integer.parseInt(req.getParameter("custno"));
		
		MemberService service = new MemberService();
		MemberVo member = service.getMember(custno);
		req.setAttribute("member", member);
		return "memberUpdate";
	}
}
