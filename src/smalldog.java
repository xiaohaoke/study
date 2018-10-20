public class smalldog extends Dog {
    private int cz=6;
    @Override
    void barking() {
        super.barking();
        System.out.println("zheshi noddf dfngfodgf ");
    }

    void hungry()
    {
        super.hungry();
        System.out.println("wo e le");
        super.barking();
    }


    void eat()
    {
        this.barking();
        System.out.println("                    ");
        super.barking();
    }

    @Override
    void sleeping() {
        super.sleeping();
        System.out.println("我 要睡了");
    }

    @Override
    protected void cs() {
        super.cs();
        System.out.println("cd");
    }

    void cf()
   {
    f c=new f();
    c.f();

   }
   public int cz()
   {
      return cz;
   }



    public static void main(String[] args) {
        smalldog smalldog=new smalldog();
        Dog dog=new Dog();
        smalldog.barking();
        smalldog.hungry();
        smalldog.sleeping();
        smalldog.cs();
        and.c();
        smalldog.cg();
        smalldog.cf();
        System.out.println(smalldog.cz());
        System.out.println(dog.cz);

    }
}
