/**
 *  See Readme.md for instructions.
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        new JerooGUI();
        runJerooCode();

    }

    /**
     * Put your main Jeroo code here.
     */
    public static void runJerooCode() {
       Jeroo kim = new Jeroo(3,4);
       kim.moveBackward();
    }

}
