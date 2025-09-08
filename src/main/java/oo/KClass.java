package oo;

public class KClass {

    private int number;

    public int getNumber() {
        return number;
    }

    public KClass(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj) {
        KClass kClass = (KClass) obj;
        return number == kClass.getNumber();
    }

    @Override
    public int hashCode() {
        return number;
    }
}
