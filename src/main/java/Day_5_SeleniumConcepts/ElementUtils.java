package Day_5_SeleniumConcepts;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Day_1_SeleniumSessions.AutomationException;

public class ElementUtils {

	
	private WebDriver driver;
	
	public ElementUtils(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getElement1(By locator) {
		return driver.findElement(locator);
	}
	
	public void doSendkeys(By locator, String value) {
		getElement1(locator).sendKeys(value);
		
	}
	public void doSendkeys(String locatorType, String locatorValue, String value) {
		getElement1(getBy(locatorType, locatorValue)).sendKeys(value);
		
}
	
	public  void doElementGetText (By locators) {
		getElement1(locators).getText();
	}
//	private By getBy(String locatorType, String locatorValue) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	public By getBy(String locatorType, String locatorValue) {
		By by= null;
		
		switch(locatorType.toLowerCase().trim()) {
		case "id":
			by = By.id(locatorValue);
			break;
		case "name":
			by= By.name(locatorValue);
			break;
		case "calss":
			by= By.className(locatorValue);
			break;
		case "xpath":
			by= By.xpath(locatorValue);
			break;
		case "linktext":
			by= By.linkText(locatorValue);
			break;
		
		case "tag":
			by= By.tagName(locatorValue);
			break;
		case "css":
			by= By.cssSelector(locatorValue);
			break;
		case "partiallinktext":
			by= By.partialLinkText(locatorValue);
			break;
		default:
			System.out.println("This is the wrong locator type"+ locatorType);
			throw new AutomationException("Worng locator type" );
			
		}
		return by;
	}
	public  void launchBrowser (String BrowserName) {
		System.out.println("The browser name is: " +BrowserName);
	String BrowserName1 = "Chrome";
	switch (BrowserName1.toLowerCase().trim()) {
	
	case "Chrome":
		driver = new ChromeDriver();
		break;
	case "Firefox":
		driver = new FirefoxDriver();
		break;
		
	case "Edge":
		driver = new EdgeDriver();
		break;
	case "Safari":
		driver = new SafariDriver();
		break;
	default:
		System.out.println("This browser is not available!");
		throw new AutomationException("This is an Invalid Browser" + BrowserName1);
		
	}
	return;
	
	}
	public void doClick(By locators) {
		getElement1(locators).click();
	}
	public void doClick(String locatorType, String locatorValue) {
		getElement1(getBy(locatorType, locatorValue)).click();;
		
	}		
	
	public String doElementGetText(String locatorType, String locatorValue) {
		return getElement1(getBy(locatorType, locatorValue)).getText();
		
	}
	

	
	public  void getDropDownOption(By locator, String dropDownValue) {
		Select select=new Select(getElement1(locator));
		List<WebElement> optionsList=select.getOptions();
		System.out.println("The total number options are: "+optionsList.size());
		for (WebElement e: optionsList) {
			String text= e.getText();
			System.out.println(text);
			if (text.equals(dropDownValue)) {
				e.click();
				break;
				
			}
			
		}
	}
	public  List<String> getDropDownOption(By locator) {
		Select select=new Select(getElement1(locator));
	List<WebElement>optionsList=select.getOptions();
	List<String> optionsTextList=new ArrayList<>();
	for(WebElement e : optionsList) {
		String text = e.getText();
		optionsTextList.add(text);
	}
	return optionsTextList;
	}

	public String getPageTitle () {
	String pageTitle=driver.getTitle();
	System.out.println("The page title is: " +pageTitle);
	return pageTitle;
	}
		
	
	public String pageUrl () {
		String url = driver.getCurrentUrl();
		return url;
	}
	
