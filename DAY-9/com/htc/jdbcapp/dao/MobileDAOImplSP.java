package com.htc.jdbcapp.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;

import com.htc.jdbcapp.main.*;
import com.htc.jdbcapp.connector.*;

import com.htc.jdbcapp.DTO.*;

public class MobileDAOImplSP implements MobileDAO {

	@Override
	public boolean insertMobile(MobileDTO newMobile) throws SQLException {
		Connection con = DBConnector.getConnection();
		CallableStatement cstmt = con.prepareCall("{?=call INSERTMOBILE(?,?,?,?)}");
		cstmt.registerOutParameter(1, java.sql.Types.INTEGER);
		cstmt.setInt(2, newMobile.getIEMI());
		cstmt.setString(3, newMobile.getModel());
		cstmt.setString(4, newMobile.getBrand());
		cstmt.setDouble(5, newMobile.getCost());

		cstmt.execute();
		int flag = cstmt.getInt(1);
		if (flag == 1)
			return true;
		else
			return false;
	}

	@Override
	public boolean deleteMobile(int IEMI) throws SQLException {
		Connection con = DBConnector.getConnection();
		CallableStatement cstmt = con.prepareCall("{?=call DELETEMOBILE(?)}");
		cstmt.registerOutParameter(1, Types.BOOLEAN);
		cstmt.setInt(2, IEMI);
		cstmt.execute();
		if (cstmt.getBoolean(1)) {
			return true;
		} else
			return false;
	}

	@Override
	public boolean updateMobile(int IEMI, MobileDTO updatedMobile) throws SQLException {
		Connection con = DBConnector.getConnection();
		CallableStatement cstmt = con.prepareCall("{?=call UPDATEMOBILE(?,?,?,?)}");
		cstmt.registerOutParameter(1, Types.BOOLEAN);
		cstmt.setInt(2, IEMI);
		cstmt.setString(3, updatedMobile.getModel());
		cstmt.setString(4, updatedMobile.getBrand());
		cstmt.setDouble(5, updatedMobile.getCost());
		cstmt.execute();
		if (cstmt.getBoolean(1)) {
			return true;
		} else
			return false;
	}

	@Override
	public MobileDTO getMobile(int IEMI) throws SQLException {

		return null;
	}

	@Override
	public ArrayList<MobileDTO> getAllMobiles() throws SQLException {
		
		return null;
	}

}
