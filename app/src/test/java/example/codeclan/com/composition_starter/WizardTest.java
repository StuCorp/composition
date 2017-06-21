package example.codeclan.com.composition_starter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

  Wizard wizard;
  Wizard wizard2;
  Broomstick broomstick;
  Dragon dragon;
  Wizard wizard3;
  MagicCarpet magicCarpet;
  Ogre ogre;

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    dragon = new Dragon("alfie");
    wizard = new Wizard("Toby", broomstick, dragon);
    wizard2 = new Wizard("loppie", dragon, dragon);
    magicCarpet  = new MagicCarpet("carpet colour");
    wizard3 = new Wizard("Gerda", magicCarpet, dragon);
    ogre = new Ogre("ford focus");
  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasBroomstick(){
    Broomstick ride = (Broomstick)wizard.getRide();
    assertEquals("Nimbus", ride.getBrand());
  }

  @Test
  public void canFly(){
    assertEquals(wizard.fly(),"mounting broom, running, skipping, flying!");
  }

  @Test
  public void canHasFlyDragon(){
    assertEquals("Standing up tall, beating wings, lift off!", wizard2.fly() );
  }

  @Test
  public void canHasFlyMagicCarpet(){
    assertEquals("Hovering up, straightening out, flying off!", wizard3.fly());
  }

  @Test
  public void canSetRide(){
    wizard.setRide(dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void canBeProtected(){
    assertEquals("I'll save you, puny wizard, with the power of fire!", wizard.protectMe());
  }

  @Test
  public void canSetProtector(){
    wizard.setProtector(ogre);
    assertEquals("I'll save you, puny wizard, with the power of being an ogre!", wizard.protectMe());
    wizard.setProtector(wizard2);
    assertEquals("wizards protect their OWN kind! Go alfie! I'll save you, puny wizard, with the power of fire!", wizard.protectMe());
  }


}