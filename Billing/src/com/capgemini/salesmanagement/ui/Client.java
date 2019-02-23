package com.capgemini.salesmanagement.ui;

import java.time.LocalDate;
import java.util.Scanner;

import com.capgemini.salesmanagement.bean.Sale;
import com.capgemini.salesmanagement.exceptions.InvalidProductCategoryException;
import com.capgemini.salesmanagement.exceptions.InvalidProductCodeException;
import com.capgemini.salesmanagement.exceptions.InvalidProductNameException;
import com.capgemini.salesmanagement.exceptions.InvalidProductPriceException;
import com.capgemini.salesmanagement.exceptions.InvalidProductQuantityException;
import com.capgemini.salesmanagement.service.ISaleService;
import com.capgemini.salesmanagement.service.SaleService;

public class Client {

	public static void main(String[] args) {
		ISaleService saleservice=new SaleService();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  product code");
		int prodCode=sc.nextInt();
		try {
			saleservice.validateProductCode(prodCode);
		} catch (InvalidProductCodeException e) {
			System.out.println(e.getMessage());
			
		}
		System.out.println("Enter product category");
		String category=sc.next();
		try {
			saleservice.validateProductCat(category);
		} catch (InvalidProductCategoryException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("enter  product quantity");
		int  quantity=sc.nextInt();
		try {
			saleservice.validateQuantity(quantity);
		} catch (InvalidProductQuantityException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("enter product name");
		String productName=sc.next();
		try {
			saleservice.validateProductName(productName);
		} catch (InvalidProductNameException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("enter price");
		int prodPrice=sc.nextInt();
		try {
			saleservice.validateProductPrice(prodPrice);
		} catch (InvalidProductPriceException e) {
			System.out.println(e.getMessage());
		}
		Sale sale = new Sale(prodCode, productName, category,LocalDate.now(), quantity);
		saleservice.insertSalesDetails(sale);
		sale.setLineTotal(sale.getQuantity()*prodPrice);
		System.out.println(sale);
	}
}
