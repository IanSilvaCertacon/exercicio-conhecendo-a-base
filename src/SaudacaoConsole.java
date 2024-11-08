import java.io.Console;

public class SaudacaoConsole {
    public static void main(String[] args) {
        
        /*Console cons;
        char[] name;
        if ((cons = System.console()) != null &&
        (name = cons.readName("[%s]", "Olá, ")) != null) {
        ...
        java.util.Arrays.fill(name, ' ');
        */

        Console cons;
        char[] passwd;
        if ((cons = System.console()) != null &&
            (passwd = cons.readPassword("[%s]", "Password:")) != null) {
            
            java.util.Arrays.fill(passwd, ' ');
        }
        
    }

    }

