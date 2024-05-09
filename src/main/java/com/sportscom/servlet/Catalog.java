package com.sportscom.servlet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Catalog {
	
	private static Map<String, CatalogItem> catalogItems = new HashMap<>();
	
	public void addItem(CatalogItem catalogItem) {
		catalogItems.put(catalogItem.getSku(), catalogItem);
	}
	
	public CatalogItem getItem(String sku) {
		return catalogItems.get(sku);
	}
	
	public ArrayList<CatalogItem> listItems() {
		return (ArrayList<CatalogItem>) catalogItems.values();
	}
}
