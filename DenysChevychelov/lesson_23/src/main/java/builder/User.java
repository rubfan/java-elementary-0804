package builder;

public class User {
    private String name;
    private String surname;
    private String bornCity;
    private String bornCountry;
    private String education;
    private String email;
    private byte age;
    private byte weight;
    private byte height;
    private byte footSize;

    private User() {
    }

    public static UserBuilder newUser() {
        return new User().new UserBuilder();
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", bornCity='" + bornCity + '\'' +
                ", bornCountry='" + bornCountry + '\'' +
                ", education='" + education + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", footSize=" + footSize +
                '}';
    }

    public class UserBuilder {

        public UserBuilder setName(String name) {
            User.this.name = name;
            return this;
        }

        public UserBuilder setSurname(String surname) {
            User.this.surname = surname;
            return this;
        }

        public UserBuilder setBornCity(String bornCity) {
            User.this.bornCity = bornCity;
            return this;
        }

        public UserBuilder setBornCountry(String bornCountry) {
            User.this.bornCountry = bornCountry;
            return this;
        }

        public UserBuilder setEducation(String education) {
            User.this.education = education;
            return this;
        }

        public UserBuilder setEmail(String email) {
            User.this.email = email;
            return this;
        }

        public UserBuilder setAge(byte age) {
            User.this.age = age;
            return this;
        }

        public UserBuilder setWeight(byte weight) {
            User.this.weight = weight;
            return this;
        }

        public UserBuilder setHeight(byte height) {
            User.this.height = height;
            return this;
        }

        public UserBuilder setFootSize(byte footSize) {
            User.this.footSize = footSize;
            return this;
        }

        public User build() {
            return User.this;
        }
    }
}
