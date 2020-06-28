public class Programm11_2 {
    public static void main(String[] args) {
        int k = 0;
        int n = 10;
        int iCicle=0;
        int jCicle=0;
        int zCicle=0;
        int Cicle=0;
        iCicle=2;
        iCicle=iCicle+2;
        for (int i = 0; i < n; i++) {
            iCicle++;
            jCicle=jCicle+2;
            for (int j = i + 1; j < n; j++) {
                 jCicle++;
                 zCicle=zCicle+2;
                for (int z = j + 1; z < n; z++) {
                    k++;
                    zCicle++;
                }
            }
            Cicle=iCicle*jCicle*zCicle;
        }
        System.out.println("The result is " + k);
        System.out.println("o(x^3)="+Cicle );
    }
}

