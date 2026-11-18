/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreport;

/**
 *
 * @author Student
 */
public class Product implements IProduct {
    
    //Declaration
    private String [] products;
    private int [][] sales;
    
    //Constructor
    public Product(String[] products, int[][] sales){
        this.products= products;
        this.sales= sales;
    }
    //Getting the total sales
    @Overrride
    public int GetTotalProductsSold(){
       
        
        int total=0;
        
        for(int i=0; i< sales.length; i++){
            
            for(int j=0; j< sales[i].length; j++) {
                
                total= total+sales[i][j];
            }
        }
        return total;
    }
    //Getting average sales
    @Override
    public double GetAverageProductSold() {
        //Declaration
        int total= GetTotalProductsSold();
        
        int Count=0;
        
        for(int i=0; i<sales.length; i++) {
        
        for(int j=0; j<sales[i].length; j++) {
    }
    }
        return double total/count;
        
        //Getting the product with highest sales
        @Override
        public String GetMostPopularProduct() {
        
        //Declaration
        int highestSales=0;
        int popularPosition= 0;
        
        //Getting total sales
        for(int i=0; i< sales.length; i++) {
            
            int productTotal=0;
            
            for(int j=0; j< sales[i].length; j++) {
                
                productTotal= productTotal+sales[i][j];
            }
            if(productTotal>highestSales){
                 highestSales= productTotal;
                 popularPosition=i;
            }
        }
          return products[popularPosition];
            
        }
    }
}
