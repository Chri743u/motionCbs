package com.motionCBS.Shared;

public class FieldVerifier {

    public static boolean isValidFname (String Fname){
        // check if firstname is empty (not allowed)
        if (Fname.isEmpty()){
            return false;
        }

        // check if firstname field contains digits (not allowed)
        for (int n=0 ; n < Fname.length() ; n++){
            if (Character.isDigit(Fname.charAt(n)))
                return false;
        }
        // check if firstname contain at lest two characters
        return Fname.length() > 1;
    }

    public static boolean isValidLname (String Lname) {
        // check if lastname is empty (not allowed)
        if (Lname.isEmpty()) {
            return false;
        }

        // check if lastname field contains digits (not allowed)
        for (int n = 0; n < Lname.length(); n++) {
            if (Character.isDigit(Lname.charAt(n)))
                return false;
        }
        // check if lastname contain at lest two characters
        return Lname.length() > 1;
    }

    /*public static boolean isValidEmail (String Email) {
        // check if email is empty (not allowed)
        if (Email.isEmpty()) {
            return false;
        }
        // check if email contains '@'
        for (int n=0 ; n < Email.length() ; n++){
            if (Character.@(Email.charAt(n)))
                return true;
        }
        return ;
    }*/

}
