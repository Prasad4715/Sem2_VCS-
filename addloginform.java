public class ArrayEx {
    public static void main(String args[]) {
        int[] Engmarks = {99, 98, 97, 96}; 
        int[] Mathsmarks = {82, 86, 49, 74}; 
        Mathsmarks[2] = 78;

        System.out.println("Marks in English:");
        for (int i = 0; i < 4; i++) {
            System.out.println(Engmarks[i]);    
        }

        System.out.println("Marks in Maths:");
        for (int j = 0; j < 4; j++) {
            System.out.println(Mathsmarks[j]);    
        }
    }
}
