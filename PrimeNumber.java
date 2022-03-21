package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Prime =13;
boolean flag=false;

for(int i=2;i<=Prime/2;i++) {
	
	if(Prime%i == 0) {
		flag=true;
		break;
	}
}
if(!flag)
{
	System.out.println(Prime  +  "Prime");
	
}
else 
{
	System.out.println(Prime + "Not a Prime");
}


	}

}
