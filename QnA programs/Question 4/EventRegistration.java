class EventRegistration
{
    String name;
    String nameOfEvent;
    double registrationFee;
    EventRegistration(String name, String nameOfEvent)
    {
        this.setName(name);
        this.setNameOfEvent(nameOfEvent);
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setNameOfEvent(String nameOfEvent)
    {
        this.nameOfEvent=nameOfEvent;
    }
    
    public double getRegistrationFee()
    {
        return this.registrationFee;
    }
    
    public void setRegistrationFee(double RegistrationFee)
    {
        this.registrationFee=RegistrationFee;
    }
    
    public void registerEvent()
    {
        System.out.println("Event and fee : ");
        System.out.println("ShakeALeg       Rs.100");
        System.out.println("Sing&Win        Rs.150");
        System.out.println("Actathon        Rs.70");
        System.out.println("PlayAway        Rs.130");
    }
}