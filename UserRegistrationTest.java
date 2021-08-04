package org.example;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistrationException name = new UserRegistrationException();

    @Test
    public void ValidfirstName() {
        String firstName = "Kanchan";
        boolean result = name.ValidfirstName(firstName);
        Assert.assertTrue(result);
    }
    @Test
    public void ValidLastName(){
        String lastName = "Solanke";
        boolean result = name.ValidLastName(lastName);
        Assert.assertTrue(result);
    }

    @Test
    public void ValidEmail(){
        String email = "abc.xyz@bl.co.in";
        boolean result = name.ValidEmail(email);
        Assert.assertTrue(result);
    }
    @Test
    public void ValidMobileNumber(){
        String num = "91 1234567890";
        boolean result = name.ValidMobileNumber(num);
        Assert.assertTrue(result);
    }
    @Test
    public void ValidPassword(){
        String password = "kanchan1";
        boolean result = name.ValidPassword(password);
        Assert.assertTrue(result);
    }

    @Test
    public void ValidPasswordAtLeastOneUpperCase(){
        String password = "Kanchan1";
        boolean result = name.ValidPasswordAtLeastOneUpperCase(password);
        Assert.assertTrue(result);
    }
}