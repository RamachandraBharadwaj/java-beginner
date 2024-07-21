class Tester
{
    public void main()
    {
        PlayerRating pr = new PlayerRating(3,"Rama Bharadwaj");
        pr.calculateAverageRating(10.0f,9.0f);
        pr.calculateCategory();
        pr.display();
        
        System.out.println("*".repeat(100));
        
        
        PlayerRating pr2 = new PlayerRating(4,"Anurag Narsingoju");
        pr2.calculateAverageRating(9.0f,7.0f,10.0f);
        pr2.calculateCategory();
        pr2.display();
    }
}