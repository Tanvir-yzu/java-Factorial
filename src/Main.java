public class Main {
    public static void main(String[] args) {
        MyClass MyClass = new MyClass();
        Factorial factorialCalculator = new Factorial();
        MyClass.doSomething();
        MyClass.someTest();
        
        MyClass.Number();
        int number = 5;
        long factorial = factorialCalculator.calculateFactorial(number);
        
        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}