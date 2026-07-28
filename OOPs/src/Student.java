public class Student {
    // attributes
    public int id;
    public int age ;
    public String name;
    public int nos;

    // default constructor // attr.-> garbage

    public Student(){
        System.out.println("student default ctor Called");
    }
// parametrized ctor
   public Student(int id,int age ,String name , int nos ){
    System.out.println("student parametrized ctor Called");
    this.id=id;
    this.age = age;
    this.name = name;
    this.nos = nos;
}
// copy ctor
    public Student(Student srcobj ) { // A -> b
        System.out.println("student copy ctor Called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }

    // methods / behaviours
    public void study(){
        System.out.println(name + " Studying");
    }
    public void sleep(){
        System.out.println(name + " Sleeping");
    }
    public void bunk(){
        System.out.println(name + " Bunking");
    }




}
