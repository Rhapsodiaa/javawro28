package com.sda.interfacedemo;

public interface CafeMachine {
    Cafe[] showMenu();

    void chooseCafe(Cafe cafe);

    Cafe makeCafe(double money, Cafe cafe);
}
