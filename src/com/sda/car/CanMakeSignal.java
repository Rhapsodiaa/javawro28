package com.sda.car;

public interface CanMakeSignal {
    void makeSignal();

    default void defaultBehaviour(){
        privateMethod();
        System.out.println("Metoda domyślna");
    }

    private void privateMethod(){
        System.out.println("Metoda prywatna");
    }

    private static void privateStaticMethod(){
        System.out.println("Prywatna statyczna metoda");
    }

}
