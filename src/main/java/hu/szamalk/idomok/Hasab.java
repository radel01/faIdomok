package hu.szamalk.idomok;

public class Hasab extends FaIdom{
    private double a, b, m;

    public Hasab(double a, double b, double m) {
        this.a = a;
        this.b = b;
        this.m = m;
    }
    public double terfogat(){
        double V=a*b*m;
        return V;
    }

    @Override
    public String toString() {
        return  "Hasab{" +
                "a=" + a +
                ", b=" + b +
                ", m=" + m +
                '}';
    }
}

