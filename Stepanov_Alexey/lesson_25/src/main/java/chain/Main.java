package chain;

public class Main {
    public static void main(String[] args) {
        Process process = new Process();

        process.process(new Password("awewererwsd"));
        process.process(new Password("sdd?fff"));
        process.process(new Password("ffs"));
        process.process(new Password("asdferr"));
    }
}
