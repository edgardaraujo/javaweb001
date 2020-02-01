package edu.infnet.comercio.negocio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.infnet.comercio.negocio.MysqlConnection;
import edu.infnet.comercio.negocio.modelo.Produto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProdutoDAO {

	private Connection con;
	private PreparedStatement pstm;
	private ResultSet rs;
	private static Logger Logger = LogManager.getLogger(ProdutoDAO.class);

	public ProdutoDAO() {
		// TODO Auto-generated constructor stub
		this.con = MysqlConnection.getConnection();
	}

	public List<Produto> findAllProdutos() {

		String sql = "select * from produto";
		List<Produto> lista = new ArrayList<Produto>();

		try {
			pstm = con.prepareStatement(sql);
			rs = pstm.executeQuery();

			while (rs.next()) {
				Produto produto = new Produto();
				produto.setId(rs.getInt("id"));
				produto.setFoto(rs.getString("foto"));
				produto.setNome(rs.getString("nome"));
				produto.setDescricao(rs.getString("descricao"));
				produto.setPreco(rs.getDouble("preco"));

				lista.add(produto);
			}

			return lista;
		} catch (Exception e) {
			// TODO: handle exception
			Logger.error("Erro ao recuperar produtos ", e);
		}

		return null;
	}
}
