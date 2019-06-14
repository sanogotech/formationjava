
package jakarta.tutorial.helloservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import jakarta.tutorial.helloservice.model.Book;



@WebService(serviceName = "bookWeb", name = "bookWs")
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT, use = SOAPBinding.Use.LITERAL)
public class BookWs {

   

    @WebMethod
    public Book getBookById() {
		Book book = new Book();
		book.setId(12);
		book.setAvailable(true);
        return book;

    }

	/*
    @WebMethod
    public Book saveNewBook(Book book) {
        return bookService.saveNewBook(book);

    }*/

    

}