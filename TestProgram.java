public class TestProgram
{
    public static void main(String args[])
    {   
        Cat c = new Cat("Fluffy", "111-111", true);
        Animal a = new Animal ("Mad Cow",  "111-111");
        
        c.setWeight (3.3);
        a.setWeight (400.0);
        
        c.print();
        a.print();
    }
}
