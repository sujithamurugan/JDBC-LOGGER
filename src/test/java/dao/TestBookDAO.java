package dao;

import java.util.logging.Logger;

import dao.BookDAO;;

public class TestBookDAO {
	private static final Logger LOGGER = Logger.getLogger( BookDAO.class.getName() );

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookDAO book = new BookDAO();
		
		LOGGER.info(book.findAll());
		
		LOGGER.info(book.findTotalBook());
		
		
		
	
	book.delete(25);
	}


	}


