#include <iostream>
#include <cmath>
using namespace std;

int sum_r(int k)
{
	if (k>0)
	{
		return k+sum_r(k-1);

	}
	
	else
	{
		return 0;
	}


}	

int* inArray(int s)
{
	static int arr[5];
	
	for (int i = 0; i < s; ++i)
	{
		int a;
		cout << "enter a number: ";
		cin >> a;
		arr[i] = a;
	}

	return arr;
}

int linSearch(int* arr, int k)
{
	int i = 0;
	while (i<sizeof(arr))
	{
		cout << arr[i];
		if (arr[i] == k)
		{
			return i;
		}

		i++;
			
	}		
	
	
	
	return 0000;	 
	

}


int main()
{
	int* p;
	int s;
	cout << "enter size: ";
	cin >> s;
	p = inArray(s);
	for (int i = 0; i < s; i++)
	{
		cout << (*(p + i)) << " ";
	}
	cout << endl;
	
	cout << "what do you want to find: " << endl;
	int k;
	cin >> k;
	int r = linSearch(p,k); 
	if (r != 0000)
	{
		cout << k << " is located at index " << r <<endl;
	}
	
	else
	{
		cout << "not found!" <<endl; 
	}

	return 0;

}


