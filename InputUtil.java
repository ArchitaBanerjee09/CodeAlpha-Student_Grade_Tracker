public class InputUtil {
    private Scanner scanner;

    public InputUtil() {
        this.scanner = new Scanner(System.in);
    }

    public int readGrade() {
        return scanner.nextInt();
    }

    public String readName() {
        return scanner.next();
    }

    public void close() {
        scanner.close();
    }
}