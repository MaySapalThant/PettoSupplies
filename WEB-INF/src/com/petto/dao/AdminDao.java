package com.petto.dao;

import com.petto.business.entity.Admins;

public interface AdminDao {

	public Admins getAdminByLoginEmailAndPassword(String strEmail,
			String strPassword);
	
	public void saveAdmin(Admins admin);
	
}
