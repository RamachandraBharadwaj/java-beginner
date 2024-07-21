class Shuriken
{
    int age;
    double salary;
    String name;
    int id;
    
    Shuriken(int age, double salary, String name, int id)
    {
        this.age=age;
        this.salary=salary;
        this.name=name;
        this.id=id;
    }
    
    public String toString()
    {
        return this.id+" "+this.name+" "+this.age+" "+this.salary;
    }
}