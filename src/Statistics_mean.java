public class Statistics_mean {
    public static void main (String[] args){
        int MyNum []= { 2,5,5,9,4,7,0,9,6,11,12};
        int sum =0;
        double mean;
        for (int i=0; i< MyNum.length; i++){
            sum += MyNum[i];
        }
        mean = (double) sum / MyNum.length;
        System.out.print("Mean " + mean);
    }
}
