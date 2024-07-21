class ContractEmployee extends Employee
{
    double wages;
    int hours;
    ContractEmployee(int empId,String Name,double wages,int hours)
    {
        super(empId,Name);
        this.setWages(wages);
        this.setHours(hours);
    }
    public double getWages()
    {
        return this.wages;
    }
    public void setWages(double wages)
    {
        this.wages=wages;
    }
    public int getHours()
    {
        return this.hours;
    }
    public void setHours(int hours)
    {
        this.hours=hours;
    }
    public void calculateSalary()
    {
        double sal=wages*hours;
        super.salary=sal;
        System.out.println("Contract Employee");
        System.out.println("Your Salary : "+sal);
    }
}