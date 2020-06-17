import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TestAnimals {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    AnimalInfo animalInfo = new AnimalInfo() {
        @Override
        String getInfo() {
            return super.getInfo();
        }
    };
    ClassAnimals classAnimals = new ClassAnimals() {
        @Override
        public String getInfo(ClassAnimals animals) {
            return super.getInfo(animals);
        }
    };
    Mammals mammals = new Mammals() {
        @Override
        public String getInfo(ClassAnimals mammals) {
            return super.getInfo(mammals);
        }
    };
    Reptilian reptilian = new Reptilian() {
        @Override
        public String getInfo(ClassAnimals reptilian) {
            return super.getInfo(reptilian);
        }
    };
    Dog dog = new Dog() {
        @Override
        public String getInfoPets(ClassAnimals animals) {
            return super.getInfoPets(animals);
        }
    };
    Wolf wolf = new Wolf() {
        @Override
        public String getInfoWild(ClassAnimals animals) {
            return super.getInfoWild(animals);
        }
    };
    Crocodiles crocodiles = new Crocodiles() {
        @Override
        public String getInfoWild(ClassAnimals animals) {
            return super.getInfoWild(animals);
        }
    };
    SnakesWithoutPoison snakesWithoutPoison = new SnakesWithoutPoison() {
        @Override
        public String getInfoPets(ClassAnimals animals) {
            return super.getInfoPets(animals);
        }
    };

    Doberman doberman = new Doberman();
    Taxa taxa = new Taxa();
    GreyWolf greyWolf = new GreyWolf();
    WhiteWolf whiteWolf = new WhiteWolf();
    M9iAlligator m9iAlligator = new M9iAlligator();
    Viper viper = new Viper();

    SpecificDog specificDog = new SpecificDog("Olena", "Richard");
    SpecificWolf specificWolf = new SpecificWolf(10);
    SpecM9iCrocodile specificM9iC7e = new SpecM9iCrocodile(250);
    SpecSnakeWithoutPoison specSnakeW5tPoison = new SpecSnakeWithoutPoison(121);

    @Test
    public void testAnimalInfo() {
        animalInfo.getInfo();
        assertThat(animalInfo.getInfo(), is("Information about animal\n"));
    }

    @Test
    public void testClassAnimalsSuccess() {
        assertThat(classAnimals.getInfo(classAnimals),
                is("Information about animal\n" + "The class of the animal "));
    }

    @Test
    public void testClassAnimalsClassCastException() {
        exception.expect(ClassCastException.class);
        exception.expectMessage(classAnimals.getInfo((ClassAnimals) animalInfo));

        classAnimals.getInfo((ClassAnimals) animalInfo);
    }

    @Test
    public void testMammalsSuccess() {
        assertThat(mammals.getInfo(mammals),
                is("Information about animal\n" +
                        "The class of the animal " +
                        "is mammals, that means were fed with milk.\n"));
    }

    @Test
    public void testMammalsWrongInputType() {
        assertThat(mammals.getInfo(reptilian),
                is("Input mammal animal"));
    }

    @Test
    public void testMammalsClassCastException() {
        exception.expect(ClassCastException.class);
        exception.expectMessage(mammals.getInfo((ClassAnimals) animalInfo));

        mammals.getInfo((ClassAnimals) animalInfo);
    }

    @Test
    public void testReptilianSuccess() {
        assertThat(reptilian.getInfo(reptilian),
                is("Information about animal\n" +
                        "The class of the animal " +
                        "is reptilian, that skin covered with scales.\n"));
    }

    @Test
    public void testReptilianWrongInputType() {
        assertThat(reptilian.getInfo(mammals),
                is("Input reptilian animal"));
    }

    @Test
    public void testReptilianClassCastException() {
        exception.expect(ClassCastException.class);
        exception.expectMessage(reptilian.getInfo((ClassAnimals) animalInfo));

        reptilian.getInfo((ClassAnimals) animalInfo);
    }

    @Test
    public void testDogSuccess() {
        assertThat(dog.getInfoPets(dog),
                is("Dogs live with humans\n"));
    }

    @Test
    public void testDogClassCastException() {
        exception.expect(ClassCastException.class);
        exception.expectMessage(dog.getInfoPets((ClassAnimals) animalInfo));

        dog.getInfo((ClassAnimals) animalInfo);
    }

    @Test
    public void testDogWrongInputType() {
        assertThat(dog.getInfoPets(wolf),
                is("Input dog"));
    }

    @Test
    public void testWolfSuccess() {
        assertThat(wolf.getInfoWild(wolf),
                is("Wolfs live in wild nature\n"));
    }

    @Test
    public void testWolfClassCastException() {
        exception.expect(ClassCastException.class);
        exception.expectMessage(wolf.getInfoWild((ClassAnimals) animalInfo));

        wolf.getInfo((ClassAnimals) animalInfo);
    }

    @Test
    public void testWolfWrongInputType() {
        assertThat(wolf.getInfoWild(dog),
                is("Input wolf"));
    }

    @Test
    public void testCrocodilesSuccess() {
        assertThat(crocodiles.getInfoWild(crocodiles),
                is("Crocodiles live in wild lakes or swamps\n"));
    }

    @Test
    public void testCrocodilesClassCastException() {
        exception.expect(ClassCastException.class);
        exception.expectMessage(crocodiles.getInfoWild((ClassAnimals) animalInfo));

        crocodiles.getInfo((ClassAnimals) animalInfo);
    }

    @Test
    public void testCrocodilesWrongInputType() {
        assertThat(crocodiles.getInfoWild(snakesWithoutPoison),
                is("Input crocodile"));
    }

    @Test
    public void testSnakesWithoutPoisonSuccess() {
        assertThat(snakesWithoutPoison.getInfoPets(snakesWithoutPoison),
                is("This type of snakes can live with humans\n"));
    }

    @Test
    public void testSnakesWithoutPoisonClassCastException() {
        exception.expect(ClassCastException.class);
        exception.expectMessage(snakesWithoutPoison.getInfoPets((ClassAnimals) animalInfo));

        snakesWithoutPoison.getInfo((ClassAnimals) animalInfo);
    }

    @Test
    public void testSnakeWithoutPoisonWrongInputType() {
        assertThat(snakesWithoutPoison.getInfoPets(crocodiles),
                is("Input snake"));
    }

    @Test
    public void testDobermanSuccess() {
        assertThat(doberman.getInfo(doberman),
                is("Information about animal\n" +
                        "The class of the animal is mammals, that means were fed with milk.\n" +
                        "Dogs live with humans\n" +
                        "Doberman`s breed means that ears should be trimmed at an early age.\n"));
    }

    @Test
    public void testDobermanClassCastException() {
        exception.expect(ClassCastException.class);
        exception.expectMessage(doberman.getInfoPets((Wolf) animalInfo));

        doberman.getInfo(wolf);
    }

    @Test
    public void testDobermanWrongAnimalTypeInputted() {
        assertThat(doberman.getInfo(reptilian),
                is("Input mammal animal"));
        assertThat(doberman.getInfo(greyWolf),
                is("Information about animal\n" +
                        "The class of the animal is mammals, " +
                        "that means were fed with milk.\n"));
        assertThat(doberman.getInfo(taxa),
                is("Input doberman"));
    }

    @Test
    public void testTaxaSuccess() {
        assertThat(taxa.getInfo(taxa),
                is("Information about animal\n" +
                        "The class of the animal is mammals, that means were fed with milk.\n" +
                        "Dogs live with humans\n" +
                        "Taxa is very long dog.\n"));
    }

    @Test
    public void testTaxaWrongAnimalTypeInputted() {
        assertThat(taxa.getInfo(crocodiles),
                is("Input mammal animal"));
        assertThat(taxa.getInfo(whiteWolf),
                is("Information about animal\n" +
                        "The class of the animal is mammals, " +
                        "that means were fed with milk.\n"));
        assertThat(taxa.getInfo(doberman),
                is("Input taxa"));
    }


    @Test
    public void testGreyWolfSuccess() {
        assertThat(greyWolf.getInfo(greyWolf),
                is("Information about animal\n" +
                        "The class of the animal is mammals, that means were fed with milk.\n" +
                        "Wolfs live in wild nature\n" +
                        "Silver wolfs live in pride and have grey colour of fur.\n"));
    }

    @Test
    public void testGreyWolfInsertWrongAnimalType() {
        assertThat(greyWolf.getInfo(reptilian),
                is("Input mammal animal"));
        assertThat(greyWolf.getInfo(dog),
                is("Information about animal\n" +
                        "The class of the animal is mammals," +
                        " that means were fed with milk.\n"));
        assertThat(greyWolf.getInfo(whiteWolf),
                is("Input grey wolf"));
    }

    @Test
    public void testWhiteWolfSuccess() {
        assertThat(whiteWolf.getInfo(whiteWolf),
                is("Information about animal\n" +
                        "The class of the animal is mammals, that means were fed with milk.\n" +
                        "Wolfs live in wild nature\n" +
                        "Very rare instance of this type of animal with white color.\n"));
    }

    @Test
    public void testWhiteWolfInsertWrongAnimalType() {
        assertThat(whiteWolf.getInfo(reptilian),
                is("Input mammal animal"));
        assertThat(whiteWolf.getInfo(dog),
                is("Information about animal\n" +
                        "The class of the animal is mammals," +
                        " that means were fed with milk.\n"));
        assertThat(whiteWolf.getInfo(greyWolf),
                is("Input white wolf"));
    }

    @Test
    public void testM9iAlligatorSuccess() {
        assertThat(m9iAlligator.getInfo(m9iAlligator),
                is("Information about animal\n" +
                        "The class of the animal " +
                        "is reptilian, that skin covered with scales.\n" +
                        "Crocodiles live in wild lakes or swamps\n" +
                        "Mississippi alligator inhabits North America.\n"));
    }

    @Test
    public void testM9iAlligatorWrongAnimalType() {
        assertThat(m9iAlligator.getInfo(snakesWithoutPoison),
                is("Information about animal\n" +
                        "The class of the animal" +
                        " is reptilian, that skin covered with scales.\n"));
        assertThat(m9iAlligator.getInfo(wolf),
                is("Input reptilian animal"));
    }

    @Test
    public void testViperSuccess() {
        assertThat(viper.getInfo(viper),
                is("Information about animal\n" +
                        "The class of the animal " +
                        "is reptilian, that skin covered with scales.\n" +
                        "This type of snakes can live with humans\n" +
                        "Ordinary vipers that can live in aquariums.\n"));
    }

    @Test
    public void testViperWrongAnimalType() {
        assertThat(m9iAlligator.getInfo(snakesWithoutPoison),
                is("Information about animal\n" +
                        "The class of the animal" +
                        " is reptilian, that skin covered with scales.\n"));
        assertThat(m9iAlligator.getInfo(whiteWolf), is("Input reptilian animal"));
    }

    @Test
    public void testSpecificDogFullOutput() {
        assertThat(specificDog.showInfo(doberman),
                is("Information about animal\n" +
                        "The class of the animal is mammals," +
                        " that means were fed with milk.\n" +
                        "Dogs live with humans\n" +
                        "Doberman`s breed means that ears should be trimmed at an early age.\n" +
                        "Richard`s owner is Olena\n"));
    }

    @Test
    public void testSpecificWolfFullOutput() {
        assertThat(specificWolf.showInfo(greyWolf),
                is("Information about animal\n" +
                        "The class of the animal is mammals," +
                        " that means were fed with milk.\n" + "Wolfs live in wild nature\n" +
                        "Silver wolfs live in pride and have grey colour of fur.\n" +
                        "This wolf has no owner, no name and he is very dangerous." +
                        " Lives in pride where are about 10 persons.\n"

                ));
    }

    @Test
    public void testSpecificCrocodileFullOutput() {
        assertThat(specificM9iC7e.showInfo(m9iAlligator),
                is("Information about animal\n" +
                        "The class of the animal " +
                        "is reptilian, that skin covered with scales.\n" +
                        "Crocodiles live in wild lakes or swamps\n" +
                        "Mississippi alligator inhabits North America.\n" +
                        "The alligator weighs is about " + 250 + " kilo.\n"
                ));
    }

    @Test
    public void testSpecificSnakeFullOutput() {
        assertThat(specSnakeW5tPoison.showInfo(viper),
                is("Information about animal\n" +
                        "The class of the animal " +
                        "is reptilian, that skin covered with scales.\n" +
                        "This type of snakes can live with humans\n" +
                        "Ordinary vipers that can live in aquariums.\n" +
                        "Snake is about " + 121 + " centimeters.\n"
                ));
    }
}
