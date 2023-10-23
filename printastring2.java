class Data
{
    private String name;
   
    public void set(String n)
    {
       name=n;
    }
   
    public void get()
    {
        System.out.println("The String is: "+name);
    }
}

public class Main1{
    public static void main(String[] args)
    {
        Data d1 = new Data();
        d1.set("Hello World!");
        d1.get();
    }
}

