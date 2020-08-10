package usersContainer;

import java.util.Objects;

public class User {
    /*
    1) Написать сласс User имеющий поля name и age
    Написать класса который имеет следующие методы:
    //addUser(User user);
    //addArrayOfUsers();
    //removeUser(User user);
    //insertUserByIndex(User user, int index);
    //updateUserByIndex(User user, int index);
    //findUserByName(String name);
    //getUsersOrderedByAge();
    //getUsersOrderedByName();
    Для задачи не использовать масивы а использовать класс Container c 2я полями:
    User user;
    Container nextContainer;
    */
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
