class constructorOverloading
{
public static void main(String args[])
{
Student s1=new Student();
System.out.println(s1.roll+""+s1.name+""+s1.section+""+s1.college+"\n");
Student s2=new Student("Ramu");
System.out.println(s2.roll+""+s2.name+""+s2.section+""+s2.college+"\n");
Student s3=new Student(1007,'A');
System.out.println(s3.roll+""+s3.name+""+s3.section+""+s3.college+"\n");
}
}
class Student
{
int roll;
String name,college;
char section;
//these all are instance variables.

Student()//default parameters
{}
Student(String name)
{}
Student(int roll,char section)
{}
}