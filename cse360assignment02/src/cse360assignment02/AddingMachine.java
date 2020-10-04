package cse360assignment02;

/**
* AddingMachine is the main class of this assignment.
* <p>
* It is responsible for adding and subtracting numbers and printing out its history.
* <p>
* @author jmwingo
*/
public class AddingMachine
{
  private int total;
  private String history; //String object to hold the transaction history
  
  /**
  * Constructor for AddingMachine object.
  * <p>
  * sets total to 0 and history to a String containing "0".
  * <p>
  */
  public AddingMachine ()
  {
    total = 0;  // not needed - included for clarity
    history="0 ";
  }
  
  /**
  * getTotal() returns the value of the total variable.
  * </p>
  * @return the calculated total
  */
  public int getTotal ()
  {
    return total; //return total instead of 0
  }
  
  /**
  * add() adds the parameter to the total.
  * <p>
  * also update history with this new transaction.
  * </p>
  * @param value the amount to be added to total
  */
  public void add (int value)
  {
    total+=value;
    history=history + "+ " + value + " ";
  }

  /**
  * subtract() subtracts the parameter from the total.
  * <p>
  * also update history with this new transaction.
  * </p>
  * @param value the amount to be subtracted from total
  */
  public void subtract (int value)
  {
    total-=value;
    history=history + "- " + value + " ";
  }
  
  /**
  * toString() returns the history of transactions.
  * </p>
  * @return a string holding the transaction history
  */
  public String toString ()
  {
    return history; //return history instead of an empty string
  }

  /**
  * clear() clears all transactions and memory.
  */
  public void clear()
  {
    total=0;
    history="0 ";
  }
}