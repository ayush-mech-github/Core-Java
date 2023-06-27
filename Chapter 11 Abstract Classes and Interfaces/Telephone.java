abstract class TelephoneFunctions{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends TelephoneFunctions{
    public void ring(){
        System.out.println("ringing...");
    }
    public void lift(){
        System.out.println("lifting...");
    }
    public void disconnect(){
        System.out.println("disconnecting...");
    }

}
public class Telephone {
    public static void main(String[] args) {
        SmartTelephone asus = new SmartTelephone();
        asus.disconnect();
        asus.ring();
        asus.lift();
        
    }
}
