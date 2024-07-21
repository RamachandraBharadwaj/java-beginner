class test1
{
    public void main()
    {
        Registration r = new Registration("kevin","MN9891N", new long[]{9452425421L,7676765252L});
        r.printDetails();
        System.out.println("*".repeat(50));
        
        Registration r2= new Registration("Julias",123,"PN7878",new long[]{2345615451L,6763562562L});
        r2.printDetails();
        System.out.println("*".repeat(50));
        
        Registration r3= new Registration("Jammy",765,45453,new long[]{2345615451L,6763562562L});
        r3.printDetails();
        System.out.println("*".repeat(50));
        
        Registration r4= new Registration("Rose","PN8934",34356,new long[]{2241536249L,9846756223L});
        r4.printDetails();
        System.out.println("*".repeat(50));
    }
}