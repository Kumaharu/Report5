package jp.ac.uryukyu.ie.e165720;

public class main {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが起きた");
         
        }
    }
}
