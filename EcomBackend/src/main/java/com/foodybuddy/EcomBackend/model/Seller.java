package com.foodybuddy.EcomBackend.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Seller {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int sellerid;
	
	@Column(nullable=false)
	private String sellername;
	
	@Column(nullable=false)
	private String sellercity;

	public int getSellerid() {
		return sellerid;
	}

	public void setSellerid(int sellerid) {
		this.sellerid = sellerid;
	}

	public String getSellername() {
		return sellername;
	}

	public void setSellername(String sellername) {
		this.sellername = sellername;
	}

	public String getSellercity() {
		return sellercity;
	}

	public void setSellercity(String sellercity) {
		this.sellercity = sellercity;
	}


	

}
