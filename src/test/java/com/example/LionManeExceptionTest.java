package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionManeExceptionTest {
    @Mock
    Feline feline;

    @Test
    public void createLion() {
        Assert.assertThrows("Unexpected exception", Exception.class,
                () -> new Lion("Invalid sex", feline));
    }
}