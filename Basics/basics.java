//package A2Z DSA SHEET;
//: Know Basic Maths
//1.Find GCD of two numbers
//brute force approach
public class basics {
    public static void main(String[] args) {
        int n1=9,n2=12;
        int gcd=1;
        for(int i=1;i<=Math.min(n1, n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;
            }
        }
        System.out.println(gcd);
    }
}
//better approach
public class basics {

    public static void main(String[] args) {
        int gcd=1;
        int n1=20;
        int n2=40;
        for(int i=Math.min(n1, n2);i>=1;i--){
          if(n1%i==0 && n2%i==0){
            gcd=i;
            break;
          }
        }
        System.out.println(gcd);
    }
}
//2.Print all Divisors of a given Number
// Step 1: Initialise an array to store the divisors.
// Step 2: Iterate from 1 to square root of n using a loop variable ‘i’. For each value of ‘i’:
// Check if ‘i’ is a divisor of ‘n’ by checking if ‘n’ is divisible by ‘i’ without a remainder (‘n’%i == 0).
// If i is a divisor, add it to the vectors of divisors.
// If i is different from n/i add the counterpart divisor n/i to the vector of divisors.

import java.util.ArrayList;

public class basics {

  public static void main(String[] args) {
    int n=36;
    ArrayList<Integer> divisor=finddivisor(n);
    for(int i:divisor){
      System.out.print(i+" ");
    }

  }
  public static ArrayList<Integer> finddivisor(int n){
    ArrayList<Integer> divisor=new ArrayList<>();
    for(int i=1;i<=Math.sqrt(n);i++){
      if(n%i==0){
        divisor.add(i);
       if(i!=n/i){
        divisor.add(n/i);
      }
     }
    }
    return divisor;
  }
}

// Basic Recursion
//Introduction to Recursion - 
//Understand Recursion by printing something N times
//What is Recursion?
// It is a phenomenon when a function calls itself indefinitely until aspecified condition is fulfilled.
//What is Stack Overflow in Recursion?
// Whenever recursion calls are executed, they’re simultaneously stored in a recursion stack where they wait 
// for the completion of the recursive function. A recursive function can only be completed if a base condition
// is fulfilled and the control returns to the parent function. But, when there is no base condition given for a 
// particular recursive function, it gets called indefinitely which results in a Stack Overflow .
public class basics {

    public static void main(String[] args) {
        print();
    }
    static int cnt=0;
    public static void print(){
        if(cnt==3)
         return;
         System.out.println(cnt);
         cnt++;
         print();
    }
}

//Print Name N times using Recursion
public class basics {
    public static void main(String[] args) {
        int n=4;
        printN(1, n);
    }
    public static void printN(int i,int n){
        if (i>n) {
            return;
        }
        System.out.print("komal"+" ");
        printN(i+1, n);
    }
}
//Print N to 1 using recursion
public class basics {

    public static void main(String[] args) {
        print(9);
    }
    public static void print(int n){
        int x=n;
        if(n==0){
            return;
        }

        System.out.println(n+" ");
        x--;
        print(n-1);
    }
}
//Sum of first N numbers
public class basics {

    public static void main(String[] args) {
        System.out.println(func(5));
    }
    public static int func(int n){
        if(n==0){
            return 0;
        }
        return n+func(n-1);
    }
}
//factorial of numbers
public class basics {

    public static void main(String[] args) {
        System.out.println(func(5));
    }
    public static int func(int n){
        if(n==0){
            return 1;
        }
        return n*func(n-1);
    }
}
//reverse the array
public class basics {
    static void printArray(int arr[], int n) {
        System.out.print("Reversed array is:- \n");
        for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
        }
     }
     //Function to reverse array using recursion
     static void reverseArray(int arr[], int start, int end) {
        if (start < end) {
           int tmp = arr[start];
           arr[start] = arr[end];
           arr[end] = tmp;
           reverseArray(arr, start + 1, end - 1);
        }
     }
     public static void main(String[] args) {
        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1};
        reverseArray(arr, 0, n - 1);
        printArray(arr, n);
     }
}

//Check if a string is palindrome or not
public class basics {
 public static void main(String[] args) {
    String s="madam";
    System.out.println(palindrome(0, s));
 }
 public static boolean palindrome(int i,String s){
    if(i>=s.length()/2) return true;
    if(s.charAt(i)!=s.charAt(s.length()-1-i)) return false;
    return palindrome(i+1, s);
 }
}
Fibonacci Number
public class basics {

   public static void main(String[] args) {
      System.out.println(fib(5));
   }
   public static int fib(int n){
      if(n<=1)return n;
      return fib(n-1)+fib(n-2);
   }
}

// basic Hashing
// Input: 
// 5
// 1 3 2 1 3
// 5
// 1 4 2 3 12
// Output: 
// 2
// 0
// 1
// 2
 // 0

import java.util.Scanner;
public class basics {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //precomputing
        int hash[]=new int[13];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
        int q=sc.nextInt();
        while (q--!=0) {
            int num=sc.nextInt();
            //fetching
        System.out.println(hash[num]);
        }
    }
}

//for chracter
// s=abcdabehf
// 5
// a
// g
// h
// b
// c
// Output: 2
// 0
// 1
// 2
// 1
import java.util.Scanner;
public class basics {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //precompute
        int hash[]=new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)-'a']++;
        }
        int q=sc.nextInt();
        while (q-->0) {
            char c=sc.next().charAt(0);
            System.out.println(hash[c-'a']);
        }
    }
}
//Code if the string contains both uppercase and lowercase:

import java.util.Scanner;

public class basics {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //precomputing 
        int hash[]=new int[256];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]++;
        }
        int q=sc.nextInt();
        while (q-->0) {
            char c=sc.next().charAt(0);
            System.out.println(hash[c]);
        }

    }
}

// How to hash large numbers like 109 or higher:

import java.util.HashMap;
import java.util.Scanner;

public class basics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // precomputing using hashmap
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;
            if (mp.containsKey(key)) freq = mp.get(key); // fetching from the map
            freq++;
            mp.put(key, freq); // inserting into the map
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            int num = sc.nextInt();
            if (mp.containsKey(num)) {
                System.out.println(mp.get(num));
            } else {
                System.out.println(0);
            }
        }

    }
}

//Count frequency of each element in the array
//brute force approach
public class basics {

    public static void main(String[] args) {
        int arr[]={2,10,4,5,5,10};
        int n=arr.length;
        countfreq(arr, n);
    }
    public static void countfreq(int arr[],int n){
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(visited[i]==true)
            continue;
            int count=1;
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }
            System.out.println(arr[i]+" " +"count is "+count);
        }
 }
}

//optimized approach

import java.util.HashMap;
import java.util.Map;

public class basics {

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 6, 7, 7, 10};
        int n = arr.length;
        frequencyprint(arr, n);
    }

    public static void frequencyprint(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // Traverse the map and print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}


// Input: arr[] = [2, 3, 2, 3, 5]
// Output: [0, 2, 2, 0, 1]
// Explanation: We have: 1 occurring 0 times,
//  2 occurring 2 times, 3 occurring 2 times, 
//  4 occurring 0 times, and 5 occurring 1 time.
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class basics {
    public static void main(String[] args) {
        int arr[]={2,3,5,2,3};
        System.out.println(frequencycount(arr));

    }
    public static List<Integer> frequencycount(int arr[]){
         List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
       for(int i:arr){
        map.put(i, map.getOrDefault(i,0)+1);
       }
       for(int i=1;i<=arr.length;i++){
        list.add(map.getOrDefault(i,0));
       }
       return list;
    }
}