package SelenuimProgram;

import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", ".\\Software\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		System.out.println("SuccessFully done");

	}

}
