package com.jad;

import java.util.ArrayList;

public class Foo {
    private Bar bar;
    private ArrayList<Baz> bazs;
    private Qux qux;
    private Corge corge;
    private ArrayList<Grault> graults;

    public Bar getBar() {
        return this.bar;
    }

    public ArrayList<Baz> getBazs() {
        return this.bazs;
    }

    public Qux getQux() {
        return this.qux;
    }

    public ArrayList<Grault> getGraults() {
        return this.graults;
    }

    public Corge getCorge() {
        return this.corge;
    }

    public void setCorge(Corge corge) {
        this.corge = corge;
    }


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
