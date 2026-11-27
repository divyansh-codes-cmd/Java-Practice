/*
 * ============================================================================
 * QUESTION 1: What is an Object in Java?
 * ============================================================================
 * 1. Definition: 
 *    An Object is a real-world runtime instance of a Class. While a Class is 
 *    just a logical blueprint (which takes no memory), an Object is the actual 
 *    entity built from that blueprint that occupies space in Heap memory.
 *
 * 2. Three Core Characteristics of Every Object:
 *    - State:    Stored in variables/fields (e.g., color = "Red", balance = 500).
 *    - Behavior: Defined by methods/actions (e.g., drive(), deposit()).
 *    - Identity: A unique internal ID assigned by the JVM to distinguish two 
 *                objects even if their data is identical.
 *
 * 3. Syntax to Create an Object:
 *    ClassName objectName = new ClassName();
 *    Example: Car myCar = new Car();
 * =======================================
 * 
 * 
 * /*
 /*
 * NOTE ON PRIVATE CLASSES:
 * - A top-level (outer) class cannot be declared 'private' in Java (causes a compile-time error).
 * - Top-level classes only allow 'public' or default (no keyword) access modifiers.
 * - 'private' is only allowed on variables, methods, constructors, or nested (inner) classes.
 */



public class Object{
private static class BankAccount{
    String acountHolder;
    double balance;

    //construtor
    public BankAccount(String acountHolder, double balance){
        this.acountHolder = acountHolder;
        this.balance = balance;
    }
    //method
    public void deposit(double amount){
        if(balance > 0) {
            balance = balance + amount;
            System.out.println("Deposited: $" + amount + " | New Balance: $" + balance);
            //System.out.println();
        }
    }

}
//public class Object {
    public static void main(String[] args) {
        BankAccount myAcount = new BankAccount("Divyansh", 500);
        myAcount.deposit(100);
    }
}



