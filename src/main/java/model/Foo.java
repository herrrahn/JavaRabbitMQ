package model;

public class Foo {

    public String bar;

    public String getBar() {
        return this.bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    @Override
    public String toString() {
        return "Foo [bar=" + this.bar + "]";
    }

}
