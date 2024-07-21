class Test
{
    public void main()
    {
        Student s1= new Student("Niteesh",19,"Male",9.2f,2,"CSE",'A');
        Student s2= new Student("KK",19,"Female",9.8f,2,"CSE",'E');
        Student s3= new Student("Ramu",19,"male",9.8f,2,"CSE",'F');
        
        Teacher T = new Teacher("Ma'am",49,"Male","CSE",new String[]{"ML paper on malware detection","Drift detection in malware"},"Professor");
        
        T.MarkAttendance(s1);
        T.MarkAttendance(s2);
        T.MarkAttendance(s3);
        T.MarkAttendance(s2);
    }
}