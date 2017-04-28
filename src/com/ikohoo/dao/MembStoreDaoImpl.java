package com.ikohoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.ikohoo.domain.MembStore;
import com.ikohoo.domain.Product;
import com.ikohoo.util.DaoUtils;
import com.mchange.v2.c3p0.ComboPooledDataSource;

public class MembStoreDaoImpl implements MembStoreDao {

	@Override
	public MembStore getMembStoreByMembId(String id) {
		String sql = "SELECT * from membStore where membId=? ";

		ComboPooledDataSource ds = new ComboPooledDataSource("headQ");

		try {
			QueryRunner runner = new QueryRunner(ds);
			return runner.query(sql,
					new BeanHandler<MembStore>(MembStore.class), id);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		//
		//
		// try {
		// Connection conn = ds.getConnection();
		// PreparedStatement ps =
		// conn.prepareStatement("select * from memstore where membid=? ");
		// ResultSet rs = ps.executeQuery();
		// if(rs.next())
		// {
		//
		// }
		//
		// } catch (SQLException e) {
		// e.printStackTrace();
		// throw new RuntimeException(e);
		// }
		// return null;
	}

}
