package util;

import java.util.logging.Logger;

import dao.BookDAO;

public class TestConnectionUtil {
	private static final Logger LOGGER = Logger.getLogger( BookDAO.class.getName() );

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LOGGER.info(ConnectionUtil.getJdbcTemplate());

	}

}
