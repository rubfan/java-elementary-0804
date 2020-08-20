package AnimalInfo;
import AnimalInfo.AnimalInfo;
import java.util.Scanner;
public class Programm12_2 {
    static String nameAnimals;
    public static void main(String[] args) {
        AnimalInfo animalInfo = new AnimalInfo() {
            public void getInfo(String name) {
                if ("Spiders".equals(name)) {
                    Spiders spiders = new Spiders();
                    spiders.getInfo(name);
                } else if ("Bears".equals(name)) {
                    Bears bears = new Bears();
                    bears.getInfo(name);
                }
            }
        };
        Scanner in = new Scanner(System.in);
        nameAnimals=in.next();
        animalInfo.getInfo(nameAnimals);
    }
}