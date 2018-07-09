package ztx;

public class ReflectTest {
    interface fruit{
        public abstract void eat();
    }

    class Apple implements fruit{
        public void eat(){
            System.out.println("Apple");
        }
    }

    class Orange implements fruit{
        public void eat(){
            System.out.println("Orange");
        }
    }

    static  class Factory{
        public  fruit getInstance(String ClassName){
            fruit f=null;
            try{
                f=(fruit)Class.forName(ClassName).newInstance();
            }catch (Exception e) {
                e.printStackTrace();
            }
            return f;
        }
    }
        public static   void main(String[] a){
            Factory factory=new Factory();
            fruit f=factory.getInstance("Apple");
            if(f!=null){
                f.eat();
            }
        }
}
