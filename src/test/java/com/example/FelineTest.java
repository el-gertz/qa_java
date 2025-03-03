package com.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline;

    @Test
    public void getFamily() {
        Assert.assertEquals("Unexpected family", "Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittens() {
        feline.getKittens();
        Mockito.verify(feline).getKittens(1);
    }

    @Test
    public void getKittensCount() {
        int count = 5;
        Assert.assertEquals("Unexpected kittens", count, feline.getKittens(count));
    }

    @Test
    public void eatMeat() throws Exception {
        feline.eatMeat();
        Mockito.verify(feline).getFood("Хищник");
    }
}
