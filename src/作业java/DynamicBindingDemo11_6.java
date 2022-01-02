package 作业java;

public class DynamicBindingDemo11_6 {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());
    }
    public static void m(Object x){
        System.out.println(x.toString());
    }
}
class GraduateStudent extends Student{
	
}
class Person extends Object{
    @Override
    public String toString(){
        return "Person";
    }
}
class Student extends  Person{
    @Override
    public String toString(){
        return "Student";
    }
}
