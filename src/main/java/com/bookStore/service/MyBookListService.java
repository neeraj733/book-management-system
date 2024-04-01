package com.bookStore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookStore.entity.MyBookList;
import com.bookStore.repository.MyBookRepository;

@Service
public class MyBookListService {
	
	@Autowired
	private MyBookRepository mybookRepo;
	
	public void saveMyBook(MyBookList book) {
		
		mybookRepo.save(book);
	}


	public List<MyBookList> getAllMyBooks(){
	
		return mybookRepo.findAll();
	}


	public void deleteById(int id) {
		
		mybookRepo.deleteById(id);
		
	}



}
