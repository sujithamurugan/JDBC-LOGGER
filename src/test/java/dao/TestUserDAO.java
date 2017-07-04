package dao;

import java.util.logging.Logger;

import dao.UserDAO;

public class TestUserDAO {
	private static final Logger LOGGER = Logger.getLogger( BookDAO.class.getName() );

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDAO user = new UserDAO();
		
		LOGGER.info(user.findAll());
		
		LOGGER.info(user.findTotalUser());
		
		
	    user.delete(25);
	}

	}


