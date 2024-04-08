package com.alvarx4z.woja.infrastructure.controller;

import com.alvarx4z.woja.TestUtil;
import com.alvarx4z.woja.application.usecase.GetAllExpansionsUseCase;
import com.alvarx4z.woja.domain.Expansion;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
final class ExpansionControllerIT {

    @Mock
    private GetAllExpansionsUseCase getAllExpansionsUseCase;

    @Test
    @DisplayName("Should get all Expansions")
    void givenExpansionRequest_whenRetrieving_thenReturnsAllExpansions() throws Exception {
        String jsonFixture = TestUtil.getJSONFixture("src/integrationTest/resources/fixtures/response/all_expansions.json");
        Mockito.when(getAllExpansionsUseCase.execute()).thenReturn(Expansion.values());

        String response = TestUtil.prettifyJson(
            RestAssuredMockMvc
                .given()
                .standaloneSetup(new ExpansionController(getAllExpansionsUseCase))
                .body(jsonFixture)
                .when()
                .get("/expansions")
                .then()
                .assertThat(status().isOk())
                .extract().body().asString()
        );

        assertThat(jsonFixture).isEqualTo(response);
    }
}