package Lab9;

public class RangeLister {
    int[] makeRange(int lower, int upper) {

        int[] range = new int[(upper - lower) + 1];
        for (int i = 0; i < range.length; i++) {
            range[i] = lower++;
        }

        return range;
    }

//    static void showRange(int[] range)
//    {
//        for(int i= 0; i<range.length;i++)
//        {
//            System.out.println(range[i]);
//        }
//    } MOJE rozwiązanie

    void showRange(int[] range)
    {
        System.out.print("Tablica : [");
        for (int e:range){
            System.out.print(e+ " ");

        }
        System.out.print("]");
    }



    public static void main(String[] args) {

        int[] range;
        RangeLister rangeLister = new RangeLister();
        range = rangeLister.makeRange(5, 7);
        rangeLister.showRange(range);
    }

}
