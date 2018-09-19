package com.algorithms.part1.uf;

public class QuickUnionUF {

	private int[] id;
	
	/*
	 * set of id of each object to itself
	 * (N array accesses)
	 */
	public QuickUnionUF(int n) {
		id = new int[n];
		for(int i=0; i<id.length; i++)
			id[i] = i;
	}
	
	/*
	 * chase parent pointers until reach root
	 * (depth of i array accesses)
	 */
	private int root(int i) {
		while(id[i] != i)
			i = id[i];
		return i;
	}
	
	/*
	 * check of root of p and q are same
	 * (depth of p and q array accesses)
	 */
	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}
	
	/*
	 * change 'root of p' to point to 'root of q'
	 * (depth of p and q array accesses)
	 */
	public void union(int p, int q) {
		int proot = root(p);
		int qroot = root(q);
		id[proot] = qroot;
	}
	
}
