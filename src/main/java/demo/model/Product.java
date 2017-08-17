package demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import demo.Value;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
	
	private String sku;
    private Double price;
    private String name;
    private String description;
    private List<String> size;
    private String brand;
    public void setSize(List<String> size) {
		this.size = size;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	private List<String> categories;
    private String product_image_url;
    private Double special_price;
    
	    public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	public String getProduct_image_url() {
		return product_image_url;
	}
	public void setProduct_image_url(String product_image_url) {
		this.product_image_url = product_image_url;
	}
	public Double getSpecial_price() {
		return special_price;
	}
	public void setSpecial_price(Double special_price) {
		this.special_price = special_price;
	}

}
