class Counter
{
public  synchronized void calculate(int n)
{
for(int i=1;i<=10;i++)
{
System.out.println(n*i);
try
{
Thread.sleep(500);
}
catch(Exception e)
{
}
}
}
}
class T1 extends Thread
{
Counter c;
T1(Counter c)
{
this.c=c;
}
public void run()
{
c.calculate(17);
}
}
class T2 extends Thread
{
Counter c;
T2(Counter c)
{
this.c=c;
}
public void run()
{
c.calculate(18);
}
}
class SyncThread
{
public static void main(String args[])
{
Counter counter=new Counter();
T1 t1=new T1(counter);
T2 t2=new T2(counter);
t1.start();
t2.start();
}
}
