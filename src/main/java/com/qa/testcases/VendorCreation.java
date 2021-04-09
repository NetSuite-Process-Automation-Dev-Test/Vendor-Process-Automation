package com.qa.testcases;
import java.io.IOException;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.qa.exceldataReader.ExcelReader;
import com.qa.exceldataReader.ExcelReaderbycolumnname;
import com.qa.pages.AuthPage;
import com.qa.util.TestBase;
import com.qa.util.TestUtil;
import com.qa.pages.*;

	public class VendorCreation extends TestBase {
		TestUtil testUtil;
		ExcelReader reader;
		ExtentSparkReporter htmlReporter;
		ExtentReports extent;
		ExtentTest test;
		venFun vendor;
		AuthPage authpage;
		String file_name_="C:\\Users\\Sindhuja\\Desktop\\Vendor_data.xlsx";
		
		public void send_email() throws EmailException
		{
			EmailAttachment attachment = new EmailAttachment();
			  attachment.setPath("./vendor_report/VendorReport.html");
			  attachment.setDisposition(EmailAttachment.ATTACHMENT);
			  MultiPartEmail email = new MultiPartEmail();
			  email.setHostName("smtp.gmail.com");
			  email.setSmtpPort(465);
			  email.setAuthenticator(new DefaultAuthenticator("sindhuja.b@tvarana.com", "Sindhu@123"));
			  email.setSSLOnConnect(true);
			  email.addTo("sindhuja.b@tvarana.com", "Sindhu");
			  email.setFrom("sindhuja.b@tvarana.com", "Sindhuja");
			  email.setSubject("Vendor Test Report");
			  email.setMsg("Here is the report please find the attachment");
			  email.attach(attachment);
			  email.send();
		}
		@BeforeTest
		public void setExtent() {
			// specify location of the report
			htmlReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/vendor_report/VendorReport.html");
			htmlReporter.config().setDocumentTitle("Vendor Test Report"); // Tile of report
			htmlReporter.config().setReportName("Vendor Test Report"); // Name of the report
			htmlReporter.config().setTheme(Theme.STANDARD);
			extent = new ExtentReports();
			extent.attachReporter(htmlReporter);
			// Passing General information
			extent.setSystemInfo("Environemnt", "QA");
			extent.setSystemInfo("user", "Sindhuja");
		}

		@AfterTest
		public void endReport() throws EmailException {
			extent.flush();
			send_email();
		}

		@AfterMethod
		public void tearDown(ITestResult result) throws IOException {
			if (result.getStatus() == ITestResult.FAILURE) {
				test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName()); // to add name in extent report
				test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable()); // to add error/exception in extent
																						// report
			} else if (result.getStatus() == ITestResult.SKIP) {
				test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
			} else if (result.getStatus() == ITestResult.SUCCESS) {
				//test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
			}
			//driver.quit();
		}

		@BeforeMethod
		public void setUp() throws InterruptedException {
			testUtil = new TestUtil();
			testUtil.setUp();
		}
		@Test(priority = 3)
		public void update_primary_contact() throws IOException, InterruptedException
		{
			test=extent.createTest("Updating primary contact");
			ExcelReaderbycolumnname reader=new ExcelReaderbycolumnname();
			String [] contact_name=reader.excelReader(file_name_, 1, "contact_name");
			String [] contact_role=reader.excelReader(file_name_, 1, "role");
			String[] company_name=reader.excelReader(file_name_, 1, "company_name");
			for(int i=0;i<contact_name.length;i++)
			{
			vendor=new venFun();
			vendor.update_primary_contact(contact_name[i], contact_role[i],company_name[i],test);
			}

			
		}
		@Test(priority = 2)
		public void update_primary_bank() throws IOException, InterruptedException
		{
			test=extent.createTest("Updating Bank type as Primary");
			ExcelReaderbycolumnname reader=new ExcelReaderbycolumnname();
			String [] bank_name=reader.excelReader(file_name_, 2, "bank_name");
			String [] type=reader.excelReader(file_name_, 2, "type");
			String[] vendor_name=reader.excelReader(file_name_, 2, "vendor_name");
			for(int i=0;i<bank_name.length;i++)
			{
			vendor=new venFun();
			vendor.update_primary_bank(bank_name[i], type[i],vendor_name[i],test);
			}

			
		}
		
		@Test(priority = 1)
		public void  vendor_validations() throws IOException, InterruptedException
		{
			test=extent.createTest("Vendor creation ");

			ExcelReaderbycolumnname reader=new ExcelReaderbycolumnname();
			String [] company_name=reader.excelReader(file_name_, 0, "company_name");
			String [] first_name=reader.excelReader(file_name_, 0, "first_name");
			String [] last_name=reader.excelReader(file_name_, 0, "last_name");
			String [] email=reader.excelReader(file_name_, 0, "email");
			String [] phone=reader.excelReader(file_name_, 0, "phone");
			String [] fax=reader.excelReader(file_name_, 0, "fax");
			String [] currency=reader.excelReader(file_name_, 0, "currency");
			String [] terms=reader.excelReader(file_name_, 0, "terms");
			String [] bank_details_name=reader.excelReader(file_name_, 0, "bank_details_name");
			String [] payment_file_format=reader.excelReader(file_name_, 0, "payment_file_format");
			String[] type=reader.excelReader(file_name_, 0, "type");
			String[] account_number=reader.excelReader(file_name_, 0, "account_number");
			String [] financial_institute_number=reader.excelReader(file_name_, 0, "financial_institute_number");
			String[] bank_transit_numbr=reader.excelReader(file_name_, 0, "bank_transit_number");
			String[] contact=reader.excelReader(file_name_, 0, "contact");
			String[] contact_email=reader.excelReader(file_name_, 0, "contact_email");
			String[] contact_role=reader.excelReader(file_name_, 0, "contact_role");
			String[] country=reader.excelReader(file_name_, 0, "country");
			String[] address_phone=reader.excelReader(file_name_, 0, "address_phone");
			String[] address=reader.excelReader(file_name_, 0, "address");
			String[] city=reader.excelReader(file_name_, 0, "city");
			String[] state=reader.excelReader(file_name_, 0, "state");
			String[] zip=reader.excelReader(file_name_, 0, "zip");
			String [] Type_is=reader.excelReader(file_name_, 0, "Type_is");
			String [] Billing_address=reader.excelReader(file_name_, 0, "Billing_address");
			String [] Shipping_address=reader.excelReader(file_name_, 0, "Shipping_address");
			
			for(int i=0;i<currency.length;i++)
			{
			vendor=new venFun();
			vendor.vendor_validations(company_name[i], first_name[i], last_name[i], email[i], phone[i], fax[i], currency[i], terms[i],bank_details_name[i],payment_file_format[i],type[i],account_number[i],financial_institute_number[i],bank_transit_numbr[i],contact[i],contact_email[i],contact_role[i],address[i],address_phone[i],city[i],country[i],zip[i],state[i],Type_is[i],Billing_address[i],Shipping_address[i],test, extent);
			}
			

			}
			
		
	
	}
	
