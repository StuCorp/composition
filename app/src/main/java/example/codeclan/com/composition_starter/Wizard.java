package example.codeclan.com.composition_starter;

import behaviours.Flyable;
import behaviours.Protector;

public class Wizard implements Protector{
  String name;
  Broomstick broomstick;
  private Flyable ride;
  Protector protector;


  public Wizard(String name, Flyable ride, Protector protector){
    this.name = name;
    this.ride = ride;
    this.protector = protector;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride) {
    this.ride = ride;
  }

  public void setProtector(Protector protector) {
    this.protector = protector;
  }

  public String protectMe(){
    return protector.protect();
  }

  public String protect() {
    return "wizards protect their OWN kind! Go " + protector.getName() + "! " + protectMe();
  }
}