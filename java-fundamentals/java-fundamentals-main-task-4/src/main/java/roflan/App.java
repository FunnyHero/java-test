package roflan;

public class App
{
    public static void main( String[] args ) {
        int sum = 0;
        int prod = 1;
        if (args.length != 0) {
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
                prod *= Integer.parseInt(args[i]);
            }
        } else{
            prod = 0;
        }
        System.out.println( "amount = " + sum + " product = " + prod );
    }
}
