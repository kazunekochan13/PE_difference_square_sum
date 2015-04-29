/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author Owner
 */
public class squareSum {
    
    public void ss() {
        int sumOfSquare = 0;
        int squareOfSum = 0;
        for (int i=1; i<101;i++){
            squareOfSum += i;
        }
        squareOfSum = squareOfSum*squareOfSum;
        for (int i=1; i<101; i++){
            sumOfSquare += i*i;
        }
        System.out.println(squareOfSum-sumOfSquare);
    }
    
    public static void main(String[] args){
        squareSum main = new squareSum();
        main.ss();
    }
}
