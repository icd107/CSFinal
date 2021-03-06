public class Room
{
    private String name;
    private int squareFeet;
    
    Room()
    {
        name = "";
        squareFeet = 0;
    }
    Room(String name, int squareFeet)
    {
        this.name = name;
        this.squareFeet = squareFeet;
    }
    
    //getter
    String getName()
    {
        return name;
    }
    int getSquareFeet()
    {
        return squareFeet;
    }
    //setters
    void setSquareFeet(int squareFeet)
    {
        this.squareFeet = squareFeet;
    }
    
    public String toString()
    {
        return name + ":\n\t\tSquare Feet: " + squareFeet;
    }
}
