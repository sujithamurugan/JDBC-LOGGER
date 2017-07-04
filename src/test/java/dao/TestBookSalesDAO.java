package dao;

import java.util.logging.Logger;

import dao.BookSalesDAO;

public class TestBookSalesDAO {

	private static final Logger LOGGER = Logger.getLogger( BookDAO.class.getName() );

	public static void main(String[]args)
	{
	
BookSalesDAO books = new BookSalesDAO();
		
		LOGGER.info(books.findAll());
		
		LOGGER.info(books.findTotalBookSales());


books.delete(25);
}
}