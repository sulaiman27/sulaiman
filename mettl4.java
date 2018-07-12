package com.wipro.sum;
import java.util.*;
public class mettl4 {
	public static void main(String[] args) {
		String str,t,s="";
		Scanner in=new Scanner(System.in);
		str=in.next();
		int l=str.length();
		int i,j;
		for(i=0;i<l;i++){
			int k=Integer.parseInt(str.substring(i,i+1));
			if(k%2==0){
				while(k%2==0&&i!=l-1){
					t=Character.toString(str.charAt(++i));
					k+=Integer.parseInt(t);
				}
				s+=Integer.toString(k);                                                                                               
			}
			else{
				while(k%2!=0&&i!=l-1){
     			t=Character.toString(str.charAt(++i));
					k+=Integer.parseInt(t);
			}
				s+=Integer.toString(k);
			}
		}
		System.out.println(s);
		
	}		
	}


		
				
	
	


