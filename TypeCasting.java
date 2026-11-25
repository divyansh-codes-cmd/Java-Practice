// Type Casting: Converting one data type into another.

// 1. Widening Casting:(automatically) Converting a smaller data type into a larger data type.
// Flow: byte → short → int → long → float → double

// 2. Narrowing Casting:(manually) Converting a larger data type into a smaller data type.
// Flow: double → float → long → int → short → byte


public class TypeCasting {
    public static void main(String[] args) {
        //Widening Casting:(automatically)
        int myInt = 9;
        double myDouble = myInt; // automatic
        System.out.println(myInt); // output : 9
        System.out.println(myDouble); // output : 9.0
    }
}

class TypeCasting1 {
    public static void main(String[] args) {
        //Narrowing Casting:(manually)
        double myDouble = 9.78d;
        int myInt = (int)myDouble; //Manually
        System.out.println(myDouble); //output : 9.78d
        System.out.println(myInt); //output : 9
    }
}


