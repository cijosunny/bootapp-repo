package org.bootapp.repo.member;

import org.bootapp.datamodel.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberDAO extends JpaRepository<Member, Long>{

}
