package BaiTap.LopPTBac2;

public class Loop {
    double a ,b, c;

    public Loop(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Loop() {}


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }


    public double getDiscriminant(){
        return b*b - 4*a*c;
    }



    public double  getRoot1() {
        return (-b + Math.sqrt(getDiscriminant()))/2*a;
    }
    public double  getRoot2() {
        return (-b - Math.sqrt(getDiscriminant()))/2*a;
    }


    //toString
    @Override
    public String toString() {
        return "Loop{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
