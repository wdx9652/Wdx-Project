package com.wdx.cart.controller;

public class Cart {

    String name;
    String age;


    public Cart(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Cart cart = new Cart("A货","123");
        System.out.println(cart);

    }
}
