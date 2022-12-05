package house_targaryen_jenkins_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Methods_Classes_Url_Title_Validations {


	
	public static void main(String[] args) {
		Methods_Classes_Url_Title_Validations.AerysIITargaryen();
		Methods_Classes_Url_Title_Validations.RhaegarTargaryen();
		
		Methods_Classes_Url_Title_Validations HouseTargaryen = new Methods_Classes_Url_Title_Validations();
		HouseTargaryen.ViserysTargaryen();
		HouseTargaryen.DaenerysTargaryen();
		
		Methods_Classes_Url_Title_Validations HouseTargaryen1 = new Methods_Classes_Url_Title_Validations();
		HouseTargaryen1.KhalDrogo();
	
		
			
	}
	public static void AerysIITargaryen() {
		System.out.println("The Mad King");
	}
	public static void RhaegarTargaryen() {
		System.out.println("The Dragon Prince");
	}
	public static void ViserysTargaryen() {
		System.out.println("The Beggar Prince");
	}
	public static void DaenerysTargaryen() {
		System.out.println("Princess of Dragonstone");
	}
	public static void KhalDrogo() {
		System.out.println("GreatRider");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://awoiaf.westeros.org/index.php/House_Targaryen");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		String actualCurrentUrl = "https://awoiaf.westeros.org/index.php/House_Targaryen";
		String expectedCurrentUrl = driver.getCurrentUrl();
		
		String actualTitle = "House Targaryen - A Wiki of Ice and Fire";
		String expectedTitle = driver.getTitle();
		
		if(actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			System.out.println("URL is valid & working");
		}else {
			System.out.println("Url is not valid");
		}
		
		
			
		}
		
		
		
		
		

	



		
		
		
	
		

	}


