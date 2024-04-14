class Arm 
{
	public static void main(String[] args) 
	{
		int num=153;
		if(count(num))
		{
			System.out.println("arm strong");
		}else{
			System.out.println("not");
		}
	}
	public static boolean count(int num){
		int num1=num;
		int num2=num;
		int count=0;
		while (num!=0)
		{
			int rem=num%10;
			count++;
			num=num/10;
		}
		
		int exp=count;
		int sum=0;

		for (int i=1;i<=exp ;i++ )
		{
			int base=num1%10;
			sum=sum+power(base,exp);
			num1=num1/10;
			
		}
		if (sum==num2)
		{
			return true;
		}
		return false;

	}
	public static int power(int base,int exp){
		int res=1;
		for (int i=1;i<=exp;i++)
		{
			res=res*base;
		}
		return res;
	}
}
