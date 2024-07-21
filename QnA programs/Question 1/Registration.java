class Registration
{
    String customerName;
    String panCardNumber;
    int voterId;
    String passportNumber;
    int lisenceNumber;
    long telephoneNumber[]= new long[2];
    Registration(String customerName,String passportNumber, long telephoneNumber[])
    {
        this.customerName=customerName;
        this.passportNumber=passportNumber;
        this.telephoneNumber=telephoneNumber;
        this.lisenceNumber=0;
        this.voterId=0;
        this.panCardNumber="";
    }
    Registration(String customerName,int lisenceNumber, String panCardNumber, long telephoneNumber[])
    {
        this.customerName=customerName;
        this.telephoneNumber=telephoneNumber;
        this.lisenceNumber=lisenceNumber;
        this.panCardNumber=panCardNumber;
        this.voterId=0;
        this.passportNumber="";
    }
    Registration(String customerName,int lisenceNumber, int voterId, long telephoneNumber[])
    {
        this.customerName=customerName;
        this.telephoneNumber=telephoneNumber;
        this.lisenceNumber=lisenceNumber;
        this.voterId=this.voterId;
        this.passportNumber="";
        this.panCardNumber="";
    }
     Registration(String customerName,String panCardNumber,int voterId, long telephoneNumber[])
    {
        this.customerName=customerName;
        this.telephoneNumber=telephoneNumber;
        this.lisenceNumber=0;
        this.panCardNumber=panCardNumber;
        this.voterId=voterId;
        this.passportNumber="";
    }
    public String getcustomerName()
    {
        return this.customerName;
    }
    public String getpanCardNumber()
    {
        return this.panCardNumber;
    }
    public int getvoterId()
    {
        return this.voterId;
    }
    public String getpassportNumber()
    {
        return this.passportNumber;
    }
    public long[] gettelephoneNumber()
    {
        return this.telephoneNumber;
    }
    public void printDetails()
    {
        System.out.println("Your details : ");
        if(this.customerName!="")
        {
            System.out.print("Customer Name : ");
            System.out.println(this.customerName);
        }
        if(this.panCardNumber!="")
        {
            System.out.print("Pan Card Number : ");
            System.out.println(this.panCardNumber);
        }
        if(this.voterId!=0)
        {
            System.out.print("Voter Id : ");
            System.out.println(this.voterId);
        }
        if(this.passportNumber!="")
        {
            System.out.print("Passport Number : ");
            System.out.println(this.passportNumber);
        }
          if(this.lisenceNumber!=0)
        {
            System.out.print("lisence Number : ");
            System.out.println(this.lisenceNumber);
        }
        System.out.println("telephone Numbers : ");
        for(long i: telephoneNumber)
        {
            System.out.print(i);
        }
        System.out.println();
    }
}