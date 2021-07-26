public class Test5 {

    public static void main (String args[]){
        String a="mohammad";
        String b=new String("mohammad");
        if((a.hashCode()==b.hashCode())){
            System.out.println("mohammad was wrong!"+a.hashCode());

        }else {
            System.out.println("amin is always wrong!!!!!"+b.hashCode()+"    "+a.hashCode());
        }
    }
}
