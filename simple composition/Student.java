class Student extends Person
{
    float cgpa;
    boolean present=false;
    int year;
    String Department;
    char section;
    Student(String Name,int age, String Gender, float cgpa, int year, String Department, char section)
    {
        super(Name,age,Gender);
        this.cgpa=cgpa;
        this.year=year;
        this.Department=Department;
        this.section=section;
    }
}