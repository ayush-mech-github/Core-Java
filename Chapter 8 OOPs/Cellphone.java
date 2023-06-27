class Cellphone_Details{
    public void ring() {
        System.out.println("cellphone is ringing !");
    }
    public void vibrate() {
        System.out.println("cellphone is vibrating !");
    }
}
public class Cellphone {
    public static void main(String[] args){
      Cellphone_Details asus = new Cellphone_Details();
      asus.ring();
      asus.vibrate();
    }
}
