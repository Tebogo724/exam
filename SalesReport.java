/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreport;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class SalesReport {

    public static void main(String[] args) {
        
        Scanner input= new Scanner (System.in);
        
        //Declaring arrays
        String [] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };
        
        // Creating new 2D array
         int[][] sales= new int [3][3];
         
         //Creating new array
         int [] productTotals = new int[3];
         
         //Storing variable
         int totalSales = 0;
         
         //Allowing user to enter sales for the products
         for(int i =0; i< products.length; i++) {
             for(int j=0; j<sales[i].length; j++) {
                 
                 System.out.println("Enter number of sales for month  " + ":");
                 
                 sales[i][j]= input.nextInt();
                 
                 // Adding the mobthly sales
                 productTotals[i]= productTotals[i]+ sales[i][j];
                 
                 //Adding to total
                 totalSales = totalSales + sales[i][j];
                 
                 //Calculating the average amount of sales
                 int averageSales= totalSales/9;
                 
                 //Getting the highest saled product
                 int highestSales = productTotals[0];
                 int inDemandProduct =0;
                 
                 for(int i=1; i< productTotals.length; i++) {
                     
                     if(productTotals[i] > highestSales){
                         highestSales= productTotals[i];
                         inDemandProduct =1;
                         
                     }
                    
                 }
                 //Showing the report
                 System.out.println("PRODUCT SALES REPORT-2026");
                 System.out.println("******************************");
                 System.out.println("TOTAL PRODUCT SALES:" +totalSales);
                 System.out.println("AVERAGE PRODUCT SALES:" +averageSales);
                 System.out.println("MOST POPULAR PRODUCT: "+products[inDemandProduct]+ "(" +highestSales+")");
                 
             }
             
         }
       
    }
}
