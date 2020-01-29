package Domowe_2;

public class Tree {
    private ChristmasTree(){
        printTree(christmasTreeCreator(18));
    }

    private ChristmasTree(int christmasTreeHeight) {
        printTree(christmasTreeCreator(christmasTreeHeight));
    }

    private String[][] christmasTreeCreator(int christmasTreeHeight) {
        String[][] christmasTree = new String[christmasTreeHeight][christmasTreeHeight + christmasTreeHeight-1];
        composeTreeFromStringElements(christmasTree);
        return christmasTree;
    }

    private void composeTreeFromStringElements(String[][] InputTreeList) {
        for(int i=0; i < InputTreeList.length; i ++){
            for(int j=0; j < InputTreeList[i].length; j++){
                InputTreeList[i][j] = " ";
                if (i==0){
                    if (j==InputTreeList.length - 1){
                        InputTreeList[i][j] = getRandomElement();
                    }
                } else if (i == InputTreeList.length-1){
                    InputTreeList[i][j] = getRandomElement();
                } else {
                    if ((j >= InputTreeList.length -1 - i) && (j <= InputTreeList.length -1 + i )){
                        InputTreeList[i][j] = getRandomElement();
                    }
                }
            }
        }
    }

    private String getRandomElement(){
        String[] list = {"+", ".", "*", "~", "^", "o"};
        Random rand = new Random();
        return list[rand.nextInt(list.length -1)];
    }

    private void printTree(String[][] treeList) {
        for (int i = 0; i < treeList.length; i++) {
            for (int j = 0; j < treeList[i].length; j++) {
                System.out.print(treeList[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        ChristmasTree choinka = new ChristmasTree(29);
        ChristmasTree choinka18 = new ChristmasTree();

    }
}
