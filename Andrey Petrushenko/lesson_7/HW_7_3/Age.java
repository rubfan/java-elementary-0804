public class Age {
    private int ageD;
    public void yD(int year){
        ageD=year;
    }
    public void getAge(){
        if (ageD<=5){
            System.out.println("Its young dog");
        }
        if((ageD>5)&&(ageD<7)){
            System.out.println("This dog is not young");
        }
        if (ageD>7){
            System.out.println("Its old dog");
        }
    }
}
