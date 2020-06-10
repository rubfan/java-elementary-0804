public class Task_7_HW_4 {
//   	"How many bottles of champagne?"
	public static void main(String[] args) {
        	int numberPersons = Integer.parseInt(args[0]);
        	double bottleVolume = 750;
        	double onePortion = 100;
        	double numberOfBottle = Math.ceil((onePortion * numberPersons) / bottleVolume);
        	System.out.println(numberPersons + " people(s) need " + numberOfBottle + " bottle of champagne.");
        	double volumeAllBottle = numberOfBottle * bottleVolume;
        	double differenceVolume = volumeAllBottle - (onePortion * numberPersons);
        	System.out.println(differenceVolume + " ml. will remain.");
   	}
}
