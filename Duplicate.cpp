#include<iostream>
#include<set>
using namespace std;

int dupl(int arr[],int n)
{
    set<int> s;
    for(int i=0;i<n;i++)
    {
        s.insert(arr[i]);

    }
    int j=0;
    int k=s.size();
    auto it = s.begin();

    while(j<k)
    {
        arr[j]=*it;
        j++;
        it++;
    }
    

    return k;


}

int main()
{
    int arr[]={1,2,3,3,3,4,4,5,6};
    int n=sizeof(arr)/sizeof(arr[0]);
    int ans=dupl(arr,n);
    cout<<"ARray after removing duplicates:";
    for(int i=0;i<ans;i++)
    {
        cout<<arr[i]<<" ";
    }
}