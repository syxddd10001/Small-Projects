#include <iostream>
#include <cmath>
#include <vector>
#include <string>
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

void dump (vector<int> &v)
{
	for (vector<int> :: iterator it = v.begin(); it != v.end(); it ++)
	cout << *it << + " ";
}
int* inArray(int s)
{
	int* arr = new int[s];

	for (int i = 0; i < s; ++i)
	{
		int a;
		cout << "enter a number: ";
		cin >> a;
		arr[i] = a;
	}

	return arr;
}

int linearSearch(int* arr, int k)
{
	int i = 0;
	while (i<sizeof(arr))
	{
		if (arr[i] == k)
		{
			return i;
		}

		i++;			
	}		
	
	return 111111; // returns this if nothing is found 	

}

int binarySearch(int* arr, int k)
{
	
	if (sizeof(arr) == 0)
	{
		return 111111;
	}

	int mid = (sizeof(arr)-1)/2;
	if (arr[mid] == k)
	{
		return mid;
	}

	else
	{
		
		if (k > arr[mid])
		{
			return 1; 
		}


		return binarySearch(arr, k);
	}
}	


int* bubbleSort(int* array, int s)
{
	
	for (int i = 0; i <= s; ++i)
	{
		for (int j = i; j <= s; ++j)
		{
			if (array[i]>array[j])
			{
				int temp;
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				
			}		
		}	
	}
	return array;

}



void implementSearch()
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
	int r = linearSearch(p,k);
	if (r != 111111)
	{
		cout << k << " is located at index " << r <<endl;
	}
	
	else
	{
		cout << "not found!" <<endl; 
	}


}

void implementSort(int option)
{
	int* p;
	int s; 
	cout << "enter size: "; 
	cin >> s; 
    p = inArray(s);
	cout << "unsorted array: " << endl;
	for (int i = 0; i<s; ++i)
	{
		cout << *(p + i) << " ";
	}
	cout << endl;
	
	if (option == 0)
	{
		bubbleSort(p,s);
	}
	else
	{
		NULL;
	}
	cout << "sorted array: " << endl;
	for (int i = 0; i<s; ++i)
	{
		cout << *(p + i) << " ";
	}
	cout << endl;
}




int* splitArray(int* arr,int startIndex, int endIndex)
{
	endIndex +=1;
	vector <int> v(arr, arr+sizeof(arr));
	vector <int> v2(v.begin()+startIndex, v.begin() + endIndex); 

	dump(v);
	cout << endl;
	dump(v2);
	return arr; 	
}




int main()
{
	// implementSearch
	// splitArray
	// dump
	// linearSearch
	// inArray
	// implementSearch
	int g;
	cout << "option: " << endl;
	cin >> g;
	implementSort(g);

	return 0;
}


