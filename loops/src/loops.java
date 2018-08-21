public class loops {
    public static void main(String[] args)
    {
        writeSquares();
        writeSquares2();
        writeSquares3();
        writeSquares4(100);
        writeSquares5();

    }

    public static void writeSquares() {
        System.out.println("writeSquares...");
        // We want to create a program to print the
        // squares of the first five integers
        // one way to do it is like this
        System.out.println(1 + " squared = " + (1 * 1));
        System.out.println(2 + " squared = " + (2 * 2));
        System.out.println(3 + " squared = " + (3 * 3));
        System.out.println(4 + " squared = " + (4 * 4));
        System.out.println(5 + " squared = " + (5 * 5));
    }

    public static void writeSquares2() {
        System.out.println("writeSquares2...");
        for (int i = 1; i <= 5; i++)
        {
            System.out.println( i + " squared = " + (i * i));
        }
        // There are 3 parts to a for loop, they are all optional
        // the first part is used to initialize a variable
        // for the above for loop, we create a variable
        // called i and initialize it to 1
        // the middle part is the conditio which will
        // continue the loop, for the above one, the loop
        // will continue as long as i is less than or equal
        // to 5, the last part of the loop is used to increment
        // or decrement the variable
        // for the next loop we wil continue as long
        // as i is less than or equal to 100
    }
    public static void writeSquares3(){
        System.out.println("writeSquares3...");
        for (int i =1; i <= 100; i++)
        {
            System.out.println(i + " squared = " + (i * i));
        }
    }

    public static void writeSquares4(int stopVal){
        System.out.println("writeSquares4...");
        System.out.println("stop value is " + stopVal);
        for (int i = 1; i <= stopVal; i++)
        {
            System.out.println(i + " squared = " + (i * i));
        }
    }
    public static void writeSquares5()
    {
        System.out.println("writeSquares5...");
        for(int c =(2 +2); c <= (17*3); c++)
        {
            System.out.println(c + " squared = " + (c * c));
        }
    }

}
