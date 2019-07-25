package lti;

public class InsufficientFundException extends Exception
{
public InsufficientFundException() {
	// TODO Auto-generated constructor stub
}
public InsufficientFundException(String errmsg) {
	super(errmsg);
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "InsufficientFundException [] :"+super.getMessage();
}


}
