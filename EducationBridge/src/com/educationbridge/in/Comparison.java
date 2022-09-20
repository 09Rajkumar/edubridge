
//Q2) Longest consecutive subsequence
package com.educationbridge.in;

import java.util.ArrayList;  
import java.util.Comparator;  
class Comparison implements Comparator<ArrayList<Integer>>  
{  
    public int compare(ArrayList<Integer> al1 , ArrayList<Integer> al2)  
    {     
        // frequency of element present in the list al1  
        int x1 = al1.get(0);          
        // frequency of element present in the list al2  
        int x2 = al2.get(0);  
        // index of the first occurrence of the element present in the list al1  
        int y1 = al1.get(1);  
        // index of the first occurrence of the element present in the list al2  
        int y2 = al2.get(1);          
        // if the frequency of occurrence of the elements do not   
        // match return the difference of x2 and x1  
        if(x1 != x2)  
        {  
           return x2 - x1;  
        }  
        // if the frequency of occurrence of the elements match   
        // return the difference of the indices of their first occurrence   
        else  
        {  
           return y1 - y2;  
        }  
    }  
}  
