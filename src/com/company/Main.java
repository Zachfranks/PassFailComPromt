package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //global variubles

        double sumWeight = 0;
        double numStudents = 0;
        int pass = 0;


            //scanner to read what the user is entering
            Scanner weightReader = new Scanner(System.in);
            Scanner studentReader = new Scanner(System.in);
            Scanner markReader = new Scanner(System.in);


            ArrayList<Double> arrayListWeight = new ArrayList<Double>();


            System.out.println("Add the weights in th line under make sure the numbers add up to 100. \n enter 'Done' when finished");

        while (weightReader.hasNextDouble()) {
            double x = weightReader.nextDouble();
            arrayListWeight.add(x);
        }

            System.out.println("the weights are" + arrayListWeight);

            for (int i = 0; i < arrayListWeight.size(); i++) {
                sumWeight = sumWeight + arrayListWeight.get(i);
            }

            System.out.println("how many students are in the class");

            numStudents = studentReader.nextInt();


                System.out.println("Enter the marks for each students");

                for (int j = 0; j < numStudents; j++) {
                    double sum = 0;
                    for (int k = 0; k < arrayListWeight.size(); k++) {
                        double x = markReader.nextDouble();
                        sum = sum + x * arrayListWeight.get(k) / 100.;
                    }
                    System.out.println(sum);
                    if (sum >= 50.) {
                        pass++;
                    }
                }
                System.out.println(pass + " passed");

    }
}
