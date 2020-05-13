package Lesson7.fihter;
/*
2) Придумайте еще 2 каких-нибудь объекта из реальной жизни и реализуйте это с помощью класса.
 */

public class Fighter {
    private String name;
    private int age;
    private int power;
    private int stamina;
    private String skill;

    public Fighter() {
        power = 0;
        stamina = 0;
        skill = "Beginner";
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public int getPower() {
        return power;
    }

    public int getStamina() {
        return stamina;
    }

    public boolean checkAge (int age) {
        if (age < 15 && age != 0) {
            System.out.println("You're too young. For start training\n" +
                    "Need permission from parents");
            return false;
        }
        else if (age > 15 && age < 50) {
            System.out.println("Everything is fine. Let's start");
            return true;
        }
        else if (age > 50 && age < 80) {
            System.out.println("You're too old. For start training\n" +
                    "Need permission from doctor");
            return false;
        }
        else {
            System.out.println("Show passport");
            return false;
        }
    }

    private void addPowerAndStamina(int power, int stamina) {
        if (power < 100 && stamina < 100) {
            this.power += power;
            this.stamina += stamina;
        } else {
            System.out.println("You are very strong now. Go fight!");
        }
    }

    public void checkSkill() {
        if (stamina < 30 && power < 30) {
            this.skill = "Beginner";
            System.out.printf("You are %s, need more training\n",skill);
        }
        else if (stamina < 70 && power < 70) {
            this.skill = "Amateur";
            System.out.printf("You are %s, need a little training\n",skill);
        }
        else if (stamina <= 100 && power <= 100) {
            this.skill = "Professional";
            System.out.printf("You are %s, go fight\n",skill);
        }
    }

    public void showResult() {
        System.out.printf("%s have %s power, and %s stamina.\n" +
                "%s skill is %s\n",name,power,stamina,name,skill);
    }

    public void showInfo() {
        System.out.println("Name is " + name + ", age is " + age);
    }

    public void running() {
        if (checkAge(age)) {
            System.out.println(name + " is running");
            addPowerAndStamina(5, 10);
        } else {
            System.out.println("Sorry, we're closed!");
        }
    }

    public void swimming() {
        if (checkAge(age)) {
            System.out.println(name + " is swimming");
            addPowerAndStamina(5, 10);
        } else {
            System.out.println("Sorry, we're closed!");
        }
    }

    public void visitGym() {
        if (checkAge(age)) {
            System.out.println(name + " is training in the gym");
            addPowerAndStamina(30, 15);
        } else {
            System.out.println("Sorry, we're closed!");
        }
    }

    public void sparring() {
        if (checkAge(age)) {
            System.out.println(name + " is participate in the training fight");
            addPowerAndStamina(20, 25);
        } else {
            System.out.println("Sorry, we're closed!");
        }
    }

    public void rest() {
        if (checkAge(age)) {
            System.out.println(name + " need some rest after training");
            addPowerAndStamina(10, 10);
        } else {
            System.out.println("Sorry, we're closed!");
        }
    }
}
