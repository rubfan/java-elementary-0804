public class GetAnimalInfo {
    public String getAnimalInfo(String dogName) {
        Labrador labrador = new Labrador();
        System.out.println(labrador.getInfo());
        System.out.println("Name is dog - " + dogName);
        System.out.println(getInfoExtend(Labrador.class));
        return ("Name is dog - " + dogName);
    }

    public String getInfoExtend(Class value) {

        StringBuilder builder = new StringBuilder(value.getSimpleName());
        Class klass = value;
        while (true) {
            if (klass.getSimpleName().equals("Object")) {
                break;
            }
            klass = klass.getSuperclass();
            builder.append(" => " + klass.getSimpleName());
        }
        return builder.toString();
    }
}
