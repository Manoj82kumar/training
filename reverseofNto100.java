import java.util.*;

class reverseofNto100{

static void PrintReverseOrder(int N)
{

	for (int i = N; i > 0; i--)
		System.out.print( +i + " ");
}

public static void main(String[] args)
{
	int N = 100;

	PrintReverseOrder(N);
}
}

