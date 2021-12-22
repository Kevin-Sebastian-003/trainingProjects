package com.example.bookPurchase.api;

import java.util.List;
import java.util.logging.Logger;

import com.example.bookPurchase.intercomm.BookInventoryClient;
import com.example.bookPurchase.model.Book;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class BookPurchaseApi {

	protected Logger logger = Logger.getLogger(BookInventoryClient.class.getName());

	@Autowired
	private BookInventoryClient client;

	@RequestMapping("/books/add/{id}/{bookname}/{authorname}/{doa}/{status}")
    public List<Book> addBook(
        @PathVariable("id") int id,
        @PathVariable("bookname") String name,
        @PathVariable("authorname") String authName,
        @PathVariable("doa") String doa,
        @PathVariable("status") String status){
			return client.addBook(id, name, authName, doa, status);
	}

	@RequestMapping("/books/delete/{id}")
	public List<Book> changeStatus(
		@PathVariable("id") int id,
		@PathVariable("status") String status) {
		return client.deleteBook(id);
	}

	@RequestMapping("/books")
	public List<Book> showAll() {
		return client.showAll();
	}
}
