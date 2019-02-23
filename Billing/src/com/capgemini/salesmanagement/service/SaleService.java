package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.dao.ISaleDAO;
import com.capgemini.salesmanagement.dao.SaleDAO;
import com.capgemini.salesmanagement.exceptions.InvalidProductCategoryException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductNameException;
import com.capgemini.salesmanagement.exceptions.InvalidProductPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidProductQuantityException;

public class SaleService implements ISaleService {
ISaleDAO saleDAO=new SaleDAO();
	@Override
	public HashMap<Integer, Sale> insertSalesDetails(Sale sale) {
		
		return saleDAO.InsertSalesDetails(sale);
	}

	@Override
	public boolean validateProductCode(int productId)throws InvalidProductCodeException {
		if(productId<=1005&&productId>=1001) 
			return true;
		else throw new InvalidProductCodeException("Product id is not valid");
		
	}

	@Override
	public boolean validateQuantity(int qty) throws InvalidProductQuantityException{
		if(qty<=5&&qty>=1)
		return true;
		else throw new InvalidProductQuantityException("product quantity not valid");
	}

	@Override
	public boolean validateProductCat(String prodCat)throws InvalidProductCategoryException{
	if(prodCat.equals("Electronics")||prodCat.equals("Toys"))
		return true;
	else throw new InvalidProductCategoryException("Invalid category");
	}

	@Override
	public boolean validateProductName(String prodName)throws InvalidProductNameException {
	if(prodName.equals("TV")||prodName.equals("SmartPhone")||prodName.equals("VideoGame")||prodName.equals("SoftToy")||prodName.equals("Telescope")||prodName.equals("BarbeeDoll"))
		return true;
	else throw new  InvalidProductNameException("not valid prod name");
	}

	@Override
	public boolean validateProductPrice(float price)throws InvalidProductPriceException {
		if(price>=200)
		return true;
		else throw new InvalidProductPriceException("Invalid Product Price");
	}

}
