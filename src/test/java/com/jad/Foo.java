package com.jad;

import java.util.ArrayList;

public class Foo {
    private final Bar bar;
    private ArrayList<Baz> bazs;
    private final Qux qux;
    private Corge corge;
    private ArrayList<Grault> graults;

    public Foo(Bar bar) {
        this.bar = bar;
        this.qux = new Qux();
    }

    public void addBaz(Baz baz){
        this.bazs.add(baz);
    }

    public void addGrault() {
        this.graults.add(new Grault(this));
    }
}
