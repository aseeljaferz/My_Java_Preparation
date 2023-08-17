//Question
// Given an array of N integers arr[] where each represents the maximum length of the jump that can be made forward from the element. This means 
//if arr[i] =x, then we can jump any distance y such that y <= x
//Find the minimum no of jumps to reach the end of the array(starting from the first element). If an element is 0, then you cannot move through that element

//Note: Return -1 if you can't reach the end of the array 

//Ex1:
//input
//N=11
//arr[]={1,3,5,8,9,2,6,7,6,8,9}
//output:3

//Explanation:
//First jump from 1st element to 2nd element with value 3. Now, from here we jump to 5th element with value 9, and from here we will jump to the last

//eg2:
//Input:
//N=6
//arr={1,4,3,2,6,7}
//op:2

package BetterTomorrow_tasks;

import java.util.*;

public class Jump {

	public static void main(String[] args) {

		int a[]={1,4,3,2,6,7};

        int i=0;
        int c=0;
        while(i<a.length-1){
            if(a[i]==0){
                System.out.print("-1");
                break;
            }
            int temp=a[i];
            i=temp+i;
            c++;
        }

     if(i>=a.length-1){
        System.out.print(c);
     }


	}

}

//1,4,3,2,6,7
