package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio {
	
	@Id
	@GeneratedValue()
	private long protfolioId;
	
	@ManyToOne
	private Client client;
	
	@Column(nullable = false)
	private String creationDate;

	protected Portfolio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Portfolio(Client client, String creationDate) {
		super();
		
		this.client = client;
		this.creationDate = creationDate;
	}

	public long getProtfolioId() {
		return protfolioId;
	}

	public void setProtfolioId(long protfolioId) {
		this.protfolioId = protfolioId;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	
	
	
	
}
