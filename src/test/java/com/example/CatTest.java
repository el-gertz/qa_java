package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    Cat cat;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }

    @Test
    public void getFood() throws Exception {
        cat.getFood();

        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void getSound() {
        Assert.assertEquals("Мяу", cat.getSound());
    }
}