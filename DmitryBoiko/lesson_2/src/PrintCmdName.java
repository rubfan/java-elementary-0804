class PrintCmdName {
	public static void main (String[] args){
		
		System.out.print("Hello ");
		for (String arg : args) {
            System.out.print(arg + " ");
        }
	}
}