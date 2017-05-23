package com.eshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table
@Component
public class ProductDetails {

	@Id
	@Column(name = "ProductID")
	private int productId;
	
	@Column(name = "ProductName")
	private String  productname;
	
	@Column(name = "ProductDescription")
	private String productDescription;

	@Column(name = "ProductPrice")
	private int productPrice;
	
	@Column(name="ProductStock")
	private int productStock;
	
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

	public int getCatId() {
		return catId;
	}

	public void setCatId(int catId) {
		this.catId = catId;
	}

	public int getSupId() {
		return supId;
	}

	public void setSupId(int supId) {
		this.supId = supId;
	}

	public MultipartFile getpImage() {
		return pImage;
	}

	public void setpImage(MultipartFile pImage) {
		this.pImage = pImage;
	}

	@Column(name = "CATEGORYID ")
	private int catId;
	
	@Column(name = "SUPPLIERID ")
	private int supId;
	
	@Transient
	private MultipartFile pImage;

	
}
