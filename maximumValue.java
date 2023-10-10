public class maximumValue {
    public static void main(String[] args) {
        int numbers[] = {30, 70, 20, 60, 60, 15};
        int max = numbers[0];

        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(max);
    }
}
