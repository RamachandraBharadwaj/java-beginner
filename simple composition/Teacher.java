class Teacher extends Person
{
    String Department;
    String listOfPublications[];
    String Designation;
    Teacher(String Name,int age, String Gender,String Department,String[] listOfPublications, String Designation)
    {
        super(Name,age,Gender);
        this.Department=Department;
        this.listOfPublications=listOfPublications;
        this.Designation=Designation;
    }
    
    public void MarkAttendance(Student s)
    {
        if(s.present)
        {
            System.out.println(s.Name+" Already marked as present.");
        }
        else
        {
            s.present=true;
            System.out.println(s.Name+": attendance marked");
        }
    }
}