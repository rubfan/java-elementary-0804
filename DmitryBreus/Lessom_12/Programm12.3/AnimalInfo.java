public class AnimalInfo {
    public void getInfo() {
        getInfo info = new getInfo();
        info.getInfo();
    }
    private static class getInfo extends AnimalInfo {
        public void getInfo() {
            classInfo.step0 step0= new classInfo.step0();
            System.out.println(step0.getKingdom());
            classInfo.step1 step1= new classInfo.step1();
            System.out.println(step1.getType());
            classInfo.step2 step2= new classInfo.step2();
            System.out.println(step2.getclass());
            classInfo.step3 step3= new classInfo.step3();
            System.out.println(step3.getUnit());
            classInfo.step4 step4= new classInfo.step4();
            System.out.println(step4.getFamely());
            classInfo.step5 step5= new classInfo.step5();
            System.out.println(step5.getGenus());
            classInfo.step6 step6= new classInfo.step6();
            System.out.println(step6.getSpecies());
        }

      static  class classInfo {
          static class step0 {
              String kingdom;
              private String getKingdom() {
                  kingdom = "Kingdom: Animal";
                  return kingdom;
              }
          }
            static class step1 extends step0 {
                String typeOfAnimal;
                public String getType() {
                    typeOfAnimal = super.getKingdom()+ ". Type: Chordate";
                    return typeOfAnimal;
                }
            }
          static class step2 extends step1 {
              String classOfAnimal;
              step1 Type=new step1();
              private String getclass() {
                  classOfAnimal =super.getType()+". Class: Mammal";
                  return classOfAnimal;
              }
          }
          static class step3 extends step2 {
              String unitOfAnimal;
              step2 Class=new step2();
              private String getUnit() {
                  unitOfAnimal =this.Class.getclass() + ". Unit: Predators";
                  return unitOfAnimal;
              }
          }
          static class step4 {
              String famelyOfAnimal;
              step3 Unit=new step3();
              private String getFamely() {
                  famelyOfAnimal = Unit.getUnit()+". Famely: Bears";
                  return famelyOfAnimal;
              }
          }
          static class step5 {
              String genusOfAnimal;
              public String getGenus() {
                  step4 Famely=new step4();
                  genusOfAnimal =Famely.getFamely()+ ". Genus: Bears";
                  return genusOfAnimal;
              }
          }
          static class step6 extends step5 {
              String speciesOfAnimal;
              public String getSpecies() {
                  speciesOfAnimal =super.getGenus()+ ". Species: Brown Bears";
                  return speciesOfAnimal;
              }
          }
        }

    }
}