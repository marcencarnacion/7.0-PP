//Marc Encarnacion
//7.0 PP
//2/18/21
class Main 
{
  public static void main(String[] args) 
  {
    System.out.println("Marc Encarnacion, 7.0 PP");
    MonetaryCoin quarter = new MonetaryCoin("quarter", 0.25);
    MonetaryCoin dime = new MonetaryCoin("dime", 0.10);
    MonetaryCoin nickel = new MonetaryCoin("nickel", 0.05);
    quarter.printValue();
    dime.printValue();
    nickel.printValue();
    System.out.print("A quarter and dime are equal to: ");
    System.out.println(quarter.sum() + dime.sum());
    
    final int NUM_FLIPS = 1000;
    int heads = 0, tails = 0;
    for (int count = 1; count <= NUM_FLIPS; count++)
      {
          quarter.flip();
          
          if (quarter.isHeads())
            heads++;
          else 
            tails++;
      }
      
      System.out.println("The number of quarter flips: " + NUM_FLIPS);
      System.out.println("The number of heads (quarter): " + heads);
      System.out.println("The number of tails (quarter): " + tails);
  }//end main method
}//end main class