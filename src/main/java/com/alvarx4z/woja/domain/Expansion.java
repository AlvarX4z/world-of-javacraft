package com.alvarx4z.woja.domain;

import com.alvarx4z.woja.domain.shared.Name;

import java.util.UUID;

import static java.util.UUID.randomUUID;

public enum Expansion {

    VANILLA(randomUUID(), Order.of(1), Name.of("Vanilla")),
    BURNING_CRUSADE(randomUUID(), Order.of(2), Name.of("The Burning Crusade")),
    WRATH_LICH_KING(randomUUID(), Order.of(3), Name.of("Wrath of the Lich King")),
    CATACLYSM(randomUUID(), Order.of(4), Name.of("Cataclysm")),
    MISTS_PANDARIA(randomUUID(), Order.of(5), Name.of("Mists of Pandaria")),
    WARLORDS_DRAENOR(randomUUID(), Order.of(6), Name.of("Warlords of Draenor")),
    LEGION(randomUUID(), Order.of(7), Name.of("Legion")),
    BATTLE_FOR_AZEROTH(randomUUID(), Order.of(8), Name.of("Battle for Azeroth")),
    SHADOWLANDS(randomUUID(), Order.of(9), Name.of("Shadowlands")),
    DRAGONFLIGHT(randomUUID(), Order.of(10), Name.of("Dragonflight"));

    private final UUID id;
    private final Order order;
    private final Name title;

    Expansion(UUID id, Order order, Name title) {
        this.id = id;
        this.order = order;
        this.title = title;
    }

    public UUID getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public Name getTitle() {
        return title;
    }
}
