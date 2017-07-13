package com.epam.lab.lab_05_classwork;

import java.util.ArrayList;
import java.util.List;

public class PracticeGenerics {

    static void metodExtendsProduct(List<? extends Product> l) {
        l.forEach(System.out::println);
    }

    static void metodSuperProduct(List<? super Product> l) {
        l.forEach(System.out::println);
    }

    public static void main(String[] arg) {
//        List<? extends Product> list = new ArrayList<>();
//        list.add(null);
//        list.add(new Super()); //не піде тому що не можна визначити нижню межу, убезпечує від CastClassException
//        list.add(new Product("asfd"));
//        list.add(new Camera("dsfad", 25));
//
//        List<? super Product> list2 = new ArrayList<>();
//        list2.add(null);
//        list2.add(new Super());
//        list2.add(new Product("asfd"));
//        list2.add(new Camera("dsfad", 25));

        List<Super> listSuper = new ArrayList<>();
        listSuper.add(new Super());
        listSuper.add(new Product("sdafsd"));
        listSuper.add(new Camera("sdfasdf", 12000));
        //metodExtendsProduct(listSuper);
        metodSuperProduct(listSuper);

        List<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product("sdafsd"));
        listProduct.add(new Camera("sdfasdf", 12000));
        metodExtendsProduct(listProduct);
        metodSuperProduct(listProduct);

        List<Camera> listCamera = new ArrayList<>();
        listCamera.add(new Camera("sdfasdf", 12000));
        metodExtendsProduct(listCamera);
        //metodSuperProduct(listCamera);


    }
}

class Super {}

class Product extends Super {
    String name;

    public Product(String name) {
        this.name = name;
    }
}

class Camera extends Product {
    int pixel;

    public Camera(String name, int pixel) {
        super(name);
        this.pixel = pixel;
    }
}
