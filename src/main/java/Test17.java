public abstract  class Test17 {
    public int a=9;
    public String s="mohammad";

    public abstract void add();
    public void wr() {
        System.out.println("hello");
    }
      //  public Test17(){};

}
 abstract   class  B extends Test17{
    public B(){
        super();
    }

    public static void main(String[] args) {

//        B b=new B();
//        b.wr();
//        b.add();
//        System.out.println(b.a+b.s);
   }
    @Override
    public void add() {
        System.out.println( super.a);
    }
}