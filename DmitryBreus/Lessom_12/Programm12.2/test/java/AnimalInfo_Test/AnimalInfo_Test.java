package AnimalInfo_Test;

import AnimalInfo.AnimalInfo;
import org.junit.*;
import org.junit.Test;

public class AnimalInfo_Test {

    public String Name;
    public String kingdom;
    public String typeOfAnimal;
    public String classOfAnimal;
    public String unitOfAnimal;
    public String famelyOfAnimal;
    public String genusOfAnimal;
    public String[] classesOfAnimals = new String[]{
            "Arachids", "Mammal", "Birds", "Fishies"
    };
    private String[] hierarchy = new String[]{
            "Unit: Predators", "Famely: Bears", "Genus: Bears", "Brown Bear"
    };

    //public  void getInfo(String name);

    @Before
    private String getKingdom() {
        this.kingdom = "Kingdom: Animal";
        return kingdom;
    }

    @Before
    public String getType() {
        this.typeOfAnimal = "Type: Chordate";
        return typeOfAnimal;
    }

    @Test
    public void getInfo(String name) {
        System.out.println(getKingdom_info());
        System.out.println(getType_info());
        System.out.println(getclass_info(0));
    }

    private String getKingdom_info() {
        kingdom = this.getKingdom();
        return kingdom;
    }

    private String getType_info() {
        typeOfAnimal = this.getType();
        return typeOfAnimal;
    }

    private String getclass_info(int num) {
        classOfAnimal = "Class: " + classesOfAnimals[num];
        return classOfAnimal;
    }

    @Test
    public void getInfo_bears(String name) {
        System.out.println(getKingdom_bears());
        System.out.println(getType_bears());
        System.out.println(getclass(1));
        System.out.println(getUnit());
        System.out.println(getFamely());
        System.out.println(getGenus());
    }

    private String getKingdom_bears() {
        kingdom = this.getKingdom();
        return kingdom;
    }

    private String getType_bears() {
        typeOfAnimal = this.getType();
        return typeOfAnimal;
    }

    private String getclass(int num) {
        classOfAnimal = "Class: " + classesOfAnimals[num];
        return classOfAnimal;
    }

    @Test
    private String getUnit(int num) {
        unitOfAnimal = hierarchy[num];
        return unitOfAnimal;
    }

    private String getFamely(int num) {
        famelyOfAnimal = hierarchy[num];
        return famelyOfAnimal;
    }

    private String getGenus(int num) {
        genusOfAnimal = hierarchy[num];
        return genusOfAnimal;
    }

    @Test
    private String getUnit() {
        return this.getUnit(0);
    }

    private String getFamely() {
        return this.getFamely(1);
    }

    private String getGenus() {
        return this.getFamely(2);
    }
}



