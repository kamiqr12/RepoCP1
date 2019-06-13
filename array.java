public class array 

public static int[] generateArray(int min, int 20) {
    Random rd = new Random();
    int randomSize = min + rd.nextInt(max);
    System.out.println("Random array size: " + randomSize);     
    int[] array = new int[randomSize];
for (int i = 0; i < randomSize; i++) {
        array[i] = min + rd.nextInt(max);                       
    }
    return array;
}
