import AnimalPackage.Cat;
import AnimalPackage.Dog;
import AnimalPackage.Horse;
import org.junit.Assert;
import org.junit.Test;

public class TestAnimalInfo {

    Cat cat = new Cat();
    Dog dog = new Dog();
    Horse horse = new Horse();

    @Test
    public void testGetDogInfo() {
        Assert.assertEquals(dog.getDogInfo(),
                "Animals are living organisms that live in the environment\n" +
                        "mammals are animals that feed on mother's milk as children\n" +
                        "pets are animals that live with humans\n" +
                        "in the wild, representatives of the dog species hunt in packs\n" +
                        "the dog has strong paws to chase prey\n" +
                        "dog likes meat and bones\n" +
                        "dogs running fast\n" +
                        "our dog name's Nik");
    }

    @Test
    public void testGetCatInfo() {
        Assert.assertEquals(cat.getCatInfo(),
                "Animals are living organisms that live in the environment\n" +
                        "mammals are animals that feed on mother's milk as children\n" +
                        "pets are animals that live with humans\n" +
                        "in the wild, representatives of the feline species live and hunt alone\n" +
                        "cat paws are adapted for jumping and climbing trees\n" +
                        "cat has fluffy tail\n" +
                        "cat likes milk\n" +
                        "the cat moves lazily\n" +
                        "our cat name's Vasya");
    }

    @Test
    public void testGetHorseInfo() {
        Assert.assertEquals(horse.getInfo(),
                "Animals are living organisms that live in the environment\n" +
                        "mammals are animals that feed on mother's milk as children\n" +
                        "animals born and living on farms are used by humans for agricultural purposes\n" +
                        "in the wild, horses live in herds\n" +
                        "horse herbivore\n" +
                        "horses running fast they very strong animals\n" +
                        "our horse name's Raven");
    }

    @Test
    public void testGetAnimalHierarchy() {
        Assert.assertEquals(dog.getAnimalHierarchy(),
                "Animals, Mammals, WildAnimals, Pets, FourLegged, Dog ");
        Assert.assertEquals(cat.getAnimalHierarchy(),
                "Animals, Mammals, WildAnimals, Pets, FourLegged, Cat ");
        Assert.assertEquals(horse.getAnimalHierarchy(),
                "Animals, Mammals, WildAnimals, FarmAnimals, Horse ");
    }
}
