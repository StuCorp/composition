package example.codeclan.com.composition_starter;

import behaviours.Flyable;
import behaviours.Protector;

public class Dragon extends MythicalBeast implements Flyable, Protector {

  public Dragon(String name){
    super(name);
  }

  public String fly(){
    return "Standing up tall, beating wings, lift off!";
  }

  public String protect(){
    return "I'll save you, puny wizard, with the power of fire!";
  }

  public String getName(){
    return name;
  }


}