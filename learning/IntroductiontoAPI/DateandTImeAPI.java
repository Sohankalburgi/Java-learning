

class DateandTimeAPI
{
    public static void main(String[] args) {
        java.util.Date d = new java.util.Date();
        System.out.println(d);
        long timeinMS = d.getTime();
        

        java.sql.Date d1 = new java.sql.Date(timeinMS);
        System.out.println(d1);
    }
}