package org.example.ex_05_TestNGAdvanceExample;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APITesting018_TestNG_Parameter {

    @Parameters("browser")
    @Test
    public void demo1(String value){
        System.out.println("Hii Pratik ");
        System.out.println("Hii , Good Morning ");

        if (value.equalsIgnoreCase("firefox")){
            System.out.println("Start firefox");
        }

        if (value.equalsIgnoreCase("chrome")) {
            System.out.println("Start chrome");
        }

    }
}
