package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Spy
    Lion lion = new Lion(feline);

    @Test
    public void getKittens() {
        Lion lion = new Lion(feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void doesHaveMane() {
        lion.doesHaveMane();
        Mockito.verify(lion).doesHaveMane();
    }

    @Test
    public void getFood() throws Exception {
        Lion lion = new Lion(feline);
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");

    }
}
