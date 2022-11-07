package Firstproject;

public class MethodHuman {




    public static void main(String[] args) {

        Methodpresentation num=new Methodpresentation();
        num.selam();





        HAND1(5);
        HAND2(9);

        FEET1();
        FEET2();

        // return is break statement
    }
    public static int HAND1(int A){
        System.out.println("HAND 1 FOR RETURN TYPE");
        return A;
    }

    public static void HAND2(int B){
        System.out.println( "HAND 2 FOR VOID TYPE");
    }

    public static String FEET1(){
        System.out.println("FEET 1 FOR RETURN TYPE");
        return FEET1();
    }

    public static void FEET2(){
        System.out.println( "FEET 2 FOR VOID TYPE");

    }






}
