package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnimalGetFoodExceptionTest {

    @Spy
    Animal animal = new Animal();

    @Test
    public void getFood() throws Exception {
        String invalidAnimalKind = "Test animal";
        Assert.assertThrows("Unexpected exception", Exception.class,
                () -> animal.getFood(invalidAnimalKind));
        Mockito.verify(animal).getFood(invalidAnimalKind);
    }
}