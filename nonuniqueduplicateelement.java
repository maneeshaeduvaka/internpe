public class nonuniqueduplicateelement {
    public static void main(String args[]){
        int[] array = {1, 2, 5, 5, 6, 6, 7, 2};

        for (int i = 0; i < array.length; i++) {
            boolean dup = false;
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                dup = true;
                break;
                }
            }
            if (! dup) {
                System.out.println(array[i]);
            }
        }

    }
}
