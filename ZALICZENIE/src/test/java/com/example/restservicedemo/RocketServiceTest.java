package com.example.restservicedemo;

import static com.jayway.restassured.RestAssured.delete;
import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import javax.ws.rs.core.MediaType;

import org.junit.BeforeClass;
import org.junit.Test;

import com.example.restservicedemo.domain.Rocket;
import com.example.restservicedemo.service.RocketManager;
import com.jayway.restassured.RestAssured;

public class RocketServiceTest {

	private RocketManager rm = new RocketManager();
	public static final String ROCKET_MARK = "Head";
	public static final String ROCKET_MARK2 = "Willson";
	public static final String ROCKET_MODEL = "Graphen Pro";
	public static final String ROCKET_MODEL2 = "GTX90";

	@BeforeClass
	public static void setUp() {
		RestAssured.baseURI = "http://localhost";
		RestAssured.port = 8080;
		RestAssured.basePath = "/restservicedemo/api";
	}

	@Test
	public void addRockets() {
		delete("/rocket/").then().assertThat().statusCode(200);

		Rocket rocket = new Rocket(1L, ROCKET_MARK, ROCKET_MODEL, 500);

		given().contentType(MediaType.APPLICATION_JSON).body(rocket).when().post("/rocket/").then().assertThat()
				.statusCode(201);

		Rocket rRocket = get("/rocket/1").as(Rocket.class);

		assertThat(ROCKET_MARK, equalToIgnoringCase(rRocket.getMark()));
		assertThat(ROCKET_MODEL, equalToIgnoringCase(rRocket.getModel()));

	}

	@Test
	public void getAllRockets() {
		String rockets = get("/rocket/all/").asString();
		delete("/rocket/").then().assertThat().statusCode(200);
		Rocket rocket = new Rocket(1, ROCKET_MARK, ROCKET_MODEL, 500);

		given().contentType(MediaType.APPLICATION_JSON).body(rocket).when().post("/rocket/").then().assertThat()
				.statusCode(201);

		Rocket rRocket = get("/rocket/1").as(Rocket.class);

		

		Rocket rocket2 = new Rocket(2, ROCKET_MARK2, ROCKET_MODEL2, 400);

		given().contentType(MediaType.APPLICATION_JSON).body(rocket2).when().post("/rocket/").then().assertThat()
				.statusCode(201);

		Rocket rRocket2 = get("/rocket/2").as(Rocket.class);

		assertThat(ROCKET_MODEL, equalToIgnoringCase(rRocket.getModel()));
		assertThat(ROCKET_MODEL2, equalToIgnoringCase(rRocket2.getModel()));
	}
	
	@Test
	public void deleteAll() {
		
		rm.clearRockets();
		String rockets = get("/rocket/all/").asString();
		delete("/rocket/").then().assertThat().statusCode(200);
		Rocket rocket = new Rocket(1, ROCKET_MARK, ROCKET_MODEL, 500);

		given().contentType(MediaType.APPLICATION_JSON).body(rocket).when().post("/rocket/").then().assertThat()
				.statusCode(201);

		Rocket rRocket = get("/rocket/1").as(Rocket.class);
		
		rm.clearRockets();
		
		assertNull(rockets,null);
	}

}
