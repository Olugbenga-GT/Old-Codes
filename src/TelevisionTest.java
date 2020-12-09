import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television("SAMSUNG", 10);

        System.out.printf("%s TV is on. Your current Channel is: %d %n%n ",
                           myTv.getName(), myTv.getCurrentChannel() );
        System.out.println("Select your preferred option.");

        System.out.println( "1. Switch off \n" +
                            "2. Next Channel \n" +
                            "3. Previous Channel \n" +
                            "4. Increase Volume \n" +
                            "5. Decrease Volume \n" +
                            "6. Mute TV \n");

        Scanner options =  new Scanner(System.in);
             int pressed = options.nextInt();
             if (pressed == 1){
                    myTv.setOn(false);
        System.out.println("TV Switched Off");
                }
              else if(pressed == 2){
                      myTv.nextChannel();
        System.out.printf("Your current Channel is: %d", myTv.getCurrentChannel());
                  }
             else if(pressed == 3){
                      myTv.prevChannel();
        System.out.printf("Your current Channel is: %d", myTv.getCurrentChannel());
                  }
             else if (pressed == 4){
               myTv.increaseVolume();
        System.out.printf("Volume: %d", myTv.getVolume());
             }
             else if (pressed == 5){
                 myTv.decreaseVolume();
        System.out.printf("Volume: %d", myTv.getVolume());
             }
             else if (pressed == 6){

                 myTv.mute();
        System.out.printf("Volume: %d", myTv.getVolume());
             }
             else{
        System.out.println("Invalid Selection. Please select options 1 - 6");
             }


    }
}

