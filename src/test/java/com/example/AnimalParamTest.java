package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParamTest {

    private final String animalKind;
    private final List<String> foodList;

    public AnimalParamTest(String animalKind, List<String> foodList) {
        this.animalKind = animalKind;
        this.foodList = foodList;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] dataGen() {
        return new Object[][]{
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Травоядное", List.of("Трава", "Различные растения")},
        };
    }

    @Test
    public void getFood() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals("Unexpected food list", foodList, animal.getFood(animalKind));
    }

}
