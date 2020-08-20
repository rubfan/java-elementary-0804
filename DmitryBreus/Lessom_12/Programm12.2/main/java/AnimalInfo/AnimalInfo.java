package AnimalInfo;

public abstract class AnimalInfo {
    private String Name;
    private String kingdom;
    private String typeOfAnimal;
    private String classOfAnimal;
    private String unitOfAnimal;
    private String famelyOfAnimal;
    private String genusOfAnimal;
    private String[] classesOfAnimals = new String[]{
            "Arachids", "Mammal", "Birds", "Fishies"
    };
    public abstract void getInfo(String name);
    private String getKingdom() {
        this.kingdom = "Kingdom: Animal";
        return kingdom;
    }
    private String getType() {
        this.typeOfAnimal = "Type: Chordate";
        return typeOfAnimal;
    }
    class Spiders extends AnimalInfo {
        public void getInfo(String name) {
            super.Name = name;
            System.out.println(getKingdom());
            System.out.println(getType());
            System.out.println(getclass(0));
        }
        private String getKingdom() {
            kingdom = AnimalInfo.this.getKingdom();
            return kingdom;
        }
        private String getType() {
            typeOfAnimal = AnimalInfo.this.getType();
            return typeOfAnimal;
        }
        private String getclass(int num) {
            classOfAnimal = "Class: " + classesOfAnimals[num];
            return classOfAnimal;
        }
    }
    class Bears extends AnimalInfo {
        public void getInfo(String name) {
            super.Name = name;
            System.out.println(getKingdom());
            System.out.println(getType());
            System.out.println(getclass(1));
            System.out.println(getUnit());
            System.out.println(getFamely());
            System.out.println(getGenus());
        }
        private String getKingdom() {
            kingdom = AnimalInfo.this.getKingdom();
            return kingdom;
        }
        private String getType() {
            typeOfAnimal = AnimalInfo.this.getType();
            return typeOfAnimal;
        }
        private String getclass(int num) {
            classOfAnimal = "Class: " + classesOfAnimals[num];
            return classOfAnimal;
        }
        class UnitFamlyGenus {
            private String[] hierarchy = new String[]{
                    "Unit: Predators", "Famely: Bears", "Genus: Bears", "Brown Bear"
            };
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
        }
        UnitFamlyGenus ufg = new UnitFamlyGenus();
        private String getUnit() {
            return this.ufg.getUnit(0);
        }
        private String getFamely() {
            return this.ufg.getFamely(1);
        }
        private String getGenus() {
            return this.ufg.getFamely(2);
        }
    }
}

