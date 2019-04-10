public class Animal
{
    // instance variables 
    private String name;
    private String ownerId;
    private String breed;
    private int age;        // stroing date of birth would be better
    private double weight;  // in kg

    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {   super();
        name = "";
        ownerId = "";
        age = 0;
        breed = ""; 
        weight = 0.0;
    }
    
    public Animal(String nameIn, String id)
    {   name = nameIn;
        ownerId = id;
        age = 0;
        breed = ""; 
        weight = 0.0;
    }

    // should have 5 sets and 5 gets - only 1 of each here to save time
 
    public void setName(String nameIn)
    {
        name = nameIn;
    }
    public String getName ()
    {
        return name;
    }
    
    public void setOwnerId(String id)
    {
        ownerId = id;
    }
    public String getOwnerId()
    {
        return ownerId;
    }
    
    public void setAge(int years)
    {
        age = 0;
    }
    public int getAge()
    {
        return age;
    }
    
    public void setWeight(double kg)
    {
        weight = kg;
    }
    public double getWeight()
    {
        return weight;
    }
    
    public void print()
    {   
        System.out.println ("Name:\t\t" +  name);
        System.out.println ("Owner Id:\t" + ownerId);
        System.out.println ("Weight:\t\t" + weight + " kg");
    }
}


