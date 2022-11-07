package Firstproject;

public class Methodpresentation {

    public static void main(String[] args) {
        selam1();
       String hey=cetin1("Hello Everyone");
        System.out.println(hey);
        System.out.println("lastname second type = " + cetin1("Hello Everyone"));


    }

    public void selam(){
        selam1();
        System.out.println("cetin(\"heyyooo\") = " + cetin("heyyooo"));
        System.out.println("cetin1(\"hiiiii\") = " + cetin1("hiiiii"));


        // if you dont have static keyword , you have to make object to reach method

        System.out.println("Hello NON-Static ");
    }

    public static void selam1(){

        System.out.println("Hello to Static ");
    }


    public String cetin(String lastname) {

        System.out.println("this is non- static return");
        return lastname;
    }


    public static String cetin1(String LastName1){


        return LastName1;
    }
}
