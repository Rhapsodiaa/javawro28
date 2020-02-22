package com.sda.game;

import java.nio.file.Watchable;

public class BareFists extends Weapon {
    public BareFists() {
        super("Bare fists!");
    }

    @Override
    int damage() {
        return 10;
    }
}
