class SingleEventRegistration extends EventRegistration
{
    int participantNo;
    SingleEventRegistration(String name, String nameOfEvent, int participantNo)
    {
        super(name,nameOfEvent);
        this.setParticipantNo(participantNo);
    }
    
    public void setParticipantNo(int participantNo)
    {
        this.participantNo=participantNo;
    }
    
    public int getParticipantNo()
    {
        return this.participantNo;
    }
    
    @Override
    public void registerEvent()
    {
        String opt=super.nameOfEvent;
        System.out.println("Partcipant Number : "+this.getParticipantNo());
        if(opt.equals("ShakeALeg"))
        {
            super.registrationFee=100;
            System.out.println("Your fee : Rs. "+super.registrationFee);
        }
        else if(opt.equals("Sing&Win"))
        {
            super.registrationFee=150;
            System.out.println("Your fee : Rs. "+super.registrationFee);
        }
        else if(opt.equals("PlayAway"))
        {
            super.registrationFee=130;
            System.out.println("Your fee : Rs. "+super.registrationFee);
        }
        else
        {
            System.out.println("Wrong option entered for events !");
        }
    }
}