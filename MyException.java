class MyException extends Exception
string st;
MyException (String str)
{
Public String toString()
{
return("message="+str);
}
}
class CustomerException
{
public static void main(String[] args)
{
try
{
Throws new MyException("HELLO");
}
catch(MyException e)
{
System.out.println(e);
}
}
}
