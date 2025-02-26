package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AnimalGetFamilyTest {

    @Spy
    Animal animal = new Animal();

    @Test
    public void getFamily() {
        Assert.assertEquals(
                "Unexpected family",
                "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи",
                animal.getFamily());
        Mockito.verify(animal).getFamily();
    }
}