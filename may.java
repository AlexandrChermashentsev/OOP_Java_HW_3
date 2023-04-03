package Seminar_3.Home_Work;

public class may {
    public static void main(String[] args) {
        String s2 = "apple";
        String s1 = "orange";

        compareStrings(s1, s2);
    }
    public static void compareStrings(String s1, String s2){
        int compareResul = s1.compareTo(s2);
        if (compareResul > 0){
            System.out.println(1);
        } else if (compareResul < 0) {
            System.out.println(-1);
        } else {System.out.println(0);}
        
    }
}
