
public class Puppy {
    int puppyAge;
   public Puppy(String name)
    {
        System.out.println("小狗的名字:"+name);
    }

    public void setage(int age){
        puppyAge=age;
    }

    public int getAge()
    {
        System.out.println("小狗的年龄为"+puppyAge);
        return puppyAge;
    }

    public static void main(String[] args) {
        Puppy myPuppy =new Puppy("tommy");
        myPuppy.setage(2);
        myPuppy.getAge();
        System.out.println("变量值"+myPuppy.puppyAge);
    }

}
