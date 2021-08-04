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
}