


class GenericClass
{
 
 
    public static <T extends Number> void printNumbers(T[] t)
    {
        for (int i = 0; i < t.length; i++)
        {
            System.out.println(t[i]);
        }
    }
}
 
public class BoundedType 
{
    public static void main(String[] args)
    {
 
        GenericClass.printNumbers(new Integer[] 
        {new Integer(10), new Integer(20), new Integer(30)} );
 
     
 GenericClass.printNumbers(new Double[] {
new Double(21.45), new Double(20.45), new Double(34.87)} );
     
}
}

