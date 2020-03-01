package com.sda.generics;

public class Pair<K, M> {

    K first;
    M second;

    public Pair(K first, M second) {
        this.first = first;
        this.second = second;
    }

    K getFirst(){
        return first;
    }

    M getSecond(){
        return second;
    }
}
