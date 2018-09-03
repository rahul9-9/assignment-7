import java.util.Scanner;
class human
{
void speak()
{
System.out.println("hello");	

}


}
class student extends human
{
void speak()
{
super.speak();
System.out.print("java");	

}
}
class mainsuper
{
public static void main(String[] args)
{
 student s=new student();
 s.speak();


}
}