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
}