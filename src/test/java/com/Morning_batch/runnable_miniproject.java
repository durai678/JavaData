package com.Morning_batch;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class runnable_miniproject extends base_miniproject{
public static void main(String[] args) throws InterruptedException, IOException {
	
	Logger log = Logger.getLogger("com.Morning_batch");
	BasicConfigurator.configure();
	
	FileInputStream f=new FileInputStream("C:\\Users\\win 10\\eclipse-workspace\\Morning_batch\\src\\test\\java\\com\\Morning_batch\\project.properties");
	Properties p=new Properties();
	p.load(f);
	String emailid = p.getProperty("user");
	String passwardd = p.getProperty("pass");
	String url = p.getProperty("launch");
	String brow = p.getProperty("browser");
	
	getdriverr(brow);
	log.info("chrome launched");
	browserr(url);
	log.info("app launched");
	sleep(3000);
	PageFactory.initElements(driver, pom_miniproject.class);
	parameter(username, emailid);
	log.info("username entered");
	parameter(passward, passwardd);
	log.info("passward entered");
	clickk(login);
	log.info("login sucess");
	clickk(dress_page);
	log.info("dress page");
	clickk(casual_dress);
	log.info("casual dress page");
	sleep(3000);
	clickk(dress);
	log.info("printed dress");
	frames(framee);
	log.info("entered frame");
	clickk(qty);
	log.info("select quantity");
	slect(size);
	log.info("get size");
	clickk(add_to_cart);
	log.info("add to cart sucess");
	sleep(3000);
	clickk(proceed);
	log.info("click proceed to checkout");
	clickk(proceed1);
	log.info("click proceed to checkout");
	clickk(proceed2);
	log.info("click proceed to checkout");
	clickk(agreee);
	log.info("agree with condition");
	clickk(proceed3);
	log.info("click proceed to checkout");
	clickk(pay_by_cheak);
	log.info("click cheak");
	clickk(confirm_order);
	log.info("order conform");
	javascript(driver);
	log.info("scroll down");
	screenshot("confirm_order");
	log.info("take screen shot");
	clickk(back_to_order);
	log.info("click back to order");
	javascript(driver);
	log.info("scroll down");
	screenshot("back");
	log.info("take screenshot2");
	
	
	
	
}
	
	
}
