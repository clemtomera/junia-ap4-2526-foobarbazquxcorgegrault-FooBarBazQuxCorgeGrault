package com.jad;

import java.util.ArrayList;

public class Foo {
    private Bar bar;
    private ArrayList<Baz> bazs;
    private Qux qux;
    private Corge corge;
    private ArrayList<Grault> graults;

    public void setBar(Bar bar) {
        this.bar = bar;
    }

    public void setBazs(ArrayList<Baz> bazs) {
        this.bazs = bazs;
    }

    public void setQux(Qux qux) {
        this.qux = qux;
    }

    public void setGraults(ArrayList<Grault> graults) {
        this.graults = graults;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }

    public Foo(Bar bar) {
        this.setBar(bar);
        this.setQux(new Qux());
    }

    public void addBaz(Baz baz){
        this.bazs.add(baz);
    }

    public void addGrault() {
        this.graults.add(new Grault(this));
    }
}
