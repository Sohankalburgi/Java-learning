public class removeconsonant {
    public static void main(String[] args) {
        String c = "Hello, have a good day";
        String ans = new String();

        for(int i=0;i<c.length();i++)
        {
            if(c.charAt(i)=='a'||c.charAt(i)=='e'||c.charAt(i)=='i'||c.charAt(i)=='o'||c.charAt(i)=='u')
            {
                ans+=c.charAt(i);
            }

        }
        System.out.println(ans);
    }
}
