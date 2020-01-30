package org.bootapp.api.member;

import java.util.List;

import org.bootapp.datamodel.Member;
import org.bootapp.dto.MemberDTO;
import org.bootapp.service.member.MembersService;
import org.bootapp.util.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/members")
public class MemberController {
	@Autowired
	private MembersService memberService;
	
	@PostMapping
	public ResponseEntity<MemberDTO> addMember(@RequestBody MemberDTO memberDTO){
		return ResponseEntity.ok(MemberMapper.modelToDTO(memberService.save(MemberMapper.dtoToModel(memberDTO))));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<MemberDTO> getMember(@PathVariable("id") Long id){
		return ResponseEntity.ok(MemberMapper.modelToDTO(memberService.get(id)));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateMember(@RequestBody MemberDTO memberDTO, @PathVariable("id") Long id){
		Member memberDB = memberService.get(id);
		Member member = MemberMapper.dtoToModel(memberDTO);
		member.setId(id);
		memberService.update(member);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteMember(@PathVariable("id") Long id){
		memberService.delete(memberService.get(id));
		return ResponseEntity.status(204).build();
	}
	
	@GetMapping
	public ResponseEntity<List<Member>> getAllMembers(){
		return ResponseEntity.ok(memberService.getAll());
	}
}
