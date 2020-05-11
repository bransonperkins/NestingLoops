public class NestingLoops
{
    public static void main( String[] args )
    {
        // this is #1 - I'll call it "CN"
        // The outer loop is always going to change faster. It will iterate first and then the inner loop will iterate, so on and so forth until there are no more possible iterations. This would mean that the variable is always controlled by the outer loop.
        // Changing the n loop to the outside will cause all letters of each number printing first. Number takes precedence over character.
        for ( int n=1; n <= 3; n++ )
        {
            for ( char c='A'; c <= 'E'; c++ )
            {
                System.out.println( c + " " + n );
            }
        }

        System.out.println("\n");

        // this is #2 - I'll call it "AB"
        // All of the answers print on separate lines because println() creates a linebreak between each iteration
        // Nothing will print because the 'b' variable will not be accessible/the b variable is out of scope
        for ( int a=1; a <= 3; a++ )
        {
            for ( int b=1; b <= 3; b++ )
            {
                System.out.print( a + "-" + b + " " );
            }
                //System.out.println( a + "-" + b + " " );
        }

        System.out.println("\n");

    }
}