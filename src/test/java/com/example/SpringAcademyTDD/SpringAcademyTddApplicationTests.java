package com.example.SpringAcademyTDD;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringAcademyTddApplicationTests {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	void shouldReturnACashCardWhenDataIsSaved(){

		ResponseEntity<String> responseEntity = testRestTemplate.getForEntity("/cashcard/99",String.class);
		assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.OK);

		DocumentContext documentContext = JsonPath.parse(responseEntity.getStatusCode());
		Number id = documentContext.read("$.id");
		assertThat(id).isNotNull();
	}



}
