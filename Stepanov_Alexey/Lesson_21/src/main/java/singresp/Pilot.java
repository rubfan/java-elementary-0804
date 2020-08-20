package singresp;

public class Pilot {
    private int age;
    private String qualification;
    private String licenceNumber;
    private boolean healthCondition;
    private int flyingExperience;

    public Pilot(int age, String qualification, String licenceNumber, boolean healthCondition, int flyingExperience) {
        this.age = age;
        this.qualification = qualification;
        this.licenceNumber = licenceNumber;
        this.healthCondition = healthCondition;
        this.flyingExperience = flyingExperience;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(String licenceNumber) {
        this.licenceNumber = licenceNumber;
    }

    public boolean isHealthCondition() {
        return healthCondition;
    }

    public void setHealthCondition(boolean healthCondition) {
        this.healthCondition = healthCondition;
    }

    public int getFlyingExperience() {
        return flyingExperience;
    }

    public void setFlyingExperience(int flyingExperience) {
        this.flyingExperience = flyingExperience;
    }
}
