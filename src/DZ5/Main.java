package DZ5;

public class Main{
    public static void main(String[] args){
        StringArray manager=new StringArray();
        manager.addString("Hello"); manager.addString("World"); manager.addString("Java"); manager.addString("Programming");
        System.out.println("Max length string: "+manager.getMaxLengthString());
        System.out.println("Average length: "+manager.getAverageLength());}
}