#include<iostream>
#include<string.h>
using namespace std;
int main(){
    float a = 10.9;
    int i;
    for(i=6;i<=int(a);i=i+3){
        cout<<"i :"<<i+1<<endl;
    }
    cout<<(i==a);
    char c = 102;c++;
    ++c;
    cout<<c<<endl;
    char bb[]="String is funny";char bbb[]="Number is funny";
    strncat(bb,bbb,2);
    cout<<bb<<endl;
    strncpy(bbb,bb,3);
    cout<<bbb<<endl;
    cout<<strlen(bbb);
    cout<<"\n"<<strcmp(bb,strchr(bbb,'i'));
    return 0;
}
