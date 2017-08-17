package demo.validation;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.databind.ObjectMapper;

import demo.model.Product;

public class ProductJson {
	private Product product;
	
	
	
	/**
	 * 
	 * */
	public Product ParseProduct(URL endpoint)
	{
		ObjectMapper mapper = new ObjectMapper();
		try {
			this.product = mapper.readValue(endpoint, Product.class);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.product;
	}
	
}
