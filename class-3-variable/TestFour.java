class Test{
    int a=10;
    int b=20;
    static int c=30;
    public static void main(String[] args) {
        Test t1=new Test();
        Test t2=new Test();
        System.out.println(t1.a+t2.b+c);//60
        System.out.println(t2.a+t1.b+Test.c);//60
        t2.a=20;
        System.out.println(t2.a+t1.a+t1.c);//60
        t1.c=31;
        System.out.println(t1.a+t2.b+c);//61
    }
}