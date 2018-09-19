package com.algorithms.part1.uf;

public class QuickFindUF {

	private int[] id;
	
	/*
	 * set id of each object to itself
	 * (N array accesses)
	 */
	public QuickFindUF(int n) {
		id = new int[n];
		for(int i=0; i<n; i++)
			id[i] = i;
	}
	
	/*
	 * check whether p and q are in the same component
	 * (2 array access)
	 */
	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}
	
	/*
	 * change all entries with id[p] to id[q]
	 * (at most 2N+2 array access)
	 */
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for(int i=0; i<id.length; i++)
			if(id[i] == pid)
				id[i] = qid;
	}
	
}
