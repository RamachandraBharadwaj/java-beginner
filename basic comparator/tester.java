import java.util.*;
class tester
{
    public void main()
    {
        List <Shuriken> al = new ArrayList<>(Arrays.asList(
        new Shuriken(10,12500.0,"Rama",100),
        new Shuriken(19,15000.0,"Krishna",104),
        new Shuriken(12,9800.0,"Rama",102),
        new Shuriken(16,2400,"Mahesh",108),
        new Shuriken(13,25000,"Aaradhna",105)));
        
        System.out.println(al);
        
        for(Shuriken x: al)
        {
            System.out.println(x);
        }
        
        Comparator<Shuriken> cmp = Comparator.comparing((Shuriken s) -> s.id).thenComparing((Shuriken s) -> s.name).thenComparing((Shuriken s) -> s.salary);
        
        Collections.sort(al,cmp);
        
        System.out.println(al);
        
        
        for(Shuriken x: al)
        {
            System.out.println(x);
        }
    }
}