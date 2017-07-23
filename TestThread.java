class corejava extends Thread
{
public void run()
{
System.out.println("core java finsihed");
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
}
}
}
class Advancejava extends Thread
{
public void run()
{
System.out.println("Advance java finshed");
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
}
}
}
class Framework extends Thread
{
public void run()
{
System.out.println("Framework finshed");
try
{
Thread.sleep(2000);
}
catch(Exception e)
{
}
}
}
class TestThread
{
public static void main(String []args) throws Exception
{
corejava  c=new corejava();
Advancejava a=new Advancejava();
Framework f=new Framework();
c.start();
a.start();
f.start();
a.join();
}
}
