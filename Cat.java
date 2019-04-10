public class Cat extends Animal
{
    // instance variables - replace the example below with your own
    private boolean neutered;
    private boolean declawed;

    /**
     * Constructor for objects of class Cat
     */
    public Cat() 
    {
        super();
        neutered = false;
        declawed = false;
    }

    public Cat (String name, String id, boolean isNeutered) 
    {
        super(id, name);
        neutered = isNeutered;
        declawed = false;
        
    }
    
    @Override
    public void print()
    {
        super.print();
    }
    
}

