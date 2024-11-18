package hu.szamalk.idomok;

public class Gomb extends FaIdom{
    private double sugar;

    public Gomb(double sugar) {
        this.sugar = sugar;
    }

    public double terfogat(){
        double V=(4*(sugar*sugar*sugar)*Math.PI)/3;
        return V;
    }

    @Override
    public String toString() {
        return "Gomb{" +
                "sugar=" + sugar +
                '}';
    }
}
