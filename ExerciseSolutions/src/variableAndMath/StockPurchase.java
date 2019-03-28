/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Exercise Questoin: 

Stock Purchase & CD Calculator 
You are feeling lucky with a stock and want to go all in! You have $25,000 in savings 
and want to invest all your money to buy a stock, and the remaining money in a CD 
account. The stock price is $989 per share. How many shares of this stock can you 
buy, and how much money will be left for the CD account? 
RESULT:    Buy 25 shares of stock 
  Invest $275 in CD acco
 */
package variableAndMath;

/**
 *
 * @author danielagbaji
 */
public class StockPurchase {
    
    public static void main (String [] args){
        
    // declaration and initialization of variables    
        
        int totalSavings = 25000;
        int stockPrice = 989;
        
    // calculating for the number of shares to buy
    
        int NumberBoughtShares = (totalSavings)/(stockPrice);
        
    // calculating the remaining balance after buying the shares    
        int RemainingBalance = totalSavings%stockPrice;
        
    // outputing the result of shares bought
        System.out.println("The number of shares that can be bought is " +NumberBoughtShares);
        
     // outputing the remaining balance  
        System.out.println("The balance left after buying the shares is " +RemainingBalance);
    }
    
}
