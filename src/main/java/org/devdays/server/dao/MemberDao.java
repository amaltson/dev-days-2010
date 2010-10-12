package org.devdays.server.dao;

import java.util.List;

import org.devdays.shared.Member;

public interface MemberDao {

	void persist(Member member);

	Member findMemberByIrn(String irn);
	
	List<Member> findMembersByBulkIrn(String... irns);
}
