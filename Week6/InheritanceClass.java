import java.net.Socket;

public class InheritanceClass{
    public static void main(String[] args) {
        ChildClass cc= new ChildClass();
        cc.lastname="Oli";
        cc.firstname="Santosh";
        cc.info();
        cc.greet();

        GrandChild gc = new GrandChild ();
        gc.firstname ="Santosh";
        gc.middlename="OLI";
        gc.lastname="Oli2";  
        gc.info();
        gc.call();

        labarador lb= new labarador();
        lb.lifespan=10;
        lb.speaks();
        lb.legs =4;
        lb.fur();
        lb.diet="meat";
        lb.barks();
        
    }
}
class ParentClass{
    String lastname;
    private int salary;
    protected String address;
    void info (){
        System.out.println("Lastname:"+ lastname);
    }
}
//extends keywords used to create a child class
// single level, one parent has one chaild 
class ChildClass extends ParentClass{
    String firstname;
    void greet(){
        System.out.println("Firstname:"+firstname + "Lastname:"+lastname);
    }
}
//Multi level
class GrandChild extends ChildClass{
    String middlename;
    void call(){
        System.out.println(firstname+ "" +middlename + "" + lastname);
    } 
}
class animal{
    int lifespan;
    void speaks(){
        System.out.println("animal speals");

    }

}
class mammle extends animal{
    int legs;
    void fur(){
        System.out.println("it has fur");

    }
}
class reptial extends animal {
    int eggs;
    void shed(){
        System.out.println("reptile sheds its skin ");

    }
} 
class dog extends mammle{
    String diet;
    void barks(){
        System.out.println("dog barks");
    }
}
class Germanshepherd extends dog{
    
}
class labarador extends dog{

}

