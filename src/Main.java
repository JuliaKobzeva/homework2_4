public class Main {
    public static void main(String[] args)  {
        boolean success = Password.check3("test", "test", "test");

        if(success){
            System.out.println("Пароль верен");
        } else {
            System.out.println("Пароль не верен");
        }

    }
}