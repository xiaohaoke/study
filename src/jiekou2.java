public class jiekou2 implements jiekoy,jie {
    @Override
    public void eat() {
        System.out.println("我吃了");
    }

    @Override
    public void sleep() {
        System.out.println("我睡了");
    }

    @Override
    public void c() {

    }

    @Override
    public void s() {
        System.out.println("dssfsdfdsfdsf");
    }

    @Override
    public void fg() {

    }

    public static void main(String[] args) {
        jiekou2 ji=new jiekou2();
        ji.eat();
        ji.sleep();
    }
}