class Employee
{
   int empId;
   String Name;
   double salary;
   
   Employee(int empId,String Name)
   {
       setEmpId(empId);
       setName(Name);
   }
   public double getSalary()
   {
       return this.salary;
   }
   
   public void setSalary(double salary)
   {
       this.salary=salary;
   }
   
   public int getEmpId()
   {
       return this.empId;
   }
   
   public void setEmpId(int empId)
   {
       this.empId=empId;
   }
   
   public String getName()
   {
       return this.Name;
   }
   
   public void setName(String name)
   {
       this.Name=name;
   }
}