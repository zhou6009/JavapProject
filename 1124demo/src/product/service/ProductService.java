package product.service;

import entity.Product;
import product.dao.ProductDaoImpl;

public class ProductService {
	ProductDaoImpl pd = new ProductDaoImpl();
	public Product findAll(String name) {
		Product p=pd.findAll(name);
		return p;
	}

}
