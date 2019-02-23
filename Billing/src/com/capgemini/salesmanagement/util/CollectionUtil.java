package com.capgemini.salesmanagement.util;

import java.util.HashMap;
import java.util.Random;

import com.capgemini.salesmanagement.bean.Sale;

public class CollectionUtil {
private static HashMap<Integer,Sale>sales=new HashMap<Integer,Sale>();
public static HashMap<Integer,Sale>getCollection(){
	return getSales();
}
public static int getSALE_ID() {
	
	return (int)Math.pow(4, 3)+new Random().nextInt(5000);
}
public static HashMap<Integer,Sale> getSales() {
	return sales;
}
public static void setSales(HashMap<Integer,Sale> sales) {
	CollectionUtil.sales = sales;
}
}
