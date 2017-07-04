package dao;

import java.util.logging.Logger;

import dao.RoleDAO;

public class TestRoleDAO {
	private static final Logger LOGGER = Logger.getLogger( BookDAO.class.getName() );

	public static void main(String[]args)
	{
	
RoleDAO role = new RoleDAO();
		
		LOGGER.info(role.findAll());
		
		LOGGER.info(role.findTotalRole());
	
		
	    role.delete(25);
}

}



