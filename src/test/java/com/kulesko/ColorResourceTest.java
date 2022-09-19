package com.kulesko;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class ColorResourceTest {

    @Test
    void getColor() {
        given()
                .body("{}")
                .contentType(ContentType.JSON)
                .when().post("/v1/colors")
                .then()
                .statusCode(200);
    }
}