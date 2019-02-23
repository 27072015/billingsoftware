package com.capgemini.salesmanagement.service;

import java.util.HashMap;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.InvalidProductCategoryException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductNameException;
import com.capgemini.salesmanagement.exceptions.InvalidProductPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidProductQuantityException;

public interface ISaleService {
public HashMap<Integer, Sale>insertSalesDetails(Sale sale);
public boolean validateProductCode(int productId)throws InvalidProductCodeException;
boolean validateQuantity(int qty)throws InvalidProductQuantityException;
boolean validateProductCat(String prodCat)throws InvalidProductCategoryException;
boolean validateProductName(String prodName)throws InvalidProductNameException;
boolean validateProductPrice(float price)throws InvalidProductPriceException;
}
