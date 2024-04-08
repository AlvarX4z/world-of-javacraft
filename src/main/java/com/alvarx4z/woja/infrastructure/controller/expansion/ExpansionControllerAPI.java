package com.alvarx4z.woja.infrastructure.controller.expansion;

import com.alvarx4z.woja.infrastructure.controller.BaseControllerAPI;
import com.alvarx4z.woja.infrastructure.controller.expansion.dto.response.ExpansionsResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@Tag(name = "Expansions", description = "Expansions API")
public interface ExpansionControllerAPI extends BaseControllerAPI {

    @Operation(
        summary = "Returns Expansions",
        description = "Returns all available Expansions with their relevant information"
    )
    @ApiResponses(
        {
            @ApiResponse(
                responseCode = "200",
                content = @Content(
                    schema = @Schema(implementation = ExpansionsResponseDTO.class),
                    mediaType = MediaType.APPLICATION_JSON_VALUE
                ),
                description = "Success"
            ),
            @ApiResponse(responseCode = "500")
        }
    )
    ResponseEntity<ExpansionsResponseDTO> getAllExpansions();
}
