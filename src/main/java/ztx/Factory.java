package ztx;

public class Factory {
    public static ReflectTest.fruit getInstance(String ClassName){
        ReflectTest.fruit f=null;
        try{
            f=(ReflectTest.fruit)Class.forName(ClassName).newInstance();
        }catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }
}
