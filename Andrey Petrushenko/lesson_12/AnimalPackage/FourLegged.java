package AnimalPackage;

public class FourLegged extends Pets {
    private String paws;
    private String tail;

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getTail() {
        return tail;
    }

    public void setPaws(String paws) {
        this.paws = paws;
    }

    public String getPaws() {
        return paws;
    }

    public String getAnimalHierarchy() {
        return super.getAnimalHierarchy() + "FourLegged, ";
    }


}
