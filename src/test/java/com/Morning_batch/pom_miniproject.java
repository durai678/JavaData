package com.Morning_batch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pom_miniproject {
	
   //login page
	@FindBy(xpath="//*[@id=\'email\']")
	public static WebElement username;
	
	@FindBy(xpath="//*[@id=\'passwd\']")
	public static WebElement passward;
	
	@FindBy(xpath="//*[@id=\"SubmitLogin\"]/span")
	public static WebElement login;
	
	//Dress page
	
	@FindBy(xpath="//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	public static WebElement dress_page;
	
	@FindBy(xpath="//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")
	public static WebElement casual_dress;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div[2]/ul/li/div/div[1]/div/a[1]/img")
	public static WebElement dress;
	
	//add to cart
	
	@FindBy(xpath="/html/body/div[2]/div/div/div/div/iframe")
	public static WebElement framee;
	
	@FindBy(xpath="/html/body/div/div/div[3]/form/div/div[2]/p[1]/a[2]/span")
	public static WebElement qty;
	
	@FindBy(xpath="/html/body/div/div/div[3]/form/div/div[2]/div/fieldset[1]/div/div/select")
	public static WebElement size;
	
	@FindBy(xpath="/html/body/div/div/div[3]/form/div/div[3]/div[1]/p/button/span")
	public static WebElement add_to_cart;
	
	//checkout page
	
	 @FindBy(xpath="/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")
	 public static WebElement proceed;
	 		 
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]/span")
	public static WebElement proceed1;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
	public static WebElement proceed2;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/form/div/p[2]/div/span/input")
	public static WebElement agreee;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/form/p/button/span")
	public static WebElement proceed3;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")
	public static WebElement pay_by_cheak;
	
	//order page
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/form/p/button/span")
	public static WebElement confirm_order;
	
	@FindBy(xpath="/html/body/div/div[2]/div/div[3]/div/p[2]/a")
	public static  WebElement back_to_order;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
