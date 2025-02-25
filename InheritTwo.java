//© A+ Computer Science
// www.apluscompsci.com

//inheritance example

import static java.lang.System.*;

class Monster
{
	private String myName;

	public Monster()
	{
		myName = "Monster";
	}

	public Monster( String name )
	{
		myName = name;
	}

	public String toString()
	{
		return "Monster name :: " + myName + "\n";
	}
}

class Witch extends Monster
{
	//how does Witch work if it has no code?



}

//make a new type of Monster
class Frankenstein extends Monster
{
}





public class InheritTwo
{
  public static void main ( String[] args )
  {
     Monster m = new Monster();
     System.out.println(m);

     Witch witch = new Witch("Honey");
     System.out.println(witch);

     Frankenstein frank = new Frankenstein();
     System.out.println(frank);

     //instantiate the new Monster!


  }
}