public class tocheck_e_ {

    public static void main(String[] args) {
        String s = "Umbrella";
        boolean check = false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='e')
            {
                check = true;
            }
        }
        if(check)
        {
            System.out.println("e is found");
        }
        else{
            System.out.println("e is not found");
        }
    }
}
