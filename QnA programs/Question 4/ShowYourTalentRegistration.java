class ShowYourTalentRegistration
{
    public void main()
    {
        SingleEventRegistration p1 = new SingleEventRegistration("Jenny","Sing&Win",1);
        p1.registerEvent();
        
        SingleEventRegistration p2 = new SingleEventRegistration("Hudson","PlayAway",2);
        p2.registerEvent();
        
        TeamEventRegistration t1 = new TeamEventRegistration("Aura","ShakeALeg",1,5);
        t1.registerEvent();
        
        SingleEventRegistration p3 = new SingleEventRegistration("Ramachandra Bharadwaj","PlayAway",125);
        p3.registerEvent();
    }
}