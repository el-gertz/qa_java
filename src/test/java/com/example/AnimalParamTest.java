package com.example;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.quality.Strictness;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParamTest {

    private final String animalKind;
    private final List<String> foodList;


    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule().strictness(Strictness.STRICT_STUBS);

    @Spy
    Animal animal = new Animal();

    public AnimalParamTest(String animalKind, List<String> foodList) {
        this.animalKind = animalKind;
        this.foodList = foodList;
    }

    @Parameterized.Parameters
    public static Object[][] dataGen() {
        return new Object[][]{
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")},
        };
    }

    @Test
    public void getFood() throws Exception {
        Assert.assertEquals("Unexpected food list", foodList, animal.getFood(animalKind));
        Mockito.verify(animal).getFood(animalKind);
    }

}
