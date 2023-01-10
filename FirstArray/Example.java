public class Example{

    public static void main(String args[]){
        /*Declaring single String
        String firstWord = "Hello World";

        //Declaring a Static Array
        int numbers[] = new int[7]; //This stops at 6, because all arrays start at 0

        numbers[0] = 8;
        numbers[1] = 2;
        numbers[2] = 15;

        System.out.println(numbers[0]); //Will print 8
        System.out.println(numbers[5]); //Will print 0, as it is default
        //System.out.println(numbers[5]); will Compile Error*/

        int numbers[] = new int[500];
        for(int k =0; k < numbers.length; k++){
            numbers[k] = 6;
            System.out.println("Index: " + k + " Value: " + numbers[k]);
        }
    }
}