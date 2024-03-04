package ru.netology.echo;

import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class TestEcho {

    @Test
    void shouldReturnSentData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Should go and find the answer by yourself")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", org.hamcrest.Matchers.equalTo("Broke the test"));


    }

}
