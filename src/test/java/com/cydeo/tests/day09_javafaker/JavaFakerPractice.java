package com.cydeo.tests.day09_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void testName() {

        Faker faker = new Faker();
        for (int i = 0; i < 10; i++) {
            System.out.println(faker.animal().name());
        }


        System.out.println(faker.name().fullName());

        //Texas number (682) 241-6028

        System.out.println(faker.numerify("682-###-####"));

        System.out.println(faker.letterify("???-????-??"));


        //35 rab 382
        System.out.println(faker.bothify("##-???-#9#"));


    }
}
