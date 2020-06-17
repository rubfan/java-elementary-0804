interface Pets {
    String getInfoPets(ClassAnimals animals);
}

interface Wild {
    String getInfoWild(ClassAnimals animals);
}

abstract class AnimalInfo {
    String getInfo() {
        return "Information about animal\n";
    }
}

abstract class ClassAnimals extends AnimalInfo {
    public String getInfo(ClassAnimals animal) {
        return super.getInfo() + "The class of the animal ";
    }
}

abstract class Mammals extends ClassAnimals {
    public String getInfo(ClassAnimals animal) {
        if (animal instanceof Mammals) {
            return super.getInfo(animal) + "is mammals, that means were fed with milk.\n";
        } else {
            return "Input mammal animal";
        }
    }
}

abstract class Reptilian extends ClassAnimals {
    public String getInfo(ClassAnimals animal) {
        if (animal instanceof Reptilian) {
            return super.getInfo(animal) + "is reptilian, that skin covered with scales.\n";
        } else {
            return "Input reptilian animal";
        }
    }
}

abstract class Dog extends Mammals implements Pets {
    public String getInfoPets(ClassAnimals animal) {
        if (animal instanceof Dog) {
            return "Dogs live with humans\n";
        } else {
            return "Input dog";
        }
    }
}

abstract class Wolf extends Mammals implements Wild {
    public String getInfoWild(ClassAnimals animal) {
        if (animal instanceof Wolf) {
            return "Wolfs live in wild nature\n";
        } else {
            return "Input wolf";
        }
    }
}

abstract class Crocodiles extends Reptilian implements Wild {
    public String getInfoWild(ClassAnimals animals) {
        if (animals instanceof Crocodiles) {
            return "Crocodiles live in wild lakes or swamps\n";
        } else {
            return "Input crocodile";
        }
    }
}

abstract class SnakesWithoutPoison extends Reptilian implements Pets {
    public String getInfoPets(ClassAnimals animals) {
        if (animals instanceof SnakesWithoutPoison) {
            return "This type of snakes can live with humans\n";
        } else {
            return "Input snake";
        }
    }
}

class Doberman extends Dog {
    public String getInfo(Dog dog) {
        if (dog instanceof Doberman) {
            return super.getInfo(dog)
                    + super.getInfoPets(dog)
                    + "Doberman`s breed means that ears should be trimmed at an early age.\n";
        } else {
            return "Input doberman";
        }
    }
}

class Taxa extends Dog {
    public String getInfo(Dog dog) {
        if (dog instanceof Taxa) {
            return super.getInfo(dog)
                    + super.getInfoPets(dog)
                    + "Taxa is very long dog.\n";
        } else {
            return "Input taxa";
        }
    }
}

class GreyWolf extends Wolf {
    public String getInfo(Wolf wolf) {
        if (wolf instanceof GreyWolf) {
            return super.getInfo(wolf)
                    + super.getInfoWild(wolf)
                    + "Silver wolfs live in pride and have grey colour of fur.\n";
        } else {
            return "Input grey wolf";
        }
    }
}

class WhiteWolf extends Wolf {
    public String getInfo(Wolf wolf) {
        if (wolf instanceof WhiteWolf) {
            return super.getInfo(wolf)
                    + super.getInfoWild(wolf)
                    + "Very rare instance of this type of animal with white color.\n";
        } else {
            return "Input white wolf";
        }
    }
}

class M9iAlligator extends Crocodiles {
    public String getInfo(Crocodiles crocodiles) {
        if (crocodiles instanceof M9iAlligator) {
            return super.getInfo(crocodiles)
                    + super.getInfoWild(crocodiles)
                    + "Mississippi alligator inhabits North America.\n";
        } else {
            return "Input mississippi aligator";
        }
    }
}

class Viper extends SnakesWithoutPoison {
    public String getInfo(SnakesWithoutPoison snakesWithoutPoison) {
        if (snakesWithoutPoison instanceof Viper) {
            return super.getInfo(snakesWithoutPoison)
                    + super.getInfoPets(snakesWithoutPoison)
                    + "Ordinary vipers that can live in aquariums.\n";
        } else {
            return "Input viper";
        }
    }
}

class SpecificWolf extends GreyWolf {
    int countOfPride;

    public SpecificWolf(int countOfPride) {
        this.countOfPride = countOfPride;
    }

    public String showInfo(GreyWolf wolfWowa) {
        return wolfWowa.getInfo(wolfWowa) +
                "This wolf has no owner, no name and he is very dangerous. Lives in pride where are about " +
                countOfPride + " persons.\n";
    }
}

class SpecificDog extends Doberman {
    String owner;
    String nameOfDog;

    public SpecificDog(String owner, String nameOfDog) {
        this.owner = owner;
        this.nameOfDog = nameOfDog;
    }

    public String showInfo(Dog dog) {
        return super.getInfo(dog) + nameOfDog + "`s owner is " + owner + "\n";
    }
}

class SpecM9iCrocodile extends M9iAlligator {
    int weigh;

    public SpecM9iCrocodile(int weigh) {
        this.weigh = weigh;
    }

    public String showInfo(M9iAlligator alligator) {
        return super.getInfo(alligator) + "The alligator weighs is about " + weigh + " kilo.\n";
    }
}

class SpecSnakeWithoutPoison extends Viper {
    int length;

    public SpecSnakeWithoutPoison(int length) {
        this.length = length;
    }

    public String showInfo(Viper viper) {
        return super.getInfo(viper) + "Snake is about " + length + " centimeters.\n";
    }
}

class ShowFullInfo {
    public static void main(String[] args) {
        SpecificDog dog = new SpecificDog("Olena.", "Richard");
        SpecificWolf wolf = new SpecificWolf(7);
        SpecSnakeWithoutPoison snake = new SpecSnakeWithoutPoison(23);
        SpecM9iCrocodile m9iCroc = new SpecM9iCrocodile(150);

        System.out.println(dog.showInfo(dog));
        System.out.println(wolf.showInfo(wolf));
        System.out.println(snake.showInfo(snake));
        System.out.println(m9iCroc.showInfo(m9iCroc));
    }
}
