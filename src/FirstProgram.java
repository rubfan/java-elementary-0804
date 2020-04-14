public class FirstProgram {
static int i;
    public static void main(String[] args) {
	// write your code here
    if (args.length!=0)
    {
        i=0;
        System.out.println("Arguments: " + args.length);
        while(i<args.length)
        {
            System.out.println("Arguments[" +i+ "]:"+args[i]);
            i++;
        }
    }

    if (args.length==0)
    {
        System.out.println("Arguments: " + args.length);
    }

    }

}
