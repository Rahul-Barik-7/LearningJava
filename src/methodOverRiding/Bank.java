package methodOverRiding;

public class Bank {
	
	double roi()
	{
		return 0;
	}
}

class HDFC extends Bank
{
	double roi()
	{
		return 10.5;
	}
}

class SBI extends Bank
{
	double roi()
	{
		return 20.50;
	}
}


