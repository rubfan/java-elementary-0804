import java.io.*;

class HelloMyFriend  {
    public static void main (String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        System.out.print("Hello " + name + "!");
        }
    }