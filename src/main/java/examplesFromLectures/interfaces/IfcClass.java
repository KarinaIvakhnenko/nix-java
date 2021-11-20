package examplesFromLectures.interfaces;

public class IfcClass implements Ifc1, Ifc2 {
    @Override
    public void run(){
        System.out.println("true = " + this.getClass().getSuperclass().getName());
    }
}
