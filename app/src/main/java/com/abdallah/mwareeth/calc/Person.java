package com.abdallah.mwareeth.calc;

public class Person {

    private final String nesbtNaseeb, name, nesbtNaseeb1, qimtNaseeb, qimtNaseeb1;
    private final int alashm, alashm1;

    public Person(String name, String nesbtNaseeb, String qimtNaseeb, int alashm, String nesbtNaseeb1, String qimtNaseeb1, int alashm1) {
        this.name = name;
        this.nesbtNaseeb = nesbtNaseeb;
        this.qimtNaseeb = qimtNaseeb;
        this.qimtNaseeb1 = qimtNaseeb1;
        this.nesbtNaseeb1 = nesbtNaseeb1;
        this.alashm = alashm;
        this.alashm1 = alashm1;
    }

    public Person(String name, String nesbtNaseeb, String qimtNaseeb, int alashm) {

        this(name, nesbtNaseeb, qimtNaseeb, alashm, "0", "0", 0);

    }

    public String getName() {
        return name;
    }

    public String getNesbtNaseeb() {
        return nesbtNaseeb;
    }

    public String getNesbtNaseeb1() {
        return nesbtNaseeb1;
    }

    public String getQimtNaseeb() {
        return qimtNaseeb;
    }

    public String getQimtNaseeb1() {
        return qimtNaseeb1;
    }

    public int getAlashm() {
        return alashm;
    }

    public int getAlashm1() {
        return alashm1;
    }
}

