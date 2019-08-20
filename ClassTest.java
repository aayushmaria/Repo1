import java.util.*;
class ClassTest{
         int saving;
        public void setSaving(int a){
            saving = a;
        }
        public void getSaving(){
            System.out.println(saving);
        }
        public void checkSaving(){
            if(saving>1000){
                System.out.println("Amount is enough");
            }
           else if(saving==1000){
                System.out.println("Amount is enough");
            }
            else{
                System.out.println("insufficient amount");
            }
        }
        public static void main(String[] args){
            ClassTest x = new ClassTest();
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            x.setSaving(a);
            x.getSaving();
            x.checkSaving();
        }

}