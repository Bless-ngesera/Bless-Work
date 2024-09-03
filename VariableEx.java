public class VariableEx {
    int i = 10; // This is an instance variable

    static int s = 15; // This is a static variable
public static void localMethods(){
    int l = 20; //This is a local variable
    System.out.println("The local variable = " + l);
}
public void instanceMethod(){
    //Accessing instance variable
    System.out.println(i + " Can be directly accessed from the instance method");

    //Accessing static variable
    System.out.println(s + " Can be directly accessed from the instance method");

}
//Static Method
public static void staticMethod(){
    //Accessing static variable
    System.out.println(s + " Can be directly accessed from the static method");
    
    // Note: Cannot access instance variables directly in a static method
    // System.out.println(instanceVariable); 
    // This would cause an error

}
    public static void main(String[] args) {
       

        // Creation of an object
        VariableEx obj = new VariableEx();

        //Accessing the instance variable
        System.out.println("The instance variable = " + obj.i);

        //Accessing the local variable
        

        //Accessing the static variable
        System.out.println("The static variable = " + VariableEx.s);

        //Calling instanceMethod
        obj.instanceMethod();
        
 
        //Calling staticMethod
        staticMethod();

        //Calling localMethod
        localMethods();
    }
   
}
