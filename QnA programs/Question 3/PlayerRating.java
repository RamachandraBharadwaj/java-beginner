class PlayerRating
{
    int playerPosition;
    String playerName;
    float criticOneRating;
    float criticTwoRating;
    float criticThreeRating;
    
    float averageRating;
    char category;
    
    PlayerRating(int playerPosition, String playerName)
    {
        this.playerPosition=playerPosition;
        this.playerName=playerName;        
    }
    
    public void calculateAverageRating(float criticOneRating, float criticTwoRating)
    {
        this.averageRating=((criticOneRating)+(criticTwoRating))/2.0f;
        
    }
    
    public void calculateAverageRating(float criticOneRating, float criticTwoRating,float criticThreeRating)
    {
        this.averageRating=((criticOneRating)+(criticTwoRating)+(criticThreeRating))/3.0f;
        
    }
    
    public void calculateCategory()
    {
        if(this.averageRating >8.0f)
        {
            this.category='A';
        }
        else if(this.averageRating>5.0f && this.averageRating <=8.0f)
        {
            this.category='B';
        }
        else if(this.averageRating>0.0f && this.averageRating <=5.0f)
        {
            this.category='C';
        }
        else
        {
            System.out.println("ERR : the ratings had abnormal values");
        }
 
    }
    
    public void display()
    {
        System.out.println("The player name is "+this.playerName);
        System.out.println("The player position is "+this.playerPosition);
        System.out.println("The average rating is "+this.averageRating);
        System.out.println("The category is "+this.category);
    }
}