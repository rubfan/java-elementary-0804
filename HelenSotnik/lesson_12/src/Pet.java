package animals;

public class Pet extends Animal {
    private String ownerName;
    private String petNickname;

    @Override
    public String getInfo() {
        return super.getInfo() + "\nThis pet has an owner, lives at home, and has no need to get food himself.";
    }

    @Override
    protected String showHierarсhy() {
        return super.showHierarсhy() + " <= Pet";
    }

    @Override
    protected String showDescription() {
        String description = "\n" + getOwnerName() + "\n" + getPetNickname();
        return super.showDescription() + description;
    }

    protected String getOwnerName() {
        return ownerName;
    }

    protected void setOwnerName(String nameOfOwner) {
        this.ownerName = nameOfOwner;
    }

    protected String getPetNickname() {
        return petNickname;
    }

    protected void setPetNickname(String nicknameOfPet) {
        this.petNickname = nicknameOfPet;
    }
}
