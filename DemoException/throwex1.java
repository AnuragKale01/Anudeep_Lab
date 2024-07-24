package DemoException;

public class throwex1 {

  public static void main(String args[])
  {
	  try {
		throw new ArithmeticException("/ Zero:");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
  }
}
