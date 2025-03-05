package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnimalGetFoodExceptionTest {

    @Test
    public void getFood() {
        Animal animal = new Animal();
        Assert.assertThrows("Unexpected exception", Exception.class,
                () -> animal.getFood("Invalid animal"));
    }
}