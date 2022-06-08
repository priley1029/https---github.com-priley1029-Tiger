public class Tiger
{

    private String furColor;
    private int foodEaten;
    private int thirstLevel;
    private int waterDrank;
    private int size;
    private String location;
    //this is the constructor that gives a value to each of these atributes
    public Tiger(int s, String l)
    {
        furColor = " ";
        foodEaten = 0;
        thirstLevel = 0;
        size = s;
        location = l;

    }
    //this returns the current fur color
    public String getFurColor()
    {
        return furColor;
    }
    //this returns the current hunger level stored in the food eaten variable
    public int getHungerLevel()
    {
        return foodEaten;
    }
    //this returns the food level
    public int getThirstLevel()
    {
        return thirstLevel;
    }
    //this returns the location of the tiger
    public String getLocation()
    {
        return location;
    }
    //this dictates the color of the tiger's fur based on it's location
    public void setFurColor()
    {
        if(location == "jungle")
        {
            furColor = "Orange";
        }

        else
        {
            furColor = "white";
        }
        
        System.out.println("The tiger is " + furColor + ".");
    }
    //this sees if the tiger is hungry and if it needs to eat
    public void eatMeat()
    {
        if (foodEaten < size*2)
        { 
            
            foodEaten++;
            System.out.println("The tiger ate its meat."); 
        }
        else
        {
            System.out.println("The tiger has eaten enough."); 
        }
    }
    //this checks if the tiger is the right size to go hunt
    public void huntForFood()
    {
        if(size > 5)
        {
            for(int i = foodEaten; i > 0; i--)
            { 
                System.out.println("The tiger is big enough to hunt, so it uses energy to hunt a wildabeast.");  
            }
        }
        else
        {
             System.out.println("The tiger is too young and weak to hunt the wildabeast.");
        }
    }   
    //this checks to see if the tiger needs to drink water based on its thirst level
    public void drinkWater()
    {
        if (waterDrank < thirstLevel)
        { 
            
            waterDrank++;
            System.out.println("The tiger drank its water."); 
        }
        else
        {
            System.out.println("The tiger has drank enough water."); 
        } 
    }

    public static void main(String args[]) //Tests each method of the class at least once
    {
        Tiger Tim = new Tiger(4, "jungle");
        Tim.eatMeat();
        Tim.huntForFood();
        Tim.drinkWater();
        Tim.setFurColor();

        Tiger Tony = new Tiger(30, "mountain");
        Tony.eatMeat();
        Tony.huntForFood();
        Tony.drinkWater();
        Tony.setFurColor();
    }
}