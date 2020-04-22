public class MyProgram {
	public static void main(String[] args) {
		if (args.length == 2) {
			System.out.format("Hello %s %s\n", args[0], args[1]);
		} else {
			System.out.println("Wrong usage, try again. Correct syntax: java AS_program <Name> <Surname>");
		}
	}
}