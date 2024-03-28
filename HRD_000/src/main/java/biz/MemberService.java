package biz;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.MemberDao;
import vo.MemberVo;
import vo.memberMoneyVo;

public class MemberService {

	MemberDao dao = new MemberDao();
	
	public ArrayList<MemberVo> memberList() {
		ArrayList<MemberVo> list = dao.memberList();
		return list;
	}
	
	
	public ArrayList<memberMoneyVo> memberMoneyList() {
		ArrayList<memberMoneyVo> list = dao.memberMoneyList();
		return list;
	}
	
	public int getMaxCustno() {
		int custno = dao.getMaxCustNo();
		return custno;
	}
	
	public int memberInsert(MemberVo member) throws SQLException {
			int n = dao.memberInsert(member);
			
			return n;
	}
	
	public MemberVo getMember(int custno) {
		MemberVo member = dao.getMember(custno);
		return member;
	}
	
	public int memberUpdate(MemberVo member) throws SQLException {
		int n = dao.memberUpdate(member);
		return n;
	}
			
}
