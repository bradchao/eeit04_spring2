package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.controller.MemberController;
import com.example.demo.repository.MemberRepository;

@Service
public class MemberService {

	@Autowired
	private MemberRepository memberRepository;

	public boolean checkAccount(String account) {
		return memberRepository.existsByAccount(account);
	}
	
}
