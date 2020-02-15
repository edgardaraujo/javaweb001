package edu.infnet.comercio.negocio.dao;

import edu.infnet.comercio.negocio.JpaConnection;

public class ProdutoJPADAO extends JpaDAO {
	
	public ProdutoJPADAO() {
		this.em = JpaConnection.getEmf().createEntityManager();
		
	}
	
}
