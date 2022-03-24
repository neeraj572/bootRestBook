package com.books.service;

import java.util.List;

import com.books.entity.Books;

public interface BooksService {

	public List<Books> getAllBooks();

	public Books getBookById(Long id) ;

}
