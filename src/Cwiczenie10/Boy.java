package Cwiczenie10;

    public class Boy extends Human{
        public static void main(String[] args) {
            Boy boy = new Boy();
            boy.eat();
            Human human = new Human();
            human.eat();

            Human humanBoy = new Boy();
            humanBoy.eat();

        }
        void eat()
        {
            System.out.println("BOY je");
        }
    }

