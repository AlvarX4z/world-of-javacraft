package com.alvarx4z.woja.application.usecase;

import com.alvarx4z.woja.domain.Expansion;

public final class GetAllExpansionsUseCase {

    public GetAllExpansionsUseCase() {
    }

    public Expansion[] execute() {
        return Expansion.values();
    }
}
