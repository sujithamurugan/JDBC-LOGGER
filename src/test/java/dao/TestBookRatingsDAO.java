package dao;

import java.util.logging.Logger;

import dao.BookRatingsDAO;

public class TestBookRatingsDAO {
	private static final Logger LOGGER = Logger.getLogger( BookDAO.class.getName() );

public static void main(String[]args)
{
	BookRatingsDAO books = new BookRatingsDAO();
	
	LOGGER.info(books.findAll());
	
	LOGGER.info(books.findTotalBookRatings());
	
	  
	    books.delete(25);
	
	
   




}
}
