class EmployeeRecords
{
    public static void main()
    {
        PermanentEmployee pe = new PermanentEmployee(101,"Anil",10000,1500,3);
        ContractEmployee ce = new ContractEmployee(102,"Ramachandra",100000,8);
        pe.calculateSalary();
        ce.calculateSalary();
        
    }
}