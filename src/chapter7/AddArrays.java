package chapter7;

public class AddArrays {
//        int[] peoplesAge = {12, 32, 56, 78, 9, 59, 71};
//        int totalAge = 0;
//
//        for (int counter = 0; counter < peoplesAge.length; counter++) {
//            totalAge += peoplesAge[counter];
//        }
//        System.out.println(totalAge);
/*  pseudocode
    create the array
    initialize a total variable
    use a for loop from index 0 to the length of the array
    declare the total variable as [total plus the array]  perform total = total + array[counter].

* */


    public int addPeoplesAge(int[]peoplesAge) {
        int totalAge = 0;
        for (int counter = 0; counter < peoplesAge.length; counter++) {
            totalAge += peoplesAge[counter];
        }
        return totalAge;
    }
}
