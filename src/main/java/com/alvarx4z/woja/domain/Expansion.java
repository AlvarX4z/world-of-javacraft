package com.alvarx4z.woja.domain;

import com.alvarx4z.woja.domain.shared.Name;

import java.time.Year;
import java.util.UUID;

import static java.util.UUID.randomUUID;

public enum Expansion {

    VANILLA(
        randomUUID(),
        Order.of(1),
        Name.of("Vanilla"),
        Year.of(2004)
    ),
    BURNING_CRUSADE(
        randomUUID(),
        Order.of(2),
        Name.of("The Burning Crusade"),
        Year.of(2007)
    ),
    WRATH_LICH_KING(
        randomUUID(),
        Order.of(3),
        Name.of("Wrath of the Lich King"), Year
        .of(2008)
    ),
    CATACLYSM(
        randomUUID(),
        Order.of(4),
        Name.of("Cataclysm"),
        Year.of(2010)
    ),
    MISTS_PANDARIA(
        randomUUID(),
        Order.of(5),
        Name.of("Mists of Pandaria"),
        Year.of(2012)
    ),
    WARLORDS_DRAENOR(
        randomUUID(),
        Order.of(6),
        Name.of("Warlords of Draenor"),
        Year.of(2014)
    ),
    LEGION(
        randomUUID(),
        Order.of(7),
        Name.of("Legion"),
        Year.of(2016)
    ),
    BATTLE_FOR_AZEROTH(
        randomUUID(),
        Order.of(8),
        Name.of("Battle for Azeroth"),
        Year.of(2018)
    ),
    SHADOWLANDS(
        randomUUID(),
        Order.of(9),
        Name.of("Shadowlands"),
        Year.of(2020)
    ),
    DRAGONFLIGHT(
        randomUUID(),
        Order.of(10),
        Name.of("Dragonflight"),
        Year.of(2022)
    );

    private final UUID id;
    private final Order order;
    private final Name title;
    private final Year year;

    Expansion(UUID id, Order order, Name title, Year year) {
        this.id = id;
        this.order = order;
        this.title = title;
        this.year = year;
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

    public Year getYear() {
        return year;
    }
}
