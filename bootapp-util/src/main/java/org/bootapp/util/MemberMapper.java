package org.bootapp.util;

import java.util.Date;

import org.bootapp.datamodel.Member;
import org.bootapp.dto.MemberDTO;

public class MemberMapper {
	public static Member dtoToModel(MemberDTO memberDTO){
		Member member = new Member();
		member.setFirstname(memberDTO.getFirstname());
		member.setLastname(memberDTO.getLastname());
		member.setSex(memberDTO.getSex());
//		member.setDob(memberDTO.getDob());
		member.setAge(memberDTO.getAge());
		member.setMaritalStatus(memberDTO.getMaritalStatus());
		member.setNationality(memberDTO.getNationality());
		member.setAadharNumber(memberDTO.getAadharNumber());
		member.setPanNumber(memberDTO.getPanNumber());
		member.setModifiedBy(memberDTO.getModifiedBy());
		member.setCreatedBy(memberDTO.getCreatedBy());
		
		return member;
		
	}
	
	public static MemberDTO modelToDTO(Member member){
		MemberDTO memberDTO = new MemberDTO();
		memberDTO.setFirstname(member.getFirstname());
		memberDTO.setLastname(member.getLastname());
		return memberDTO;
	}
}
