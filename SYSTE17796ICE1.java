/* Name:  Usman Shahid
 * Assignment:  Exercise 1
 * Program: Object Oriented Programming 2 - Java
 * File : Shahiusm_Exercise 1

 * Calculate weather temp average
 */

package syste17796ice1;

/**
 *
 * @author usman
 */

public class SYSTE17796ICE1 {

    /**
     * @param args the command line arguments
     */

    //main method for printing average of temps
    public static void main(String[] args) {

//Array of 14 temps
        int[] temp2 = {20, 30, 40, 55, 25, 36, 40, 46, 50, 23, 26, 39, 41, 33};

        //calls out method and places array
        //average value is returned and printed
                System.out.println("The max of the temperature is " + calcMax(temp2));
        System.out.println("The average of the temperature is " + calcAvg(temp2));

    }

    //calcAvg method calculates average of temps
    //takes array from main method and passes values
    public static int calcAvg(int[] temp2) {

        //checks to see if temps >50 or temps <-50 as we don't need them
        for (int value = 0; value < temp2.length; value++) {

            if (temp2[value] > 50 | temp2[value] < -50) {

                //if value is present,it is removed
                temp2[value] = 0;
            }
        }

        int averageNumber = 0;

        //for loop to calculate sum of array
        for (int number : temp2) {

            averageNumber += number;
        }

        //returns sum and divided by 14 which  results in average of array
        return averageNumber / 14;
    }
 //calculates max temp
    public static int calcMax(int[] temp2) {

        //max temp value
        int tempMax = temp2[0];

        //for loop calculates max temp
        for (int val1 : temp2) {

            //takes greatest value of temp and assigns it
            if (val1 > tempMax) {
                tempMax = val1;
            }
        }


        //returns max value of temp
        return tempMax;
    }


    //end of program

    

   
}


    //end of program
