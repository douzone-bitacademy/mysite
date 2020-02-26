package com.douzone.mysite.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.douzone.mysite.repository.GuestbookRepository;
import com.douzone.mysite.vo.GuestbookVo;

@Service
public class GuestbookService {
	
	@Autowired
	private GuestbookRepository guestbookRepository;
	
	public List<GuestbookVo> getMessageList() {
		return guestbookRepository.findAll();
	}
	
	public boolean deleteMessage( GuestbookVo vo ){
		return 1 == guestbookRepository.delete( vo );
	}
	
	public boolean writeMessage( GuestbookVo vo ) {
		int count = guestbookRepository.insert(vo);
		return count == 1;
	}
}