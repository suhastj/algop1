package com.algorithms.part1.test;

import java.util.Scanner;

import com.algorithms.part1.uf.bean.UF;

public class TestClient {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		UF uf = new UF(n);
		while(stdIn.hasNext()) {
			int p = stdIn.nextInt();
			int q = stdIn.nextInt();
			if(!uf.connected(p, q)) {
				uf.union(p, q);
				System.out.println(p + " " + q);
			}
		}
		stdIn.close();
	}

}
