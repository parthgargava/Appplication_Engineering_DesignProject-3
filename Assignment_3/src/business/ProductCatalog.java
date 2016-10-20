/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;
import business.Product;
/**
 *
 * @author Parth
 */
public class ProductCatalog {
    private ArrayList<Product> productList;

    public ProductCatalog()
    {
    this.productList=new ArrayList<Product>();
    }
    
    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }
    
    public Product addProduct()
    {
    Product product=new Product();
    productList.add(product);
    return product;
    }
    
    public void deleteProduct(Product product)
    {
    productList.remove(product);
    }
    
    public Product searchProduct(String modelNumber)
    {
    for(Product product:productList)
    {
    if(product.getModelNumber().equals(modelNumber))
    {
    return product;
    }
    }
    return null;
    }
    
    public ArrayList<Product> searchProduct(String prodName, String vendorName, String Description)
    {
    ArrayList<Product> compcol = new ArrayList<>();
    for(Product product:productList)
    {
    if(product.getProductName().equalsIgnoreCase(prodName))
    {
    compcol.add(product);
    }
    else if(product.getDescription().equalsIgnoreCase(Description))
    {
    compcol.add(product);
    }
    else if(product.getVendorName().equalsIgnoreCase(vendorName))
    {
    compcol.add(product);
    }
    
    }
    return compcol;
    }
    
}