	public  void MultiActionSendKeys(By emailIDLocator ,String value,  By passwordIdLocator, String values) throws InterruptedException {
		Actions act= new Actions(driver);
		act.sendKeys(getElement1(emailIDLocator), value).perform();
		Thread.sleep(2000);
		act.sendKeys(getElement1(passwordIdLocator), values).perform();
		Thread.sleep(2000);
		
	}

	
	public  void ActionClick(By locator) {
		Actions act= new Actions(driver);
		act.click(getElement1(locator)).perform();
	
	}
	//Utility Methods
	//Used for finding the total links of elements

//	int Totallinks = getElementCount(links);	
//	System.out.println(" The total links on the right sides are: " + Totallinks);
//
//	// Used for getting the texts	
//	List <String> AllText=getElementText(links);
//	System.out.println(AllText);
//	
//	
//	//Used for adding the numbers
//	List<String> AllNumbers=getElement1(links);
//	System.out.println(AllNumbers);
//	
//	}
 public  List<WebElement> getElement(By locator) {
	 return driver.findElements(locator);
 }
 // Methods to count the total number of links
// public static int getElementCount(By locator) {
//	 return getElement(locator).size();
// }
 // Methods to bring the texts
 public  List<String> getElementText (By locator) {
	 List<WebElement> TotalLinkText=getElement(locator);
	 
	List<String> linkText=new ArrayList <String>();
	for (WebElement e : TotalLinkText) {
		String text=e.getText();
		System.out.println(text);
	}
	 return linkText;
	 
}
 // Methods to bring the numbers
 
