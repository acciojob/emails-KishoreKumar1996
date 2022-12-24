package com.driver;

public class Email {

    private String emailId;
    private String password;


    public Email(String emailId){
        this.emailId = this.emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String oldPassword, String newPassword) {
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
//        if(oldPassword.equals ("Accio@123")){
//            int uppercase=0,lowercase=0,digit=0,special=0;
//            if(newPassword.length() >= 8){
//                for(int i=0 ;i < newPassword.length();i++){
//                    char ch=newPassword.charAt(i);
//                    if (Character.isLowerCase(ch))
//                        lowercase++;
//                    if (Character.isUpperCase(ch))
//                        uppercase++;
//                    if (Character.isDigit(ch))
//                        digit++;
//                    else {
//                        special++;
//                    }
//                }
        if (this.password.equals(oldPassword)) {
            if (criteria(newPassword)) this.password = newPassword;
        }
    }
        boolean criteria(String password) {
            boolean operation1=false,operation2=false,operation3=false,operation4=false,operation5=false;
            if(password.length()>=8) operation1 = true;
            for(int i=0; i<password.length(); i++) {
                char ch = password.charAt(i);
                operation2 |= isUpperCase(ch);
                operation3 |= isLoweCase(ch);
                operation4 |= isDigit(ch);
                operation5 |= (!isUpperCase(ch) && !isLoweCase(ch) && !isDigit(ch));
            }
            return operation1 && operation2 && operation3 && operation4 && operation5;
        }

        boolean isUpperCase(char ch){
            return ch>='A' && ch<='Z';
        }

        boolean isLoweCase(char ch) {
            return ch>='a' && ch<='z';
        }

        boolean isDigit(char ch) {
            return ch>='0' && ch<='9';
        }
    }



//               String regex= "^(?=.*[a-z) (?=. "+"*[A-Z]) (?=.*\\d)"+"(?=.*[-+_!@#$%^&*.,?]).+$";
//               pass p=pass.compile(regex);

