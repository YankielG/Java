package Domowe_2;

public class Lists {
    private int listLength;
    private int[] initialList;
    private int[] revList;

    private ListManipulation(int listLengths) {

        this.listLength = listLengths;

        initialList = fillList(makeList());
        System.out.println("Initial list:");
        displayList(initialList);

        revList = revertList(fillList(makeList()));
        System.out.println("Reverted list:");
        displayList(revList);
    }


    private int[] makeList() {
        return new int[this.listLength];
    }

    private int[] fillList(int[] listForFill) {
        for (int i = 0; i < listForFill.length; i++) {
            listForFill[i] = i;
        }
        return listForFill;
    }

    private int[] revertList(int[] listForRevert) {
        int revertListIndex = 0;
        int[] revertedList = new int[listForRevert.length];
        for (int i = listForRevert.length - 1; i >= 0; i--) {
            revertedList[revertListIndex] = listForRevert[i];
            revertListIndex++;
        }
        return revertedList;
    }

    static void displayList(int[] listForDisplay) {
        for (int element : listForDisplay) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    private int[] getInitialList(){
        return this.initialList;
    }

    private int[] getRevertList(){
        return this.revList;
    }

    public static void main(String[] args) {
        ListManipulation lst = new ListManipulation(122);

        System.out.println();
        System.out.println("List can be extracted from object");
        int[] initial = lst.getInitialList();
        int[] revert = lst.getRevertList();

        System.out.println("initial List");
        ListManipulation.displayList(initial);
        System.out.println("reverted List");
        ListManipulation.displayList(revert);

    }
}
