package wcs.dojo4;

public class Main {

    public static int signeMult(int m1,int m2){
        int c;

        if(Math.abs(m2) > Math.abs(m1)){
//            c = m2;
//            m2 = m1;
//            m1 = c;
            m1=m1^m2;
            m2=m2^m1;
            m1=m1^m2;
        }

        if (m2 < 0) {
            return(-mult(m1,-m2));
        } else {
            return(mult(m1,m2));
        }

    }

    public static int mult (int m1,int m2){

        int ret;

        if(m1 == 0 || m2 == 0){
            return(0);
        } else {
            return(m1 + mult(m1, (m2-1)));
        }

    }

    public static void main(String[] args) {

        Integer result = signeMult(-3,-7);
        System.out.println(result);
    }


}
