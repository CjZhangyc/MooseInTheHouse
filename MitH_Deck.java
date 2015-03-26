import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class MitH_Deck(){
    
  //58 Cards (array of card class) (medium / necessary)
  //20 empty room cards (5 each living room, kitchen, bedroom, bathroom)
  //20 full room cards (5 each as above)
  //10 There’s a Moose in the House cards
  //5 Door cards
  //3 Moose trap cards
  int[] AllCards=new int[58];  //All Cards
  
  int[] eLivingRoom=new int[5]; //5 each for emptyRooms
  int[] eKitchen=new int[5];
  int[] eBedRoom=new int[5];
  int[] eBathRoom=new int[5];
  
  int[] fLivingRoom=new int[5]; //5 each for fullRooms
  int[] fKitchen=new int[5];
  int[] fBedRoom=new int[5];
  int[] fBathRoom=new int[5];
  
  int[] MithCards=new int[10];  //otherCards    
  int[] DoorCards=new int[5];
  int[] MooseTrapcards=new int[3];
  
  Scanner scanner-new Scanner System.in;
  
  public void draw(){ //not sure if its type is void.
    Random rand=new Random();
    int randNum = rand.nextInt(57);
    
    int a=AllCards[randNum];
    AllCards[randNum].remove;
    
    return;
  }
  
  public shuffle(){
  }
  
  public numCards(){
  }
 
  public reset(){
  }
  
  public removeMitH(){
  }

}
