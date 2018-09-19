package com.algorithms.part1.uf.bean;

public class UF {
	/*
	 * initialize union find data structure
	 * with N objects(0 to N-1)
	 */
	public UF(int n) {}
	
	/*
	 * add connection between p and q
	 */
	public void union(int p, int q) {}
	
	/*
	 * are p and q in the same component?
	 */
	public boolean connected(int p, int q) {
		return false;
	}
	
	/*
	 * component identifier for p(0 to N-1)
	 */
	public int find(int p) {
		return 0;
	}
	
	/*
	 * number of components
	 */
	public int count() {
		return 0;
	}

}
