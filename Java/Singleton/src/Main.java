public class Main {
    public static void main (String[] args) {
        MakeACaptain captain = MakeACaptain.getCaptain();
        MakeACaptain captain1 = MakeACaptain.getCaptain();




        /*System.out.println(captain.hashCode());
        System.out.println(System.identityHashCode(captain1));*/
        System.out.println(captain);
        System.out.println(captain1);
    }
}
