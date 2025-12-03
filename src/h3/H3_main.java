package h3;

import java.util.*;
import java.util.random.RandomGenerator;
import java.util.stream.Collectors;

public class H3_main {

    public static void main(String[] args) {

        Mensch m1 = new Mensch();
        m1.setName("Alice");
        m1.setGebJahr(1990);
        m1.setAlter();
        Mensch m2 = new Mensch();
        m2.setName("Bob");
        m2.setGebJahr(2025);
        m2.setAlter();


        System.out.println(m1.getAlter());
        System.out.println(m2.getAlter());
    }
}
