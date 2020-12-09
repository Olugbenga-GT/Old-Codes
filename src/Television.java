public class Television {
   private  String name;
   private int volume;
   private boolean isOn;
   private int currentChannel;

   public Television (String name, int currentChannel){
       this.name = name;
       this.currentChannel = currentChannel;
   }

   public String getName(){
       return name;
   }

   public void setName(String name){
       this.name = name;
   }

   public int getVolume(){
       return volume;

   }

   public void setVolume(int volume){
       if(volume >= 0 && volume <= 100){
       this.volume = volume;}
   }

   public boolean isOn(){
       return isOn;
   }

   public void setOn(boolean isOn){
       this.isOn = isOn;
   }

   public void increaseVolume() {
       if (volume >= 0 && volume < 100) {
           volume = volume++;

       }
   }

   public void decreaseVolume(){
       if (volume > 0 && volume <=100){
            volume = volume--;
       }
   }

   public void setChannel(int currentChannel) {
       if (currentChannel >= 0 && currentChannel <= 20) {
           this.currentChannel = currentChannel;
       }
   }
   public int getCurrentChannel(){
       return currentChannel;
   }

   public void nextChannel(){
       if (currentChannel >= 0 && currentChannel <= 20) {
           this.currentChannel = currentChannel++;

       }

       if(currentChannel == 20){
           currentChannel = 0;
       }
   }

    public void prevChannel(){
        if(currentChannel > 0 && currentChannel <= 20) {
            this.currentChannel = currentChannel--;
        }
    }

    public void mute(){
       if(volume > 0 && volume <= 100){
           volume = 0;
       }
    }
}
