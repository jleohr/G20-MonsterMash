//© A+ Computer Science
// www.apluscompsci.com

//inheritance super this example


class Monster
{
	private String myName;

	public Monster()
	{
		this("Monster");
	}

	public Monster( String myName )
	{
		this.myName = myName;
	}

	public void fun( )
	{
		System.out.println("Monster fun");
	}

	public String toString()
	{
		return myName + " ";
	}
}

class Skeleton extends Monster
{
   private double speed;

   public Skeleton(  )
   {
   	//super(); //super() call happens automatically
      speed=100;
   }

   public Skeleton( String name, double speed )
   {
      super(name);       //super refers to the parent object
      this.speed=speed;   //this seperates instance var from parameter
   }

   public void fun( )
   {
      System.out.println("Skeleton fun");
   }

   public void funtest( )
   {
      super.fun();  //calls Monster.fun()

      this.fun();   //calls Skeleton.fun()
   }

   public String toString()
   {
      return super.toString() + " " + speed;   //super refers to the parent object
   }
}

public class SuperThis
{
  public static void main ( String[] args )
  {
     Skeleton skelly = new Skeleton();
     System.out.println(skelly);

     skelly = new Skeleton("Bones",1002);
     System.out.println(skelly);

     System.out.println("");
     skelly.fun();

     System.out.println("");
     skelly.funtest();
  }
}