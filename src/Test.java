public class Test {
    public static void main(String[] args){
        double[] a = new double[15];
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for(int i = 0; i < a.length; i++ ){
            a[i] = (Math.random() * 40) - 20;
            System.out.println(a[i]);
            if (min > a[i]) {
                    min = a[i];
            }
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);

        if ( Math.abs(min) > Math.abs(max)) {
            System.out.println("Максимальное по модулю: " + min);
        } else {
            System.out.println("Максимальное по модулю: " + max);
        }
    }
}
