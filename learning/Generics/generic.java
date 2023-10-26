import java.util.*;
class generic
{
    public static void main(String[] args) {
        String s[] = new String[10];
        s[0]= "Sohan";
        s[1] ="kalburgi";
        
        String name1 = s[0];
        String name2 = s[1];

        // no typesafety
        ArrayList<String> a = new ArrayList<>();
        a.add("HI");
        a.add("there");
        //a.add(7);
        
        //String n1 = (String) a.get(0); //  typecasting as a.get() method provide objects
        //String n2 = (String) a.get(1);
        //String n3 = (String) a.get(2);
        String n1 = a.get(0);
        String n2 = a.get(1);

    }
}