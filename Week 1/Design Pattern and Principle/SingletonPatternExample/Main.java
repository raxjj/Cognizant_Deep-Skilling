public class Main {

    public static void main(String[] args) {


        Logger firstLogger =

                Logger.getInstance();


        Logger secondLogger =

                Logger.getInstance();


        if (firstLogger == secondLogger) {

            System.out.println(

                    "Only one Logger instance exists."
            );
        }

        else {

            System.out.println(

                    "Different instances created."
            );
        }

    }
}