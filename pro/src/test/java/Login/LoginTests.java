package Login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.Facebook;
import pages.LoginPage;

public class LoginTests extends BaseTests {


    @Test
    public void SignUp(){

        LoginPage loginpage = homePage.Create_new_account();
        loginpage.setFirst_name("Yasmine");
        loginpage.setSurname("Hany");
        loginpage.setMobile_number_or_email_address("yasminehany2031@gmail.com");
        loginpage.setPassword("Instabug_10");
        loginpage.set_day("19");
        loginpage.set_month("Oct");
        loginpage.set_year("1993");
        loginpage.set_gender();
        Facebook facebook = loginpage.SignUp();

    }
}
