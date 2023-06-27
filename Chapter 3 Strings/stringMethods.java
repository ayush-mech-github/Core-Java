public class stringMethods{
    public static void main(String[] args){
        String name = "Ayush";
        //length of string
        System.out.println(name.length());
        //lowercase conversion
        System.out.println(name.toLowerCase());
        //uppercase conversion
        System.out.println(name.toUpperCase());
        //trimming the string
        String nonTrimmedString = "    Ayush       ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());
        //substring
        System.out.println(name.substring(2,4));
        //replace
        System.out.println(name.replace('u', 'v'));
        //starts with
        System.out.println(name.startsWith("Ay"));
        //ends with
        System.out.println(name.endsWith("sh"));
        //character at
        System.out.println(name.charAt(4));
        //index of a character
        System.out.println(name.indexOf("yu"));
        //last index of a character or string
        System.out.println(name.lastIndexOf("u", 1));
        //euality of two strings
        System.out.println(name.equals("Ayush"));
        System.out.println(name.equalsIgnoreCase("ayush"));
    }

}