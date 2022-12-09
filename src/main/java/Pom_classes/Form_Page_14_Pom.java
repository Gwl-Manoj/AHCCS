package Pom_classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Library_Files.Utility;

public class Form_Page_14_Pom 
{
	@FindBy(xpath = "(//input[@class='form-control'])[1]") private WebElement Student_Name;
	@FindBy(xpath = "(//input[@class='form-control'])[2]") private WebElement Parent_Name;
	@FindBy(xpath = "//input[@class='btn btn-primary btn-lg']") private WebElement Next_Btn;
	
	public Form_Page_14_Pom(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void Set_Student_Name(String student_Name) throws InterruptedException
	{
		Student_Name.clear();
		Student_Name.sendKeys(student_Name);
		
	}
	
	public void Set_Parent_Name(String parent_Name) throws InterruptedException
	{
		Parent_Name.clear();
		Parent_Name.sendKeys(parent_Name);
		
	}
	
	public void Click_Next_Btn() throws InterruptedException
	{
		Next_Btn.click();
		Thread.sleep(2000);
	}
	
	public void Fill_Form_Page_14(String S_name , String P_name) throws InterruptedException, EncryptedDocumentException, IOException
	{
		Set_Student_Name(S_name);
		
		Set_Parent_Name(P_name);
		
		Click_Next_Btn();
		
		
	}

}
