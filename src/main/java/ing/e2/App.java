package ing.e2;

import java.util.Scanner;
import java.util.logging.Logger;

public class App
{
    static final Logger logger = Logger.getLogger(App.class.getName());
    static Scanner scanner = new Scanner(System.in);

    private static boolean goodPassword(String usuario, String password) {
        if(usuario.length() != password.length()) {
            return false;
        }

        for(int i = 0; i < usuario.length(); i++) {
            if(usuario.charAt(i) != password.charAt(usuario.length()-1-i)) {
                return false;
            }
        }

        return true;
    }

    private static boolean login() {
        logger.info("Usuario: ");
        String usuario = scanner.nextLine();

        logger.info("Contraseña: ");
        String password = scanner.nextLine();

        return goodPassword(usuario, password);
    }

    public static void main( String[] args )
    {
        if(!login()) {
            System.exit(1);
        }

        CentroManager centroManager = new CentroManager();

        while(true) {
            logger.info(
                "(0) Exit\n" +
                "(1) Partial #\n" +
                "(2) Complete #\n" +
                "(3) Centro #\n"
            );
            int action = scanner.nextInt();
            boolean exit = false;

            switch(action) {
                case 1:
                    logger.info(Integer.toString(centroManager.getPartialVaxxSize()));
                    break;

                case 2:
                    logger.info(Integer.toString(centroManager.getCompleteVaxxSize()));
                    break;

                case 3:
                    logger.info(Integer.toString(centroManager.getCentroSize()));
                    break;

                case 0:
                default:
                    exit = true;
                    break;
            }

            if(exit) {
                break;
            }
        }
    }
}

// vim: set et:
