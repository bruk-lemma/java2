public class Throw {

    static void checkAge(int age){
        if(age <18){
            throw new ArithmeticException("Access denied -you must be at least 18 years old");
        }else {
            System.out.println("Access granted...");
        }
    }

    public static  void main(String[] args){
        checkAge(20);
    }
}
