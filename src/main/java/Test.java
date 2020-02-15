import ciphers.impl.CesarCipherMarek;

public class Test {
    public static void main(String[] args) {
        CesarCipherMarek cesar = new CesarCipherMarek();
        System.out.println(cesar.encode("u9ji201495-"));
        System.out.println(cesar.decode("dodpdnrnrdaxbycz"));
    }
}
