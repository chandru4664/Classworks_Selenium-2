package com.htc.jdbcapp.main;
import com.htc.jdbcapp.connector.*;
import com.htc.jdbcapp.dao.*;
import com.htc.jdbcapp.DTO.*;


import java.sql.SQLException;



public class Main {

	public static void main(String[] args) {
		
		try {
			MobileDAOImplSP impl=new MobileDAOImplSP();
			//System.out.println(new MobileDAOImplSP().updateMobile(123432,new MobileDTO(12345,"k3","Lenvo",100)));
			System.out.println(new MobileDAOImplSP().deleteMobile(123432));
		//boolean flag=impl.insertMobile(new MobileDTO(123432,"k3 note","Lenovo",15000));
			//System.out.println(flag);
			
			//insert
			//boolean insertFlag=impl.insertMobile(new MobileDTO(123432,"k3 note","Lenovo",15000.00));
			//System.out.println("InsertFlag: "+insertFlag);
			
			//retrieve existing mobile 
			//MobileDTO updatedMobile=impl.getMobile(123432);
			
			//updating old mobile object
			//updatedMobile.setBrand("updatedBrand");
			//updatedMobile.setCost(10000.00);
			//updatedMobile.setModel("updatedModel");
			
			// update
			//boolean updateFlag=impl.updateMobile(123432, updatedMobile);
			//System.out.println("UpdateFlag: "+updateFlag);
			
			// get all mobiles
			/*for(MobileDTO mobile:impl.getAllMobiles()) {
				System.out.println(mobile.toString());
			}
			// delete mobile
			boolean deleteFlag=impl.deleteMobile(123432);
			System.out.println("DeleteFlag: "+deleteFlag);
			*/
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
