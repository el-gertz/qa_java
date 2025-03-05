package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final String sex = "Самец";

    @Mock
    Feline feline;

    Lion lion;

    @Before
    public void setUp() throws Exception {
        lion = new Lion(sex, feline);
    }

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion(sex, feline);
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void getFood() throws Exception {
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");

    }
}
