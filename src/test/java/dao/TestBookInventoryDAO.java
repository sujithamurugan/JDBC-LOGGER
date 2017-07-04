package dao;

import java.util.logging.Logger;

import dao.BookInventoryDAO;

public class TestBookInventoryDAO {
	private static final Logger LOGGER = Logger.getLogger( BookDAO.class.getName() );

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BookInventoryDAO books = new BookInventoryDAO();
		
		LOGGER.info(books.findAll());
		
		LOGGER.info(books.findTotalBookInventory());
		
		
		
		
		
		
	    books.delete(25);
	}
	

	}


