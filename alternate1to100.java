class alternate1to100{
	
static boolean isEvenOddForm(String s)
{
	int n = s.length();
	for(int i = 0; i < n; i++)
	{
	if (i % 2 == 0 && s.charAt(i) % 2 != 0)
		return false;
	if (i % 2 == 1 && s.charAt(i) % 2 != 1)
		return false;
	}
	return true;
}

static boolean isOddEvenForm(String s)
{
	int n = s.length();
	for(int i = 0; i < n; i++)
	{
	if (i % 2 == 0 && s.charAt(i) % 2 != 1)
		return false;
	if (i % 2 == 1 && s.charAt(i) % 2 != 0)
		return false;
	}
	return true;
}

static boolean isAlternating(int n)
{
	String str = Integer.toString(n);
	return (isEvenOddForm(str) ||
			isOddEvenForm(str));
}

public static void main(String[] args)
{
	
	int N = 129;

	if (isAlternating(N))
		System.out.println("Yes");
	else
		System.out.println("No");
}
}




