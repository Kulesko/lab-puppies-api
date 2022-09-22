package com.kulesko;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class ColorResourceTest {

    @Test
    void smoketest_for_ColorsResource() {
        given()
                .body("{}")
                .contentType(ContentType.JSON)
                .when().post("/v1/colors")
                .then()
                .statusCode(200)
                .body(is("[]"));
    }

    @Test
    void retrieve_self_sample() {
        given()
                .body("{\"reference\": { \"color\":\"#e8f9bf\"},\"deltaE\": 0,\"samples\": 1}")
                .contentType(ContentType.JSON)
                .when().post("/v1/colors")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body(is("[{\"color\":\"#e8f9bf\"}]"));
    }

    @Test
    void retrieve_five_samples() {
        given()
                .body("{\"reference\": { \"color\":\"#e8f9bf\"},\"deltaE\": 10,\"samples\": 5}")
                .contentType(ContentType.JSON)
                .when().post("/v1/colors")
                .then()
                .statusCode(200)
                .contentType(ContentType.JSON)
                .body("size()", is(5));
    }
}