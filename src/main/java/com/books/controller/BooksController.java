package com.books.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.books.entity.Books;
import com.books.repository.BooksRepository;

@Controller
public class BooksController {
	
	@Autowired
	private BooksRepository  booksRepo;
	@RequestMapping("/books")
	public String loadSaveBooks() {
		return "saveBooks";
	}
	
	
	@RequestMapping("/save")
	public String userSaveBooks(@ModelAttribute("books") Books books,ModelMap modelMap) {
		booksRepo.save(books);
		modelMap.addAttribute("msg","record saved!");
		return "saveBooks";
	}

}
