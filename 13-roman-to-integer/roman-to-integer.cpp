#include<map>
#include<iostream>
using namespace std;
class Solution {
public:
    int romanToInt(string s) {
     map<char,int>roman;
     roman.insert({'I',1});  
     roman.insert({'V',5});  
     roman.insert({'X',10});  
     roman.insert({'L',50});  
     roman.insert({'C',100});  
     roman.insert({'D',500});
     roman.insert({'M',1000});
     int ans=0;
     for(int i=0;i<s.size();i++){
        if(i==s.size()-1){
            ans+=roman[s[i]];
        }

        else if(roman[s[i]]>=roman[s[i+1]]){
            ans+=roman[s[i]];
        }

        else{
            ans-=roman[s[i]];
        }
     }
return ans;
    }
};