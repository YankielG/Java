package Lab7;

public class Test {

    public static void main(String[] args) {

        int x = 5;

            int y = 7;
            y = y + x;

        if(x>0) {
            System.out.println("up");
        }
        else if (x == 0){
            System.out.println("zero");
        }
        else {
            System.out.println("down");
        }

        char grade = 'D';

                switch (grade){

                    case 'A':
                        System.out.println("ok");
                        break;

                    case 'B':
                        System.out.println("zle");
                        break;
                    default:
                        System.out.println("kara");
                        break;

        }


    }


}
