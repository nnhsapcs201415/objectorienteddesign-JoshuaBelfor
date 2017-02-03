/**
* Write a description of class BillFoldTester here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class BillFoldTester extends Card
{
  public static void main(String [] args)
  {
      CallingCard callCardTest = new CallingCard("Test","1Q2W3E",1234);
      DriverLicense driveTest = new DriverLicense("DriveTest",2000);
      
      BillFold billFoldTest = new BillFold();
      billFoldTest.addCard(callCardTest);
      billFoldTest.addCard(driveTest);
      
      System.out.println(billFoldTest.formatCards());
  }
}