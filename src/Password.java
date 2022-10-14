public class Password {
    String login;
    String  password;
    String confirmPassword;

    private Password(){
    }

    private static boolean check(String string){
        for (int i = 0; i < string.length(); i++) {
            char symbol = string.charAt(i);
            if (symbol >= 'a' && symbol <= 'z' || symbol >= 'A' && symbol <= 'Z' || symbol >= '0' && symbol <= '9' || symbol == '_'){
                return true;
            }
        }

        if(string.length() == 0 || string.length() > 20) {
            return false;
        }

        return true;
    }

    private static void check2(String login, String  password, String confirmPassword) throws WrongLoginException, WrongPasswordException{
        if(!check(login)) {
            throw new WrongLoginException("Логин введен некорректно");
        }
        if(!check(password)) {
            throw new WrongPasswordException("Пароль введен некорректно");
        }
        if(!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли должны совпадать");
        }
    }

    public static boolean check3(String login, String  password, String confirmPassword){
        try{
            check2(login, password, confirmPassword);
        } catch ( WrongLoginException | WrongPasswordException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

}
