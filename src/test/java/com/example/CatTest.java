package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Spy
    Cat cat = new Cat(feline);

    @Test
    public void getFood() throws Exception {
        Cat cat = new Cat(feline);

        cat.getFood();

        Mockito.verify(feline).eatMeat();
    }

    @Test
    public void getSound() {
        cat.getSound();
        Mockito.verify(cat).getSound();
    }
}