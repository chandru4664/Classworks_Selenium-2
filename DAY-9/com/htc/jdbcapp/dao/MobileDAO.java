package com.htc.jdbcapp.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import com.htc.jdbcapp.main.*;
import com.htc.jdbcapp.connector.*;

import com.htc.jdbcapp.DTO.*;


public interface MobileDAO {

	public boolean insertMobile(MobileDTO newMobile) throws SQLException;
	public boolean deleteMobile(int IEMI)throws SQLException;
	public boolean updateMobile(int IEMI,MobileDTO updatedMobile)throws SQLException;
	public MobileDTO getMobile(int IEMI)throws SQLException;
	public ArrayList<MobileDTO> getAllMobiles()throws SQLException;
	
	
	
}
