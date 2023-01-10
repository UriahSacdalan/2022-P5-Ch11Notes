import java.util.Random;
public class LinearSearch{
    static int numList[] = new int[1000];
    public static void main(String args[]){
        setupList();
        displayList();
        System.out.println();

        int location = linearSearch(22);
        if(location != -1){
            System.out.println("Your desired value is stored at:" + location);
        }
        else{
            System.out.println("You made an oopsie... The number you entered is not in the list.");
        }
    }
    public static int linearSearch(int lookup){
        for (int search = 0; search < numList.length; search++){
            if(numList[search] == lookup){
                return search;
            }
        }
        return -1;
    }
    public static void setupList(){
        Random rand = new Random(1234);
        for(int index = 0; index < numList.length; index++ )
            numList[index] = rand.nextInt(1000);
    }
    public static void displayList(){
        for(int display = 0; display < numList.length; display++)
            System.out.print(numList[display] + " ");
    }
}

