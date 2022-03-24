package com.books.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.entity.Books;
import com.books.repository.BooksRepository;

@Service
public class BooksServiceImpl implements BooksService {
	@Autowired
	private BooksRepository  booksRepo;

	@Override
	public List<Books> getAllBooks() {
		List<Books> findAll = booksRepo.findAll();
		return findAll;
	}

	@Override
	public Books getBookById(Long id){
		Books books=null;
		try {
		Optional<Books> findById = booksRepo.findById(id);
		books = findById.get();
		}catch(Exception e) {
			e.printStackTrace();
		}
		return books;
	}
}