 public  List<String> getElement11(By locator) {
	 List<WebElement> totalLinkText=getElement(locator);
	 List <String> linkText=new ArrayList<String>();
	 
	 for (int i = 0; i<totalLinkText.size(); i++) {
		 String text=(i+1) +" "+totalLinkText.get(i).getText();
		 System.out.println(text);
		 
	 }
	 return linkText;

	}
	public void BigBasketMenueSelection(By parentShopMenueLocator, By BeveragesSecondLocator, By TeaThirdLocator, By GreenTeaLocator) throws InterruptedException {
		Actions act=new Actions(driver);
		getElement1(parentShopMenueLocator).click();
	act.moveToElement(getElement1(BeveragesSecondLocator)).perform();
	Thread.sleep(2000);
	act.moveToElement(getElement1(TeaThirdLocator)).perform();
	Thread.sleep(2000);
	getElement1(GreenTeaLocator).click();
	
	}	
	public  void DrawingBorder(WebElement Pathvalue , String pxSize, String SoliColors) throws InterruptedException {
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)" ,Pathvalue);
		Thread.sleep(2000);
		js.executeScript("arguments[0].style.border='"+pxSize+" solid "+SoliColors+"'", Pathvalue);

	}

	public  void SelectDateCalender(String DayDate) {
		driver.findElement(By.cssSelector("input#datepicker")).click();
		driver.findElement(By.xpath("//a[text()='"+DayDate+"']")).click();
		String printN=driver.findElement(By.cssSelector("input#datepicker")).getAttribute("value");
		
		System.out.println(printN);
		
	}
	public  void selectDate(String dayOfDate) {
		driver.findElement(By.xpath("//a[text()='"+dayOfDate+"']")).click();
		
	}
		public static void selectFuturDate(String futureYAndMonthsDate, int dayDate) {
		if (dayDate>31 || dayDate<=0) {
			System.out.println("Please pass the valid date: "+dayDate);
			return ;
			
		}
		if(futureYAndMonthsDate.contains("February") && dayDate>29){
		System.out.println("Pass the valid date: "+dayDate)	;
		return;
		}
		
		}
		public  void AlertGenerate(String alertMessage) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("alert('"+ alertMessage+"')");
		}
		public void promptGenerate(String promptMessage, String KeySendValue) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("prompt('"+promptMessage+ " ')");
			Alert a=driver.switchTo().alert();
			a.sendKeys(KeySendValue);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			a.accept();
		}
	
		public void DrawingBorder1(WebElement Pathvalue , String pxSize, String SoliColors) throws InterruptedException {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false)" ,Pathvalue);
			Thread.sleep(2000);
			js.executeScript("arguments[0].style.border='"+pxSize+" solid "+SoliColors+"'", Pathvalue);

		}

		public  void googleSearch(By googleSearchFieldLocator, By SuggestionlinkLocator, String SreachPhrase, 
				String SuggestionTextForClick ) {
			driver.findElement(googleSearchFieldLocator).sendKeys(SreachPhrase);
			try {
				Thread.sleep(2000);
			}catch (Exception e) {
			}
				List<WebElement> suggistList=driver.findElements(SuggestionlinkLocator);
				System.out.println(suggistList.size());
			for(WebElement e: suggistList) {
			String text=e.getText();
			System.out.println(text);
			if (text.contains(SuggestionTextForClick)) {
				e.click();
				break;
			}
			}
		}
		
		public  void ClickWebElementwithJS(String string) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("argument[0].click();", string);
			
		}
	
		public  List<WebElement> getElements (By locator) {
			return driver.findElements(locator);
		}

		public int getElementsCount(By locator) {
			return getElements(locator).size();
		}
		public List<String> getElementsText(By locator) {
			List<WebElement> totalListText= getElements(locator);
			List<String> totallist=new ArrayList<String>();
			for (WebElement e : totalListText) {
				String text=e.getText();
				System.out.println(text);
				
			}
			return totallist;
		}
		
		public  WebDriver headlessUtilMtd(String browser) {
			switch(browser.toLowerCase().trim()){
			case "chrome": 
				ChromeOptions co= new ChromeOptions();
				co.addArguments("--headless= new");
				driver= new ChromeDriver(co);
				break;
			case "firefox":
				FirefoxOptions fo= new FirefoxOptions();
				fo.addArguments("--headless");
				driver= new FirefoxDriver(fo);
				break;
			case "edge":
				EdgeOptions eo= new EdgeOptions();
				eo.addArguments("headless=new");
				driver= new EdgeDriver(eo);
				break;
				
			default :
				System.out.println(" The browser not founded!");
			
				
			}
			return driver;
		}
	
		public  String getPagetitleWithJF() {
			JavascriptExecutor js= (JavascriptExecutor)driver;
		
			String pageTitle=js.executeScript("return document.title").toString();
			System.out.println(pageTitle);
			return pageTitle;
			
		}
		public  String getPageURLwithJS() {
			JavascriptExecutor js= (JavascriptExecutor)driver;
			String pageURL=js.executeScript("return document.URL").toString();
			System.out.println(pageURL);
			return pageURL;
		}
	
		public void jqueryDropDownSelection(By locator, By OptionListLocator, String... values) {
//		getElement(locator).click();

			List<WebElement> optionsList = driver.findElements(OptionListLocator);
			for (WebElement allOptions : optionsList) {
				String printOptions = allOptions.getText();
				if(printOptions.length()!= 0) {
				System.out.println(printOptions);
				if (values[0].equals("all")) {
					allOptions.click();
				} else {
			            for (String val : values) {
			                if (printOptions.equals(val)) {
			                	allOptions.click();
			                    break;
					}
					driver.close();
			            }

			            }
				}
	}
	}
		
		public  void nevigateForward() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("history.go(1)");
		}
		public  void nevigateBackward() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("history.go(-1)");
	}
		public  void nevigateRefresh() {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("history.go(0)");
	}
		
		public  boolean isMultiSelectionDropDown(By locator) {
			Select select = new Select(getElement1(locator));
			return select.isMultiple() ? true : false;

		}	
		
		public void selectDropDownMultiValue(By locator, String... values) {
			Select select = new Select(getElement1(locator));
			if (isMultiSelectionDropDown (locator)) {
				if(values [0].equalsIgnoreCase(null))
				for(String e: values) {
					select.selectByVisibleText(e);
				}	
			}
		
		}
		/**
		 * This method is used to select the values from the select multiple drop down. It can select;
		 * 1: Single option
		 * 2: Multiple options
		 * 3: All the the options--pass "all" as the value to select all the drop down options
		 * @author Masiha
		 * @param optionLocator
		 * @param values
		 */
		public  void selectDropDownMultipleValues(By locator, By optionLocator, String...values) {
			Select select = new Select(getElement1(locator));
			if (isMultiSelectionDropDown(locator)) {
				if(values [0].equalsIgnoreCase("all")){
//					List<WebElement> optionList=driver.findElements(By.cssSelector("select[size=\"6\"]>option"));
					List<WebElement> optionList=driver.findElements(optionLocator);
					for (WebElement e: optionList) {
						e.click();
					}
				}else {
					for(String e: values) {
					select.selectByVisibleText(e);
				}
				
			}
		}
		
		
		}
		
		public boolean pageLoadingUtil(int timeOut) {
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeOut));	
			String javaScript=wait.until(ExpectedConditions.jsReturnsValue(" return document.readyState === 'complete'")).toString();
			return Boolean.parseBoolean(javaScript);
			}
		
		public void paginationsUtility (String countryName) {
//			driver.findElement(By.xpath("//td[text()='"+countryName+"']//preceding-sibling::td/child::input[@type='checkbox']")).click();	
			while (true) {
				if(driver.findElements(By.xpath("//td[text()='"+countryName+"']")).size()>0) {
					driver.findElement(By.xpath("//td[text()='"+countryName+"']//preceding-sibling::td/child::input[@type='checkbox']")).click();
					break;
			}else {
				WebElement nextPath=driver.findElement(By.xpath("//button[(@class='dt-paging-button next')]"));
//				System.out.println(nextPath);
				if(nextPath.getAttribute("class").contains("disabled")){
					System.out.println("The pagination is over and the county not founded");
				}
				nextPath.click();
				
			}
			}
			}
			public void multiSelection (String CountryName) {
				List<WebElement> elements= driver.findElements(By.xpath("//td[text()='"+CountryName+"']//preceding-sibling::td/child::input[@type='checkbox']"));
				for(WebElement e: elements) {
					e.click();
				}
		}
		
		
			public void doSelectDropDownByIndex(By locator, int index) {
				Select select=new Select(getElement1(locator));
				select.selectByIndex(index);
			}
			public void doSelectDropDownByValue(By locator, String Value) {
				Select select=new Select(getElement1(locator));
				select.selectByValue(Value);
			}
			public void doSelectDropDownByVisibleText(By locator, String visibleText) {
				Select select=new Select(getElement1(locator));
				select.selectByVisibleText(visibleText);
				
			}
			public void doSelectDropDownByContainsVisibleText(By locator, String partialText) {
				Select select=new Select(getElement1(locator));
				select.selectByContainsVisibleText(partialText);
			}
		
			public int getDropDownCountryCount(By locator) {
				Select select=new Select(getElement1(locator));
				return select.getOptions().size();
			}
		
		
			public  WebElement expicitWait(By locator, int timeout) {
				WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
				 return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
				
			}
			public Alert waitForJsAlerts(int timeOut) {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
				return wait.until(ExpectedConditions.alertIsPresent());
					
				}
				public  void acceptJSAlert(int timeOut) {
					waitForJsAlerts(timeOut).accept();
				}
				public  void dismissJSAlert(int timeOut) {
					waitForJsAlerts(timeOut).dismiss();
				}
				public  void getJSAlertText(int timeOut) {
					waitForJsAlerts(timeOut).getText();
				}
				public  void enterValueJSAlertPrompt(int timeOut, String valueToSend) {
					waitForJsAlerts(timeOut).sendKeys(valueToSend);
			}
				public  String waitForTitleContains(String titlePartial, int timeOut) {
					WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
					try {
					if(wait.until(ExpectedConditions.titleContains(titlePartial))){
						return driver.getTitle();
				}
					}catch(TimeoutException e) {
						System.out.println("The page loading takes time and the title is not loaded");
					}
					return titlePartial;
				}
				public  String waitForTitleCompletValue(String titleCompletValue, int timeOut) {
					WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
					try {
					if(wait.until(ExpectedConditions.titleIs(titleCompletValue))){
						return driver.getTitle();
				}
					}catch(TimeoutException e) {
						System.out.println("The page loading takes time and the title is not loaded");
					}
					return titleCompletValue;
				}
				public String waitForURLValue(String URLValue, int timeOut) {
					WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
					try {
					if(wait.until(ExpectedConditions.urlContains(URLValue))){
						return driver.getTitle();
				}
					}catch(TimeoutException e) {
						System.out.println("The page loading takes time and the title is not loaded");
					}
					return URLValue;
					
			}
				public String waitForURLCompletValue(String URLCompletValue, int timeOut) {
					WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeOut));
					try {
					if(wait.until(ExpectedConditions.urlToBe(URLCompletValue))){
						return driver.getTitle();
				}
					}catch(TimeoutException e) {
						System.out.println("The page loading takes time and the title is not loaded");
					}
					return URLCompletValue;
				}
				public List<WebElement> waitForVisibilityOfElements(By locator, int timeOut) {
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
					return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
				}
				public void zoomINwihtUtil(String zoomPercentage) {
					JavascriptExecutor js=(JavascriptExecutor)driver;
					js.executeScript("document.body.style.zoom='"+zoomPercentage+"'");
				    String currentZoom = (String) js.executeScript("return document.body.style.zoom;");
				    System.out.println("the curren zoom is: "+ currentZoom);
				    if(currentZoom.equals(currentZoom)) {
				    	System.out.println("The test case is passed");
				    }else {
				    	System.out.println("The test case is failed");
				    }
				
				}
		
		
		
		
		
		
		
}