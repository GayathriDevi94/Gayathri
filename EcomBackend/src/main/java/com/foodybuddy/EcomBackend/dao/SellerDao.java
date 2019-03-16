package com.foodybuddy.EcomBackend.dao;

import java.util.List;

import com.foodybuddy.EcomBackend.model.Seller;

public interface SellerDao {

	boolean insertSeller(Seller seller);
	boolean updateSeller(Seller seller);
	boolean deleteSeller(Seller seller);
	List<Seller> selectAllSellers();
	Seller selectOneCategory();

}
