package interpreter;

public interface Tactics {
    String interpreter();

    String[] interpreters();
}

class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Tactics tactics = context.evaluate("4-4-2");
        context.printResult(tactics.interpreters());
    }
}

class Context {
    String[] positions = {"Defenders", null, "Midfielders", null, "Forwards", null};

    Tactics evaluate(String tactics) {
        for (int i = 0; i < tactics.length(); i++) {
            if (Character.isDigit(tactics.charAt(i))) {
                positions[i + 1] = new NumberPlaysLine(String.valueOf(tactics.charAt(i))).interpreter();
            }
        }
        return new ResultLine(positions);
    }

    public void printResult(String[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
            if (i != 0 && i % 2 != 0) {
                System.out.println();
            }
        }
    }
}

class NumberPlaysLine implements Tactics {
    String number;

    public NumberPlaysLine(String number) {
        this.number = number;
    }

    public String interpreter() {
        return number;
    }

    public String[] interpreters() {
        return null;
    }
}

class ResultLine implements Tactics {
    String[] positions;

    public ResultLine(String[] positions) {
        this.positions = positions;
    }

    public String[] interpreters() {
        return positions;
    }

    public String interpreter() {
        return null;
    }
}
