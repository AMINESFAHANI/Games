public class Test6 implements Cloneable {
    int a=9;
    String name = "mohammad";
    boolean x;

    @Override
    public String toString() {
        return "Test6{" +
                "a=" + a +
                ", name='" + name + '\'' +
                ", x=" + x +
                '}';
    }

    public static void main(String[] args) {
        Test6 t2=new Test6();
        Test7 t3=new Test7();
        t3.main1();
    }
public static class  Test7 {
    public void main1() {

        try {
            Test6 t = new Test6();
            Test6 t1 = null;
            t1 = (Test6) t.clone();
            t1.name = "ali";
            t.a=1000;
            System.out.println(t.toString());
            System.out.println(t1.toString());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        }

    }


}
