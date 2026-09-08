class Test{
    int a=10;   //instance var
    static int b=20; //static/class var
    public static void main(String[] args) {
        System.out.println(b);
        System.out.println(Test.b);
        Test t1=new Test();
        System.out.println(t1.b);
    }
}