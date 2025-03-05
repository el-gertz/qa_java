package com.example;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionParamTest {

    @Mock
    private Feline feline;

    private final String sex;
    private final boolean hasMane;

    public LionParamTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] dataSex() {
        return new Object[][]{
                {"Самка", false},
                {"Самец", true},
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals("Unexpected sex", hasMane, lion.doesHaveMane());
    }
}
