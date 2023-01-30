package com.gl.lab3.bstsum;

import java.util.HashSet;

public class FindSumPair {
	
	public Node insert(Node root, int key)
	
	{
		
		if(root ==null)
			
			return new Node(key);
		
		if(key< root.data)
			
			root.leftNode = insert(root.leftNode, key);
		
		else
		
		    root.rightNode = insert(root.rightNode, key);
		
		return root;
	}
	
	public boolean findpairUtil(Node root,int sum, HashSet<Integer> set)
	
	{
		if (root ==null)
			
			return false;
		
		if(findpairUtil(root.leftNode, sum, set))
			
			return true;
		
		if (set.contains(sum - root.data)) {
			
			System.out.println("Pair is found : (" + (sum - root.data) +"," +root.data +")");
			
			
			return true;
			
		}
		
		else
			
			set.add(root.data);
		
		   return findpairUtil(root.rightNode, sum, set);
		}
	
	  public void findPairWithGivenSum(Node root, int sum)
	  
	  {
		  HashSet<Integer> set = new HashSet<Integer>();
		  
		  if(!findpairUtil(root, sum, set))
			  
			  System.out.print("Pair do not exit"  +"\n");
			  
			  
		  
	  }
		
		
	}


