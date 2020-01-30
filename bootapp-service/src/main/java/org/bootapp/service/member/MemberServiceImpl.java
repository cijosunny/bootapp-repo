package org.bootapp.service.member;

import org.bootapp.datamodel.Member;
import org.bootapp.repo.member.MemberDAO;
import org.bootapp.service.AbstractBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class MemberServiceImpl extends AbstractBaseService<Member,Long> implements MembersService{
	@Autowired
	public MemberServiceImpl(MemberDAO memberDAO) {
		setRepo(memberDAO);
	}
	
}
