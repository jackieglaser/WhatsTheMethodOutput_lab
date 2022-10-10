public class WhatsTheMethodOutput {

    final static short CENTURY = 2000;

    public static void main(String[] args) {

        int thisYear = 2010;
        int nextYear, thisMonth;

        nextYear = ++thisYear + CENTURY % 333;
        thisMonth = leap(nextYear, 28);
        System.out.println(thisYear + " " + nextYear + " " + thisMonth);

    }
        private static int leap(int february, double twentyNine) {

        double thisYear;

        thisYear = february + twentyNine/8;
        february = 2;
        System.out.println((thisYear + twentyNine));
        return((int)thisYear + february + (short)twentyNine);
        }
}
