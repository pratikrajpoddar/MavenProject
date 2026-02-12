package org.example.ex_04_RestAssured_HTTP_Method;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.codehaus.groovy.tools.StringHelper;
import org.testng.annotations.Test;

public class APITesting009_GET_NONBDD_STYLE {

    RequestSpecification r;
    Response response;
    ValidatableResponse vr;
    String pincode;


    @Test
    public void test_GET_NON_BDD_STYLE(){


        pincode = "803213";
        // Divide your program in three parts
        // Given - Part 1
        r = RestAssured.given();
        r.baseUri("https://api.zippopotam.us");
        r.basePath("/IN" + pincode);

        //when part 2
        response = r.when().log().all().get();
        System.out.println(response.asString());

        //Then part 3
        vr = response.then().log().all();
        vr.statusCode(200);

    }
}
