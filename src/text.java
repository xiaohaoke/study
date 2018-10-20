public class text {
    String name;
    Employee employee = new Employee();
    int d;
    public text() {
        employee.empAge(5);
        employee.em();

    }

    public void text2()
    {
        int a=30;
        employee.sm(a);
        d=employee.emp();
        System.out.println("值为"+employee.emp());
        System.out.println(d);
    }


    public static void main(String[] args) {
        text text=new text();
        text.text2();

    }




}
