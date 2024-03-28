package com.edu.biz;

import com.edu.dao.MemberDAO;
import com.edu.vo.MemberVo;

public class MemberService {
	MemberDAO dao = new MemberDAO();
	
	public void memberInsert(MemberVo member) {
		dao.insertMenber(member);
	}
}
