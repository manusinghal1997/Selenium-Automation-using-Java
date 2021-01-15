
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumWork {


    public static void main(String[] args) throws Exception{

        //setting chrome driver so we can automate chrome
        System.setProperty("webdriver.chrome.driver", "\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        
        String baseUrl = "https://interview1.msnagile.com/";
        String tagName = "";
        
        // open website
        driver.get(baseUrl);
        Thread.sleep(Long.parseLong("20000"));
        
        // find email and password field and enter details
        driver.findElement(By.id("email")).sendKeys("qa.sudhanshu@gmail.com");
        driver.findElement(By.id("password")).sendKeys("123456");
        
        // click on login button
        WebElement button = driver.findElement(By.id("loginBtbn"));
        button.click();
        Thread.sleep(Long.parseLong("10000"));
        
        // click on create user and groups
        WebElement mug = driver.findElement(By.xpath("/html/body/app-root/div/div/div/div/app-content-wrapper/div/div/app-sidebar/div/div/div/ul/div[3]/div/li/a/span"));
        mug.click();
        Thread.sleep(Long.parseLong("5000"));
      //*[@id="managUserBtn"]/span/div/div[2]
    //    WebElement createuser = driver.findElement(By.xpath("[@id=\"managUserBtn\"]/span/div/div[2]"));
        System.out.println("click on create");
        // click on create
        WebElement createuser = driver.findElement(By.id("managUserBtn"));
        createuser.click();
        Thread.sleep(Long.parseLong("10000"));
      System.out.println("click on invite user");
            
        // click on Invite 
        WebElement invite = driver.findElement(By.id("inviteUserButton"));
        invite.click();
        Thread.sleep(Long.parseLong("10000"));
        
        // Enter email and hit enter
        driver.findElement(By.id("emailfield")).sendKeys("aditigarg@gmail.com");
        WebElement temp5 = driver.findElement(By.id("inviteuser"));
        temp5.click();
        WebElement inviteuser = driver.findElement(By.id("sendbtn"));
        
        inviteuser.click();
        Thread.sleep(Long.parseLong("10000"));
       
        // click on cross
        WebElement temp4 = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-invite-user-dialog/h2/div/div[2]/mat-icon/i"));
        Thread.sleep(Long.parseLong("5000"));
        temp4.click();
        // click on create again
        createuser.click();
        
        // click on create group
        System.out.println("click on invite user");
        
        WebElement createGroupBtn = driver.findElement(By.id("createGroupBtn"));
        createGroupBtn.click();
      //*[@id="groupname"]
        
        Thread.sleep(Long.parseLong("10000"));
        // Enter group Name
        driver.findElement(By.id("groupname")).sendKeys("My Group 2");
      //*[@id="mat-dialog-2"]/app-create-user-group/form/mat-dialog-content/mat-form-field[2]/div/div[1]/div[3]
        
        
        // click on user List and select two users to add to group
        WebElement userlist = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-create-user-group/form/mat-dialog-content/mat-form-field[2]/div/div[1]/div[3]/mat-select/div/div[1]/span"));
        userlist.click();
        
        WebElement addusertogroup = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[2]/span"));
        addusertogroup.click();
        WebElement addusertogroup1 = driver.findElement(By.xpath("/html/body/div[3]/div[4]/div/div/div/mat-option[3]/span"));
        addusertogroup1.click();
      
    //    driver.findElement(By.id("groupname")).click();
        // click on save button
        driver.findElement(By.xpath("/html/body/div[3]/div[3]")).click();
        WebElement groupsubmit = driver.findElement(By.id("savebtn"));
        groupsubmit.click();
        
        
        
        		
        
      //*[@id="savebtn"]/span
        
      //*[@id="dialogtitle"]
        
      //*[@id="mat-option-6"]/span
        
      //*[@id="mat-option-5"]/span
      //*[@id="mat-dialog-1"]/app-create-user-group/form/mat-dialog-content/mat-form-field[2]/div/div[1]/div[3]
        
        
      //*[@id="groupname"]
      //*[@id="createGroupBtn"]
      //*[@id="sendbtn"]/span
      //*[@id="emailfield"]
        
      //*[@id="inviteUserButton"]
        
        
        //*[@id="email"]
        
      //*[@id="loginBtbn"]/span
      //*[@id="password"]
    //    System.out.println(tagName);
      // 	System.out.println("matched");
        //for closing chrome
       // driver.close();


    }



}
