package com.fuguclub.javaproject;

import java.util.ArrayList;

public class PrimeNumber {

    public void find(int n) {
        boolean[] ns = new boolean[(n + 1)];

        ns[0] = true;
        ns[1] = true;

        for(int i = 2; i < Math.sqrt(n); i++) {
            if(!ns[i]) {
                for(int j = i*i; j <= n; j+=i) {
                    ns[j] = true;
                }
            }
        }
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        for(int k = 0; k < ns.length; k++) {
            if(!ns[k]) {
                primeNumbers.add(k);
            }
        }
        System.out.println(primeNumbers);
    }


}
