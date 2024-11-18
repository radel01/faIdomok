package hu.szamalk;

import hu.szamalk.idomok.FaIdom;
import hu.szamalk.idomok.Gomb;
import hu.szamalk.idomok.Hasab;

import java.util.ArrayList;
import java.util.List;

public class FaIdomok {
    private List<FaIdom> idomok;

    public FaIdomok() {
        idomok = new ArrayList<>();
        idomok.add(new Gomb(4));
        idomok.add(new Gomb(5));
        idomok.add(new Gomb(10));
        idomok.add(new Hasab(2, 4, 7));
        idomok.add(new Hasab(3, 4, 5));
        idomok.add(new Hasab(1, 1, 2));

    }

    public double osszSuly(){
        double ossz=0.0;
        for (FaIdom idom:idomok){
            ossz+=idom.suly();
        }
        return  ossz;
    }

    public double osszGombSuly(){
        double ossz=0.0;
        for (FaIdom idom:idomok){
            if (idom instanceof Gomb) {
                ossz += ((Gomb)idom).suly();
            }
        }
        return  ossz;
    }
    public FaIdom minV(){
        FaIdom min=idomok.get(0);
        for (int i = 1; i < idomok.size(); i++) {
            if(min.terfogat()>idomok.get(i).terfogat()){
                min = idomok.get(i);
            }
        }
        return min;
    }
    public FaIdom maxV(){
        FaIdom max=idomok.get(0);
        for (int i = 1; i < idomok.size()-1; i++) {
            if(max.terfogat()<idomok.get(i).terfogat()){
                max = idomok.get(i);
            }
        }
        return max;
    }
    public void run(){
        System.out.println("A programban használt idomok: ");
        for (FaIdom idom:idomok){
            System.out.println(idom);
        }
        System.out.println("Össz Súly = "+this.osszSuly());
        System.out.println("Összs Gömb Súly = "+this.osszGombSuly());
        System.out.println("Min térfogat = "+this.minV().terfogat()+" "+this.minV());
        System.out.println("Max térfogat= "+this.maxV().terfogat()+" "+this.maxV());
    }
}
