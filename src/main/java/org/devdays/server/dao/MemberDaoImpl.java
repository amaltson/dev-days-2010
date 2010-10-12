package org.devdays.server.dao;

import java.util.List;

import org.devdays.shared.Member;

import com.googlecode.objectify.ObjectifyFactory;

public class MemberDaoImpl implements MemberDao {

	private ObjectifyFactory objectifyFactory;

	public MemberDaoImpl(ObjectifyFactory objectifyFactory) {
		this.objectifyFactory = objectifyFactory;
	}

	public void persist(Member member) {
	}

	public Member findMemberByIrn(String irn) {
		return null;
	}

	public List<Member> findMembersByBulkIrn(String... irns) {
		return null;
	}
}
