
public class Programm11_4 {
    static int[] array;
    static int[] basis;
    static int[] sort;
    static int[] lenghtInputarray = new int[]{4, 5, 7, 9, 10};
    static int[] counterCicle = new int[lenghtInputarray.length];

    public static void main(String[] args) {
        for (int i = 0; i != lenghtInputarray.length; i++) {
            creatArray(i);
            foundMinElement(lenghtInputarray[i], i);
        }
        System.out.printf("Размер:%s    %s    %s     %s     %s  \n",
                lenghtInputarray[0],lenghtInputarray[1], lenghtInputarray[2],
                lenghtInputarray[3],lenghtInputarray[4]);
        System.out.print("o(n): ");
        OutPutData(counterCicle, 4);
    }

    public static void OutPutData(int[] array, int index) {
        String OutData = "[";
        for (int i = 0; i != array.length; i++) {
            OutData = OutData + array[i] + ", ";
        }
        OutData = OutData.substring(0, OutData.length() - 2);
        OutData = OutData + "]";
        System.out.println(OutData);
    }

    public static void creatArray(int index) {
        switch (index) {
            case 0: {
                basis = new int[]{24, 5, 16, 3};
            }
            break;
            case 1: {
                array = new int[]{24, 5, 16, 3, 1};
            }
            break;
            case 2: {
                array = new int[]{24, 5, 16, 3, 25, 10, 1};
            }
            break;
            case 3: {
                array = new int[]{24, 5, 16, 3, 25, 10, 11, 8, 2};
            }
            break;
            case 4: {
                array = new int[]{24, 5, 16, 3, 16, 37, 15, 38, 44, 2};
            }
            break;
        }
    }

    public static void foundMinElement(int size_array, int index) {
        int iCicle = 0;
        int jCicle = 0;
        int arr;
        if (index == 0) sort = basis;
        if (index > 0) sort = array;
        iCicle=6;
        iCicle=iCicle+2;
        for (int i = 0; i != size_array; i++) {
            iCicle++;
            jCicle=jCicle+2;
            for (int j = size_array - 1; j > i; j--) {
                jCicle++;
                if (sort[j - 1] > sort[j]) {
                    arr = sort[j - 1];
                    sort[j - 1] = sort[j];
                    sort[j] = arr;
                    jCicle=jCicle+3;
                }
            }
        }
        counterCicle[index] = iCicle * jCicle;
    }
}
