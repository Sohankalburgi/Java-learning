//3.Use a private keyword for a variable and use setter and getter methods to initialise and
//print the values.
class student{
    private int age; // private instance variable
    private String name; // private instance variable
    
    public void setAge(int age) 
    {
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}

class settersAndGetters {
    public static void main(String args[])
    {
        student obj1 = new student();
        student obj2 = new student();
        obj1.setAge(18);
        obj1.setName("Tanjiro Kamado");
        
        int age1 = obj1.getAge();
        String name1 = obj1.getName();

        int age2 = obj2.getAge();
        String name2 = obj2.getName();

        System.out.println(age1+" "+name1);
        System.out.println(age2+" "+name2); 
    }
}
