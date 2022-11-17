class TelephoneExchange
{
  float duration;
    TelephoneExchange (float duration)
  {
    this.duration = duration; 
  }
}
class ordinary extends TelephoneExchange
{
  int rate = 2;
    ordinary (float duration)
  {
    super (duration);
  }
  public void showBill ()
  {
    System.out.println ("Amount is :" + this.duration * rate);
  }
}

class urgent extends TelephoneExchange
{
  int rate = 5;
    urgent (float duration)
  {
    super (duration);
  }
  public void showBill ()
  {
    System.out.println ("Amount is :" + this.duration * rate);
  }
}

class lightning extends TelephoneExchange
{
  int rate = 10;
    lightning (float duration)
  {
    super (duration);
  }
  public void showBill ()
  {
    System.out.println ("Amount is :" + this.duration * rate);
  }
}

public class Demo4_4{
  public static void main (String[]args)
  {
    ordinary o1 = new ordinary (5);
      o1.showBill ();
  }
}