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


int* bubbleSort(int* array)
{
	for (int i = 0; i < sizeof(array); i++)
	{
		for (int j = 0; j < sizeof(array); j++)
		{
			if (array[i]>array[j])
			{
				array[i] = array[j];
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

int* splitArray(int* arr,int startIndex, int endIndex)
{
	endIndex +=1;
	vector <int> v(arr, arr+sizeof(arr));
	vector <int> v2(v.begin()+startIndex, v.begin() + endIndex); // 1 is the start of the split and 4 is the end
	
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

	int* p;
        p = inArray(5);
	cout << "unsorted array: " << endl;
	for (int i = 0; i<sizeof(p); i++)
	{
		cout << *(p + i) << " ";
	}
	cout << endl;
	
	bubbleSort(p);

	
	cout << "sorted array: " << endl;
	for (int i = 0; i<sizeof(p); i++)
	{
		cout << *(p + i) << " ";
	}
	cout << endl;

	

	return 0;

}


