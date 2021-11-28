package controller;

import decompose.Decompose1;
import decompose.Decompose2;

public class MainFlow {
    Decompose1 decompose1 = new Decompose1();
    Decompose2 decompose2 = new Decompose2();

    public void run(String s) {
        String s1 = decompose1.mapping1(s);
        String s2 = decompose2.mapping2(s1);
        System.out.println(s2);
    }
}
