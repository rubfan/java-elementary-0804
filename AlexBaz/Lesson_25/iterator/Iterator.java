package iterator;

public interface Iterator {
    boolean hasNext();

    Object next();

    Object getCurrentElement(int index);
}

interface ListPlayers {
    Iterator getIterator();
}

class Client {
    public static void main(String[] args) {
        ConcreteListPlayers clp = new ConcreteListPlayers();
        Iterator iterator = clp.getIterator();

        System.out.println((String)(iterator.getCurrentElement(7)));

        while (iterator.hasNext()) {
            System.out.println((String)(iterator.next()));
        }
    }
}

class ConcreteListPlayers implements ListPlayers {
    String[] team = {"Александр Андриевский", "Бенито", "Артем Беседин",
            "Денис Бойко", "Никита Бурда", "Георгий Бущан",
            "Виталий Буяльский", "Беньямин Вербич", "Денис Гармаш",
            "Карлос Де Пена", "Микель Дуэлунд", "Тамаш Кадар"};

    public Iterator getIterator() {
        return new ConcreteIterator();
    }

    private class ConcreteIterator implements Iterator {
        int index = 0;

        public boolean hasNext() {
            if (index < team.length) {
                return true;
            } else {
                return false;
            }
        }

        public Object next() {
            return team[index++];
        }

        public Object getCurrentElement(int index) {
            return team[index];
        }
    }
}
