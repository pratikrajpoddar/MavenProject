package org.example.ex_01_RA_HelloWorld;

import io.restassured.RestAssured;
//Second Test
public class HelloWorld {
    public static void main(String[] args) {
        RestAssured.given() .baseUri("https://www.google.com/").log().all()
                        .when().get()
                        .then().statusCode(200).log().all();


    }
}
