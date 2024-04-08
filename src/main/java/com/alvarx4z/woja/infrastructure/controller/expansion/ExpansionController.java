package com.alvarx4z.woja.infrastructure.controller.expansion;

import com.alvarx4z.woja.application.usecase.GetAllExpansionsUseCase;
import com.alvarx4z.woja.domain.Expansion;
import com.alvarx4z.woja.infrastructure.controller.expansion.dto.mapper.ExpansionDTOMapper;
import com.alvarx4z.woja.infrastructure.controller.expansion.dto.response.ExpansionsResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/expansions")
public final class ExpansionController {

    private final GetAllExpansionsUseCase getAllExpansionsUseCase;

    public ExpansionController(GetAllExpansionsUseCase getAllExpansionsUseCase) {
        this.getAllExpansionsUseCase = getAllExpansionsUseCase;
    }

    @GetMapping
    public ResponseEntity<ExpansionsResponseDTO> getAllExpansions() {
        Expansion[] expansions = getAllExpansionsUseCase.execute();
        ExpansionsResponseDTO response = ExpansionDTOMapper.toResponse(expansions);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
