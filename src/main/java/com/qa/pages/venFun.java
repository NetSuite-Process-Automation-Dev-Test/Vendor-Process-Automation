package com.qa.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.qa.util.TestBase;
public class venFun extends TestBase{
	//navigating to vendor
	
	@FindBy(xpath = "//li[@id='ns-header-menu-main-item5']")
	WebElement lists;
	
	@FindBy(xpath = "//li[@data-title='Relationships']")
	WebElement relationships;
	
	@FindBy(xpath = "//li[@data-title='Vendors']")
	WebElement vendors;
	
	@FindBy(xpath = "//li[@data-title='Vendors']//following::li[@data-title='New']")
	WebElement new_vendor;
	
	@FindBy(xpath = "//td[@id='spn_multibutton_submitter']")
	WebElement submit_vendor;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@id='companyname']")
	WebElement company_name;
	
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phone;
	
	@FindBy(xpath = "//input[@id='fax']")
	WebElement fax;
	
	@FindBy(xpath = "//input[@name='inpt_terms']")
	WebElement terms_arrow;
	
	@FindBy(xpath = "//td[@id='financiallnk']")
	WebElement financial_tab;
	
	@FindBy(xpath = "//input[@name='inpt_currency']")
	WebElement currency_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> drop_down_lists;
	
	@FindBy(xpath = "//td[@id='spn_secondarymultibutton_submitter']")
	WebElement secondary_vendor_save;
	
	@FindBy(xpath = "//input[@id='isperson_fs_inp']")
	List<WebElement> select_vendor_radio_button;
	
	@FindBy(xpath = "//input[@id='firstname']")
	WebElement firstname;
	
	@FindBy(xpath = "//span//input[@id='lastname']")
	WebElement lastname;
	
	@FindBy(xpath = "//div[@class='descr']")
	WebElement vendor_description;
	
	@FindBy(xpath = "//div[@class='uir-record-name']")
	WebElement vendor_name_after_saving;
	
	//bank details
	
	@FindBy(xpath = "//td[@id='custom492lnk']")
	WebElement bank_payment_details_tab;
	
	@FindBy(xpath = "//input[@value='New Entity Bank Details']")
	WebElement new_entity_bank_details;
	
	@FindBy(xpath = "//input[@id='name']")
	WebElement bank_details_name;
	
	@FindBy(xpath = "//input[@name='inpt_custpage_2663_entity_file_format']")
	WebElement payment_file_format_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> payment_file_format_dropdown;
	
	@FindBy(xpath = "//input[@name='inpt_custrecord_2663_entity_bank_type']")
	WebElement type_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> type_dropdown;
	
	@FindBy(xpath = "//input[@id='custrecord_2663_entity_acct_no']")
	WebElement bank_account_number;
	
	@FindBy(xpath = "//input[@id='custrecord_2663_entity_bank_no']")
	WebElement financial_institution_number;
	
	@FindBy(xpath = "//input[@id='custrecord_2663_entity_branch_no']")
	WebElement bank_transit_number;
	
	@FindBy(xpath = "//td[@id='spn_multibutton_submitter']")
	WebElement submit_bank_details;
	
	//vendor contact
	
	@FindBy(xpath = "//a[@id='s_relationtxt']")
	WebElement relationship_tab;
	
	@FindBy(xpath = "//input[@id='entityid']")
	WebElement contact_name;
	
	@FindBy(xpath = "//img[@id='inpt_contactrole2_arrow']")
	WebElement contact_role_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> contact_role_list;
	
	@FindBy(xpath = "//input[@id='contact_addedit']")
	WebElement contact_add;
	
	@FindBy(xpath = "//table[@id='contact_splits']//input[@id='email']")
	WebElement contact_email;
	
	@FindBy(xpath = "//table[@id='contact_splits']//tbody//tr[contains(@class,'uir-machine-row')]//td[count(//td[@data-label='Job Title']//preceding-sibling::td)]")
	List<WebElement> contact_click;
	
	@FindBy(xpath = "//table[@id='contact_splits']//tbody//tr[contains(@class,'uir-machine-row')]//td[count(//td[@data-label='Main Phone']//preceding-sibling::td)]")
	List<WebElement> contact_email_click;
	
	@FindBy(xpath = "//table[@id='contact_splits']//tbody//tr[contains(@class,'uir-machine-row')]//td[count(//td[@data-label='Role']//preceding-sibling::td)+1]")
	List<WebElement> contact_role_click;
	
	@FindBy(xpath = "//table[@id='addressbook_splits']//tbody//tr[contains(@class,'uir-machine-row-focused')]//td[count(//table[@id='addressbook_splits']//td[@data-label='Default Shipping']//preceding-sibling::td)+1]")
	WebElement default_shipping_list;
	
	@FindBy(xpath = "//table[@id='addressbook_splits']//tbody//tr[contains(@class,'uir-machine-row-focused')]//td[count(//table[@id='addressbook_splits']//td[@data-label='Default Billing']//preceding-sibling::td)+1]")
	WebElement default_billing_tab;
	
	
	//vendor address
	
	@FindBy(xpath = "//td[@id='addresslnk']")
	WebElement address_tab;
	
	@FindBy(xpath = "//a[@id='addressbookaddress_helper_popup']")
	List<WebElement> address_edit;
	
	@FindBy(xpath = "//img[@id='inpt_country1_arrow']")
	WebElement country_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> country_dropdown_list;
	
	@FindBy(xpath = "//input[@id='addrphone']")
	WebElement address_phone;
	
	@FindBy(xpath = "//input[@id='addr1']")
	WebElement address1;
	
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	
	@FindBy(xpath = "//input[@id='state']")
	WebElement state;
	
	@FindBy(xpath = "//img[@id='inpt_dropdownstate2_arrow']")
	WebElement state_arrow;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> state_dropdown_list;
	
	@FindBy(xpath = "//input[@id='zip']")
	WebElement zip;
	
	@FindBy(xpath = "//input[@id='ok']")
	WebElement address_save;
	
	@FindBy(xpath = "//input[@id='addressbook_addedit']")
	WebElement address_add;
	
	@FindBy(xpath = "//table[@id='addressbook_splits']//tr[contains(@class,'uir-machine-row-focused')]//td[count(//tr[@id='addressbook_headerrow']//div[text()='Address']//parent::td//preceding-sibling::td)+1]//div")
	WebElement address_after_save;
	
	@FindBy(xpath = "//input[@id='isperson_fs_inp']")
	List<WebElement> company_individual;
	
	@FindBy(xpath = "//table[@id='div__bodytab']//tr[contains(@id,'row')]//td[count(//td[@data-label='Duplicate']//preceding-sibling::td)]")
	List<WebElement> vendor_name_list;
	
	@FindBy(xpath = "//table[@id='div__bodytab']//tr[contains(@id,'row')]//td[count(//td[@data-label='Internal ID']//preceding-sibling::td)]//a[@class='dottedlink viewitem']")
	List<WebElement> vendor_view_list;
	
	@FindBy(xpath = "//table[@id='contact__tab']//tbody//tr[contains(@id,'contactrow')]//td[count(//td[@data-label='Company']//preceding-sibling::td)]")
	List<WebElement> contact_name_list;
	
	@FindBy(xpath = "//table[@id='contact__tab']//tbody//tr[contains(@id,'contactrow')]//td[count(//td[@data-label='Remove']//preceding-sibling::td)]")
	List<WebElement> contact_role_list_view;
	
	@FindBy(xpath = "//td[@id='tdbody_updatecontact']")
	WebElement update_primary_button;
	
	@FindBy(xpath = "//td[@id='tdbody_edit']")
	WebElement edit_primary_button;
	
	@FindBy(xpath = "//table[@id='contacts_splits']//tbody//tr[contains(@id,'contactsrow')]//td[count(//td[@data-label='Role']//preceding-sibling::td)]")
	List<WebElement> contact_list_in_edit_primary_screen;
	
	@FindBy(xpath = "//table[@id='contacts_splits']//tbody//tr[contains(@id,'contactsrow')]//td[count(//td[@data-label='Role']//preceding-sibling::td)+1]//input[contains(@name,'inpt_contactrole')]")
	List<WebElement> contact_role_list_in_edit_primary_screen;
	
	@FindBy(xpath = "//div[@class='dropdownDiv']//div")
	List<WebElement> contact_role_list_in_primary_screen;
	
	@FindBy(xpath = "//td[@id='tdbody_submitter']")
	WebElement submit_primary_edit;
	
	@FindBy(xpath = "//table[@id='recmachcustrecord_2663_parent_vendor__tab']//tbody//tr[contains(@id,'recmachcustrecord_2663_parent_vendorrow')]//td[count(//div[@id='recmachcustrecord_2663_parent_vendor__div']//td[@data-label='Type']//preceding-sibling::td)]")
	List<WebElement> bank_names_list;
	
	@FindBy(xpath = "//table[@id='recmachcustrecord_2663_parent_vendor__tab']//tbody//tr[contains(@id,'recmachcustrecord_2663_parent_vendorrow')]//td[count(//div[@id='recmachcustrecord_2663_parent_vendor__div']//td[@data-label='Payment File Format']//preceding-sibling::td)]")
	List<WebElement> bank_type_list;
	
	@FindBy(xpath = "//table[@id='recmachcustrecord_2663_parent_vendor__tab']//tbody//tr[contains(@id,'recmachcustrecord_2663_parent_vendorrow')]//td[count(//div[@id='recmachcustrecord_2663_parent_vendor__div']//td[@data-label='Name']//preceding-sibling::td)]//a")
	List<WebElement> bank_edit_link;
	
	Actions action=new Actions(driver);
	
	JavascriptExecutor jsx = (JavascriptExecutor)driver;

	
	public venFun()
	{
		PageFactory.initElements(driver, this);
	}
	public boolean isAlertPresent_() {
		try {
			Alert a = new WebDriverWait(driver,2).until(ExpectedConditions.alertIsPresent());
			if (a != null) {
				System.out.println("Alert is present");
				return true;
			} else {
				throw new Throwable();
			}
		} catch (Throwable e) {
			System.err.println("Alert isn't present!!");
			return false;
		}

	}
	public static void eleContainsText(WebDriver driver, WebElement element, int time, String text) {
		new WebDriverWait(driver, time).until(ExpectedConditions.textToBePresentInElement(element, text));
		}
	public void navigate_to_vendor() throws InterruptedException
	{
		action.moveToElement(lists).build().perform();
		Thread.sleep(2000);
		action.moveToElement(relationships).build().perform();
		Thread.sleep(2000);
		action.moveToElement(vendors).build().perform();
		Thread.sleep(2000);
		action.moveToElement(new_vendor).click().build().perform();
		if(isAlertPresent_()==true)
		{
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
	}
	public void vendor_validations(String company_name,String firstname,String last_name,String email,String phone,String fax,String currency,String terms,String bank_details_name2, String payment_file_format, String type, String account_number, String financial_institute_number, String bank_transit_numbr, String contact, String contact_email, String contact_role, String address, String address_phone2, String city2, String country, String zip2, String state, String type_is, String billing_address, String shipping_address, ExtentTest test,ExtentReports report) throws InterruptedException
	{
		String [] two_bank_name=new String[2];
		String[] two_type=new String[2];
		String[] two_payment_file_format=new String[2];
		String[] two_account=new String[2];
		String[] two_financial_number=new String[2];
		String[] two_transit_number=new String[2];
		String[] two_country=new String[2];
		String[] two_address=new String[2];
		String[] two_address_phone=new String[2];
		String[] two_state=new String[2];
		String[] two_city=new String[2];
		String [] two_zip=new String[2];
		String [] two_billing=new String[2];
		String [] two_shipping=new String[2];
		String [] two_contacts=new String[2];
		String [] two_roles=new String[2];
		String[] two_emails=new String[2];
		for(int i=0;i<2;i++)
		{
		two_bank_name=bank_details_name2.trim().split(",");	
		two_type=type.trim().split(",");
		two_payment_file_format=payment_file_format.trim().split(",");
		two_account=account_number.trim().split(",");
		two_financial_number=financial_institute_number.trim().split(",");
		two_transit_number=bank_transit_numbr.trim().split(",");
		two_country=country.trim().split(",");
		two_address=address.trim().split(",");
		two_address_phone=address_phone2.trim().split(",");
		two_state=state.trim().split(",");
		two_city=city2.trim().split(",");
		two_zip=zip2.trim().split(",");
		two_billing=billing_address.trim().split(",");
		two_shipping=shipping_address.trim().split(",");
		two_contacts=contact.trim().split(",");
		two_roles=contact_role.trim().split(",");
		two_emails=contact_email.trim().split(",");
		}
		
		ExtentTest test1=test.createNode("Vendor creation with type "+type_is);
		boolean email_flag=false;		
		boolean phone_flag=false;
		boolean contact_email_flag=false;
		boolean fax_flag=false;
		boolean terms_flag=false;
		boolean currency_flag=false;
		boolean contact_role_flag=false;
		boolean country_flag=false;
		boolean address_phone_flag=false;
		boolean state_flag=false;
		boolean type_flag=false;
		boolean error_flag_incorrect=false;
		boolean error_flag_no_data=false;
		boolean payment_file_format_flag=false;
		navigate_to_vendor();
		if(type_is.trim().equals("Individual"))
		{
			contact_email_flag=true;
			contact_role_flag=true;
			if(company_individual.get(1).isSelected())
			{
				System.out.println("alredy selected");
			}
			else
			{
				company_individual.get(1).click();
			}
			this.firstname.sendKeys(firstname);
			this.lastname.sendKeys(last_name);
		}
		else
		{
			if(company_individual.get(0).isSelected())
			{
				System.out.println("Already selected");
			}
			else
			{
				company_individual.get(0).click();
			}
			this.company_name.sendKeys(company_name.trim());
		}		
		this.email.sendKeys(email);
		action.sendKeys(Keys.TAB).build().perform();
		if(isAlertPresent_()==true)
		{
			Alert alert=driver.switchTo().alert();
			email_flag=true;
			alert.accept();
			this.email.clear();
		}
		if(!email_flag)
		{
		this.phone.sendKeys(phone);
		action.sendKeys(Keys.TAB).build().perform();
		if(isAlertPresent_()==true)
		{
			Alert alert=driver.switchTo().alert();
			if(alert.getText().equals("Phone number should have seven digits or more."))
			{
				phone_flag=true;
			}
			alert.accept();
			this.phone.clear();
		}
		if(!phone_flag)
		{
		
		this.fax.sendKeys(fax);
		action.sendKeys(Keys.TAB).build().perform();
		if(isAlertPresent_()==true)
		{
			Alert alert=driver.switchTo().alert();
			if(alert.getText().equals("Phone number should have seven digits or more."))
			{
				fax_flag=true;
			}
			alert.accept();
			this.fax.clear();
			
		}
		if(!fax_flag)
		{
		jsx.executeScript("arguments[0].scrollIntoView(true);",financial_tab);
		Thread.sleep(2000);
		financial_tab.click();
		terms_arrow.click();
		Thread.sleep(2000);
		for(int i=0;i<drop_down_lists.size();i++)
		{
			if(drop_down_lists.get(i).getText().equals(terms.trim()))
			{
				drop_down_lists.get(i).click();
				terms_flag=true;
				break;
			}
		}
		terms_arrow.click();
		if(terms_flag)
		{
			
		currency_arrow.click();
		Thread.sleep(2000);
		for(int i=0;i<drop_down_lists.size();i++)
		{
			if(drop_down_lists.get(i).getText().equals(currency.trim()))
			{
				drop_down_lists.get(i).click();
				currency_flag=true;
				break;
			}
		}
		if(currency_flag)
		{
			if(type_is.equals("Company"))
			{
			relationship_tab.click();	
			for(int z=0;z<two_contacts.length;z++)
			{
			//contact_click.get(z).click();
			contact_name.click();
			contact_name.sendKeys(two_contacts[z].trim());
			Thread.sleep(4000);
			contact_email_click.get(z).click();
			contact_email_click.get(z).click();
			this.contact_email.sendKeys(two_emails[z].trim());
			action.sendKeys(Keys.TAB).build().perform();
			if(isAlertPresent_()==true)
			{
				Alert alert=driver.switchTo().alert();
				if(alert.getText().equals(two_emails[z]+" "+"Please enter a valid email address."))
				{
					contact_email_flag=true;
					alert.accept();
					this.contact_email.clear();
					break;
				}
				
			}
			Thread.sleep(4000);
			if(!contact_email_flag)
			{
				contact_role_click.get(z).click();
				contact_role_arrow.click();
				Thread.sleep(1000);
				for(int i=0;i<contact_role_list.size();i++)
				{
					if(contact_role_list.get(i).getText().equals(two_roles[z].trim()))
					{
						contact_role_flag=true;
						contact_role_list.get(i).click();
						break;
					}
				}
				Thread.sleep(5000);
				contact_add.click();
				Thread.sleep(2000);
			}
			else
			{
				test1.fail("Contact email is incorrect...Please enter valid contact email");
				System.out.println("Contact email is incorrect");
			}
		}
			}

			if(contact_role_flag)
			{
				country_flag=false;
				address_phone_flag=false;
				state_flag=false;
				address_tab.click();
				for(int j=0;j<2;j++)
				{
					
					if(two_shipping[j].equals("Yes"))
					{
						default_shipping_list.click();
					if(driver.findElement(By.xpath("//span[@id='addressbook_defaultshipping_fs']")).getAttribute("class").equals("checkbox_unck"))
						{
						driver.findElement(By.xpath("//span[@id='addressbook_defaultshipping_fs']")).click();
						}
					else
					{
						System.out.println("already checked");
					}
					}
					else
					{
						default_shipping_list.click();
						if(driver.findElement(By.xpath("//span[@id='addressbook_defaultshipping_fs']")).getAttribute("class").equals("checkbox_ck"))
						{
							driver.findElement(By.xpath("//span[@id='addressbook_defaultshipping_fs']")).click();

						}
						
						
					}
					if(two_billing[j].equals("Yes"))
					{
						action.sendKeys(Keys.TAB).build().perform();
						if(driver.findElement(By.xpath("//span[@id='addressbook_defaultbilling_fs']")).getAttribute("class").equals("checkbox_unck"))
						{
							driver.findElement(By.xpath("//span[@id='addressbook_defaultbilling_fs']")).click();
						}
						else
						{
							System.out.println("billing is alrdy checked");
						}
					
					}
					else
					{
						action.sendKeys(Keys.TAB).build().perform();
						if(driver.findElement(By.xpath("//span[@id='addressbook_defaultbilling_fs']")).getAttribute("class").equals("checkbox_ck"))
						{
							driver.findElement(By.xpath("//span[@id='addressbook_defaultbilling_fs']")).click();

						}
						
					}
					Thread.sleep(3000);
					address_edit.get(j).click();
					driver.switchTo().frame("childdrecord_frame");
					Thread.sleep(2000);
					country_arrow.click();
					for(int i=0;i<country_dropdown_list.size();i++)
					{
						if(country_dropdown_list.get(i).getText().equals(two_country[j].trim()))
						{
							country_flag=true;
							country_dropdown_list.get(i).click();
							break;
							
						}
					}
					Thread.sleep(6000);
					if(country_flag)
					{
						this.address_phone.sendKeys(two_address_phone[j].trim());
						action.sendKeys(Keys.TAB).build().perform();
						if(isAlertPresent_()==true)
						{
							Alert alert=driver.switchTo().alert();
							if(alert.getText().equals("Phone number should have seven digits or more."))
							{
								alert.accept();
								this.address_phone.clear();
								address_phone_flag=true;
								
							}
						}
						if(!address_phone_flag)
						{
							address1.sendKeys(two_address[j]);
							city.sendKeys(two_city[j]);
							
							 try {	
							state_arrow.click();
							for(int i=0;i<state_dropdown_list.size();i++)
							{
								if(state_dropdown_list.get(i).getText().equals(two_state[j].trim()))
								{
									state_flag=true;
									state_dropdown_list.get(i).click();
									break;
								}
							}
							 }
							 catch(ElementNotInteractableException e)
							 {
								 
								 this.state.sendKeys(two_state[j]);
								 state_flag=true;
							 }
							 if(state_flag)
								{
								 zip.sendKeys(two_zip[j]);
									address_phone.click();
									
									Thread.sleep(3000);
									address_save.click();
									eleContainsText(driver, address_after_save, 20, two_country[j]);
								    driver.switchTo().defaultContent();
								    Thread.sleep(3000);
								    address_add.click();
								    if(j==two_address.length)
								    {
								    	break;
								    }

									
								}
							 else
							 {
								 test1.fail("State is invalid or not present in the list...Please select state from the list");
								 System.out.println("State is invalid");
								 break;
							 }
							
						}
						else
						{
							System.out.println("Address phone number is invalid");
							test1.fail("Address phone number is invalid...Please select valid phone number");
							break;
						}
						
					}
					else
					{
						test1.fail("Country is not present in the list...Please select country from the list");
						System.out.println("Country is invalid");
						break;
					}
					
					
					
					
				}
				jsx.executeScript("arguments[0].scrollIntoView(true);",secondary_vendor_save);
				secondary_vendor_save.click();
				if(vendor_description.getText().trim().equals("Vendor successfully Saved"))
				{
					test1.pass(vendor_name_after_saving.getText()+" vendor is created successfully" );
					System.out.println("Vendor is created succesfully");
					for(int k=0;k<two_account.length;k++)
					{
						payment_file_format_flag=false;
						type_flag=false;
						error_flag_incorrect=false;
						error_flag_no_data=false;
						jsx.executeScript("arguments[0].scrollIntoView(true);",bank_payment_details_tab);
						Thread.sleep(1000);
						bank_payment_details_tab.click();
						Thread.sleep(1000);
						new_entity_bank_details.click();
						payment_file_format_arrow.click();
						for(int i=0;i<payment_file_format_dropdown.size();i++)
						{
							if(payment_file_format_dropdown.get(i).getText().equals(two_payment_file_format[k].trim()))
							{
								payment_file_format_flag=true;
								payment_file_format_dropdown.get(i).click();
								break;
							}
						
						}
						if(payment_file_format_flag)
						{
						bank_details_name.sendKeys(two_bank_name[k].trim());
						Thread.sleep(2000);
						type_arrow.click();
						for(int i=0;i<type_dropdown.size();i++)
						{
							if(type_dropdown.get(i).getText().equals(two_type[k].trim()))
							{
								type_flag=true;
								type_dropdown.get(i).click();
								break;
							}
						}
						if(type_flag)
						{
							bank_account_number.sendKeys(two_account[k].trim());
							financial_institution_number.sendKeys(two_financial_number[k].trim());
							bank_transit_number.sendKeys(two_transit_number[k].trim());
							submit_bank_details.click();
							String error_incorrect=null;
							String error_no_data=null;
							Thread.sleep(5000);
							if(isAlertPresent_()==true)
							{
								Alert alert=driver.switchTo().alert();
								if(alert.getText().contains("Please correct the values of the following fields before submitting the form:"))
								{
									error_flag_incorrect=true;
									error_incorrect=alert.getText();
									alert.accept();
								}
								else if (alert.getText().contains("Please enter value(s) for:"))
								{
									error_flag_no_data=true;
									error_no_data=alert.getText();
									alert.accept();
								}
								else
								{
									System.out.println("some other alert");
									alert.accept();
									Thread.sleep(2000);
									error_flag_incorrect=false;
								}
							}
							if(!error_flag_incorrect&&!error_flag_no_data)
							{
								test1.pass("Bank Details are added Successfully for "+two_bank_name[k]);
							}
							else
							{
								if(error_flag_incorrect)
								{
								test1.fail(error_incorrect+" for "+two_bank_name[k]);
								break;
								}
								if(error_flag_no_data)
								{
									test1.fail(error_no_data+" for "+two_bank_name[k]);
									break;
								}
							}
							
						}
						else
						{
							test1.fail("Type is not present in the list....Please select type from the list");
							System.out.println("Type is incorrect");
							break;
						}
						}
						else
						{
							
							test1.fail("Payment file format is incorrect...Please select Payment file format from the list");
							System.out.println("Payment file format is incorrect");
							break;
						}	
				
				}
					
			}
		
			
			
		}
			else
			{
				test1.fail("Contact role is incorrect ...Please select correct role from the list");
				System.out.println("Contact role is incorrect");
			}
		
		
		}
		
			else
			{
				test1.fail("Currency is not present in the list ...please select currency from the list");
				System.out.println("Currency is invalid");
				
			}
		}
		else
		{
			test1.fail("Terms are not present in the list...Please select terms from the list");
			System.out.println("Terms are not present");
		}
		
		}
		else
		{
			test1.fail("Fax is invalid...Please give correct fax number");
			System.out.println("Fax is invalid");
		}
		
		
		}
		else
		{
			test1.fail("Phone number is invalid...Please give valid phone number");
			System.out.println("Phone number is invalid");
		}
	
		
		}
		else
		{
			test1.fail("Email is invalid...Please give valid email address");
			System.out.println("Email is invalid");
		}
		if(type_is.trim().equals("Company"))
	{
		if(email_flag==true||phone_flag==true||fax_flag==true||terms_flag==false||currency_flag==false||contact_email_flag==true||contact_role_flag==false||country_flag==false||address_phone_flag==true||state_flag==false)
		{
			test1.fail("Vendor is not created");
			System.out.println("Vendor is not created");
		}
	}
		if(type_is.trim().equals("Individual"))
		{
			if(email_flag==true||phone_flag==true||fax_flag==true||terms_flag==false||currency_flag==false||country_flag==false||address_phone_flag==true||state_flag==false)
			{
				test1.fail("Vendor is not created");
				System.out.println("Vendor is not created");
			}

		}
}
	
	public void update_primary_contact(String contact_name,String contact_role, String company_name,ExtentTest test) throws InterruptedException
	{
		boolean vendor_found=false;
		String first_primary_contact=null;
		driver.navigate().to("https://tstdrv939178.app.netsuite.com/app/common/entity/vendorlist.nl");
		for(int i=0;i<vendor_name_list.size();i++)
		{
			if(vendor_name_list.get(i).getText().equals(company_name.trim()))
			{
				vendor_view_list.get(i).click();
				Thread.sleep(4000);
				vendor_found=true;
				break;
			}
		}
		if(!vendor_found)
		{
			test.fail("Given vendor is not found in the vendor list...Please give existing vendor");
		}
		jsx.executeScript("arguments[0].scrollIntoView(true);",relationship_tab);
		Thread.sleep(3000);
		relationship_tab.click();
		boolean contact_present=false;
		boolean contact_primary=false;
		for(int i=0;i<contact_name_list.size();i++)
		{
			String contact_names=contact_name_list.get(i).getText().trim();
			if(contact_names.equals(contact_name.trim()))
			{
				contact_present=true;
				if(contact_role_list_view.get(i).getText().equals(contact_role.trim()))
				{
					contact_primary=true;
					if(contact_primary)
					{
						test.fail("Contact is having  already role as  primary");
						break;
					}
				}
				else
				{
					test.pass(contact_name+" first role is: "+contact_role_list_view.get(i).getText());
				}
				
			}
			if(!contact_names.equals(contact_name.trim()))
			{
				if(contact_role_list_view.get(i).getText().equals(contact_role.trim()))
				{
					first_primary_contact=contact_name_list.get(i).getText().trim();
					test.pass(first_primary_contact+" first role is: "+contact_role_list_view.get(i).getText());
					
				}
				
			}
			
		}
		
		if(!contact_present)
		{
				test.fail("Given Contact is not present");
		}
		else
		{
		if(!contact_primary&&contact_present)
		{
			update_primary_button.click();
			ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    Thread.sleep(2000);
		    edit_primary_button.click();
		    contact_list_in_edit_primary_screen.clear();
		    for(int i=0;i<contact_list_in_edit_primary_screen.size();i++)
		    {
		    	if(contact_list_in_edit_primary_screen.get(i).getText().trim().equals(contact_name.trim()))
		    	{
		    		contact_role_list_in_edit_primary_screen.get(i).click();
		    		Thread.sleep(3000);
		    		for(int j=0;j<contact_role_list_in_primary_screen.size();j++)
		    		{
		    			if(contact_role_list_in_primary_screen.get(j).getText().trim().equals(contact_role.trim()))
		    			{
		    				contact_role_list_in_primary_screen.get(j).click();
		    				Thread.sleep(3000);
		    				break;
		    			}
		    		}
		    		
		    	}
		    }
		    submit_primary_edit.click();
		    Thread.sleep(2000);
		    driver.switchTo().window(tabs.get(0));
		    Thread.sleep(2000);
		    boolean contact_present_after=false;
		    boolean contact_role_after=false;
		    for(int i=0;i<contact_name_list.size();i++)
			{
				String contact_names=contact_name_list.get(i).getText().trim();
				if(contact_names.equals(contact_name.trim()))
				{
					contact_present=true;
					if(contact_role_list_view.get(i).getText().equals(contact_role.trim()))
					{
						contact_primary=true;
						if(contact_primary)
						{
							test.pass(contact_name+" role after updating is: "+contact_role_list_view.get(i).getText());
							//break;
						}
						else
						{
							test.fail("Contact is not updated as primary contact");
						}
					}
					
				}
				if(contact_names.equals(first_primary_contact.trim()))
				{
					if(contact_role_list_view.get(i).getText().trim().equals(""))
					{	
						test.pass(first_primary_contact+" role after updating is: "+contact_role_list_view.get(i).getText());
					}
					else
					{
						test.fail("Contact role is not set to empty");
					}
					
					
				}
			}
		    
		    
		    
		    
			
		}
		}
		
		
		
		
		
	}
	public void update_primary_bank(String bank_name, String type, String vendor_name, ExtentTest test) throws InterruptedException
	{
		boolean vendor_found=false;
		driver.navigate().to("https://tstdrv939178.app.netsuite.com/app/common/entity/vendorlist.nl");
		for(int i=0;i<vendor_name_list.size();i++)
		{
			if(vendor_name_list.get(i).getText().equals(vendor_name.trim()))
			{
				vendor_view_list.get(i).click();
				Thread.sleep(4000);
				vendor_found=true;
				break;
			}
		}
		if(!vendor_found)
		{
			test.fail("Given vendor is not found in the vendor list...Please give existing vendor");
		}
		jsx.executeScript("arguments[0].scrollIntoView(true);",bank_payment_details_tab);
		Thread.sleep(3000);
		boolean bank_found=false;
		boolean bank_type=false;
		bank_payment_details_tab.click();
		for(int i=0;i<bank_names_list.size();i++)
		{
			if(bank_names_list.get(i).getText().equals(bank_name))
			{
				bank_found=true;
				if(bank_type_list.get(i).getText().trim().equals(type.trim()))
				{
					bank_type=true;
				}
				else
				{
					test.pass(bank_name+" bank type before updating is: "+bank_type_list.get(i).getText());
					bank_edit_link.get(i).click();
					break;
				}
				
				
			}
			if(!bank_names_list.get(i).getText().equals(bank_name))
			{
				test.pass(bank_names_list.get(i).getText()+" bank type before updating is: "+bank_type_list.get(i).getText());
			}

			
		}
			
			
		
		if(!bank_found)
		{
			test.fail("Given Bank name is not found in the bank list");
		}
		if(bank_type)
		{
			test.fail("Given bank is already a primary bank");
		}
		if(bank_found&&!bank_type)
		{
			Thread.sleep(3000);
			type_arrow.click();
			for(int i=0;i<type_dropdown.size();i++)
			{
				if(type_dropdown.get(i).getText().equals(type.trim()))
				{
					type_dropdown.get(i).click();
					break;
				}
			}
			submit_bank_details.click();
			if(isAlertPresent_()==true)
			{
				Alert alert=driver.switchTo().alert();
				alert.accept();		
			}
			Thread.sleep(5000);
			jsx.executeScript("arguments[0].scrollIntoView(true);",bank_payment_details_tab);
			Thread.sleep(3000);
			bank_payment_details_tab.click();
			Thread.sleep(1000);
			for(int i=0;i<bank_names_list.size();i++)
			{
				if(bank_names_list.get(i).getText().equals(bank_name.trim()))
				{
					if(bank_type_list.get(i).getText().trim().equals(type.trim()))
					{
						test.pass( bank_name+" type after updating is: "+bank_type_list.get(i).getText());
					}
					else
					{
						test.fail(bank_name+" Bank type is not updated as primary");
					}
	
				}
				if(!bank_names_list.get(i).getText().equals(bank_name))
				{
					if(bank_type_list.get(i).getText().trim().equals("Secondary"))
					{
						test.pass(bank_names_list.get(i).getText()+" bank type after updating is: "+bank_type_list.get(i).getText());
					}
					else
					{
						test.fail(bank_names_list.get(i).getText()+" bank type is not updated as Secondary ");
					}

					
				}
				
			}
			
			
			
		}
		

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

