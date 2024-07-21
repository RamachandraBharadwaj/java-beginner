class TeamEventRegistration extends EventRegistration
{
    int noOfParticipants;
    int teamNo;
    
    TeamEventRegistration(String name, String nameOfEvent,int noOfParticipants, int teamNo)
    {
        super(name,nameOfEvent);
        this.setNoOfParticipants(noOfParticipants);
        this.setTeamNo(teamNo);
    }
    
    public int getNoOfParticipants()
    {
        return this.noOfParticipants;
    }
    
    public void setNoOfParticipants(int noOfParticipants)
    {
        this.noOfParticipants=noOfParticipants;
    }
    
    public int getTeamNo()
    {
        return this.teamNo;
    }
    
    public void setTeamNo(int teamNo)
    {
        this.teamNo=teamNo;
    }
    
    @Override
    public void registerEvent()
    {
        double fee;
        String opt=super.nameOfEvent;
        System.out.println("Team No. : "+this.getTeamNo());
        if(opt.equals("ShakeALeg"))
        {
            fee=50*this.getNoOfParticipants();
            super.registrationFee=fee;
            System.out.println("Your fee : Rs. "+super.registrationFee);
        }
        else if(opt.equals("Sing&Win"))
        {
            fee=60*this.getNoOfParticipants();
            super.registrationFee=fee;
            System.out.println("Your fee : Rs. "+super.registrationFee);
        }
        else if(opt.equals("PlayAway"))
        {
            fee=100*this.getNoOfParticipants();
            super.registrationFee=fee;
            System.out.println("Your fee : Rs. "+super.registrationFee);
        }
        else if(opt.equals("Actathon"))
        {
            fee=80*this.getNoOfParticipants();
            super.registrationFee=fee;
            System.out.println("Your fee : Rs. "+super.registrationFee);
        }
        else
        {
            System.out.println("Wrong option entered for events !");
        }
    }
}