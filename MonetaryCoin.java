public class MonetaryCoin extends Coin
{
  public double value;
  public String name;
  public MonetaryCoin (String name, double value)
  {
    this.name = name;
    this.value = value;
  }//end MonetaryCoin
  public double sum()
  {
    return value;
  }//end sum
  public void printValue()
  {
    System.out.println("A " + name + " is worth: " + value + ".");
  }//end printValue
}//end MonetaryCoin