public class Ooop{
    public static void main(String[] args) {
        person person1 =new person ();
        person1.name="Ram";
        person1.age=12;
        person1.gender='M';

        System.out.println(person1.name);
        person1.introduction();

//Task create two object of person and call introduction function
    person person2=new person();
    person2.name="santosh";
    person2.age = 18;
    person2.gender='M';

    System.out.println(person2.name);
   person2.introduction();

   person person3=new person();
    person3.name="deepak";
    person3.age = 19;
    person3.gender='M';

    System.out.println(person3.name);
   person3.introduction();

   Rectangle rec1=new Rectangle ();
   rec1.length=10;
   rec1.breadth =90;
   int areaRec1 = rec1.areaOfRectangle();
   System.out.println("Area of rec1 is" + areaRec1);

   car car1=new car();
   car1.name="BMW";
   car1.color="Red";
   car1.year=2016;
   car1.start();


   car car2=new car();
   car2.name="BYD";
   car2.color="Blak";
   car2.year=2020;
   car2.stop();


   car car3=new car();
   car3.name="Audi";
   car3.color="yellow";
   car3.year=2015;
   int car3Expire = car3.expiry();
   System.out.println("Car 3 expires in " + car3Expire);


   
    }
    
}
 class car {
    String name;
    String color;
    int year;
    void start(){
        System.out.println(name + " is  starting");
    

    }
    void stop(){
        System.out.println(name + " is stop");

    }
    int expiry(){
        return year + 100;
    }


 }
   class Rectangle{
    int length ;
    int breadth;
    int areaOfRectangle(){
        int area = length * breadth;
        return area;
    }
   }

  class person{
    String  name ;
    int age ;
    char gender;
 
    void introduction (){
        System.out.println("Name:"+name+"Age:"+age +"gender:"+gender);

    }
  }

class student{
    String firstName;
    String lastName;
    int studentId;
    int age;

    String fullName(){
        return firstName +lastName;
    }
    void description(){
        System.out.println(fullName()+studentId);
    }
    boolean overEighteen(){
        return age>18; 
    }
    

}
