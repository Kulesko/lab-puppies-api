package com.kulesko;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

class ColorsResourceTest {

    @Test
    void getColor() {
        given()
                .pathParam("hex", "#000000")
                .when().get("/colors/{hex}")
                .then()
                .statusCode(200)
                .body(is("yellow"));
    }
}