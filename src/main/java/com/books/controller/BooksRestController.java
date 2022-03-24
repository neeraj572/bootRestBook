package com.books.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.books.entity.Books;
import com.books.repository.BooksRepository;
import com.books.service.BooksService;

@RestController
public class BooksRestController {
	
	@Autowired
	private BooksService booksService;
	
	/*ResponseEntity has method status() in which we pass httpstatus.NOT_found and then we 
	 * we use build() method to convert this response type into object
	 * 
	 * and if data is found in list then to return list as object we have an of() method in ResponseEntity
	 * but we can't return simple object of list to make it optional object again we use optional.of(list)
	 * 
	 */
	
	
	@GetMapping("/getBooks")
	public ResponseEntity<List<Books>> getBooksList(){
		
		List<Books> list = booksService.getAllBooks();
		if(list.size()==0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<Books> getBookByid(@PathVariable("id") Long id) {
		
		
			Books book = booksService.getBookById(id);
		if(book==null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(book));
		
	}

}
