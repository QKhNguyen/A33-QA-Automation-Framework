import org.testng.annotations.Test;

public class Homework16 extends BaseTest{
   @Test
public void registrationNavigation(){
   WebDriver driver = new ChromDriver();
   driver.manage().timeouts().implcitlyWait(Duration.ofSeconds(10));
   String url = "https://bbb.testpro.io/";
   driver.get(url);

   WebElement registrationLink =driver.findElement(By.cssSelector("[id='hel']"));
   registrationLink.click();
   String registrationUrl ="https://bbb.testpro.io/registration.php";
   Assert.assertEquals(driver.getCurrentUrl(), registrationUrl);
   }
}