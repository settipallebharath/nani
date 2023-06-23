package loops;
public class continuestatement
{
public static void main(String[] args)
{
int i=1;
while(true)
{
	System.out.println("i="+i);
i++;
if(i<=10)
	continue;
else
	break;
}
	}
}
