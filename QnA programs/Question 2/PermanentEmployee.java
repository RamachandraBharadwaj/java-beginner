class PermanentEmployee extends Employee
{
    double basicPay;
    double HRA;
    int experience;
    
    PermanentEmployee(int empId,String Name,double basicPay, double HRA,int experience)
    {
        super(empId,Name);
        this.setBasicPay(basicPay);
        this.setExperience(experience);
        this.setHRA(HRA);
    }
    
    double getBasicPay()
    {
        return this.basicPay;
    }
    
    void setBasicPay(double basicPay)
    {
        this.basicPay=basicPay;
    }
    
    double getHRA()
    {
        return this.HRA;
    }
    
    void setHRA(double HRA)
    {
        this.HRA=HRA;
    }
    
    void setExperience(int experience)
    {
        if(experience<0)
        {
            System.out.println("ERR: incorrect number entered");
        }
        else
        {
            this.experience=experience;
        }
    }
    
    int getExperience()
    {
        return this.experience;
    }
    
    void calculateSalary()
    {
        double sal=0.0;
        double varComp=0.0;
        
        if(this.experience <3)
        {
            varComp=this.basicPay*(0/100);
        }
        else if(this.experience>=3 && this.experience<5)
        {
            varComp=this.basicPay*(5/100);
        }
        else if(this.experience>=5 && this.experience<10)
        {
            varComp=this.basicPay*(7/100);
        }
        else if(this.experience>=10)
        {
            varComp=this.basicPay*(12/100);
        }
        else
        {
            System.out.println("    ERROR IN experience value given     ");
        }
        
        sal=varComp+this.basicPay+this.HRA;
        super.salary=sal;
        
        System.out.println("Permanent employee");
        System.out.println("Your salary : "+sal);
    }

}