interface TVRemote{
    void SelectChannel();
}
interface SmartTVRemote extends TVRemote{
    void SpeakChannelName();  
}
class TV implements SmartTVRemote{
    @Override
    public void SelectChannel() {
        System.out.println("Enter the channel number");
    }
    @Override
    public void SpeakChannelName() {
        System.out.println("Speak channel name");
    }

}
public class TVRemoteClass {
    public static void main(String[] args) {
    TV sony =new TV();
    sony.SelectChannel();
    sony.SpeakChannelName();
    }
}
