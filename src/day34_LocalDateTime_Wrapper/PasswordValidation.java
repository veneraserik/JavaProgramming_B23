package day34_LocalDateTime_Wrapper;


public class PasswordValidation {

    public static void main(String[] args) {
        String password= "12345678";

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;  // has Upper case letter
        boolean r3 = false;  // has lower case letter
        boolean r4 = false;  // has Digit
        boolean r5 = false; // has Special Character

        for (char each : password.toCharArray()) {

            if(Character.isUpperCase(each)){
                r2 = true;
            }else if(Character.isLowerCase(each)){
                r3 = true;
            }else if(Character.isDigit(each)){
                r4 = true;
            }else{
                r5 = true;
            }

        }


        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);


        if(!r1){
            System.out.println("The password does not have 8 characters or it conatins space");
        }

        if(!r2){
            System.out.println("The password does not have upper case letter");
        }

        if(!r3){
            System.out.println("The password does not have lower case letter");
        }

        if(!r4){
            System.out.println("The password does not have a digit");
        }

        if(!r5){
            System.out.println("The password does not have special character");
        }



    }


}

/*
PasswordValidation:
    Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */