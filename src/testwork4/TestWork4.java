package testwork4;

import static java.lang.System.*;

public class TestWork4 {
    public static void main(String[] args) {
        Generate g = new Generate();
        
        out.println("\tPassword-generator\n");
        out.printf("length 6, complicated 1: %s \nlength 8, complicated 2: %s \nlength 10, complicated 3: %s \nlength 15, complicated 4: %s \n\n",
                g.Key(6,1), g.Key(8,2), g.Key(10,3), g.Key(15,4));
        
        out.println("========================================================="+
            "\n\t\t   Программа шифрования"+"\n");
        
        String testString = "Sajko Rodion Vjacheslavovich";
        
        out.println("\t   Получение строки: "+testString+" ;"+
            "\n\tКодировка по BASE64: "+HandlerKey.encodedKeyBase64(testString)+" ;"+
            "\n\tШифрование по SHA-1: "+PasswordEncrypter.getProtectedKeySHA_1(testString)+" ;"+
            "\n\t Шифрование по MD-5: "+PasswordEncrypter.getProtectedKeyMD_5(testString)+" ;"+
            "\n\nКодирование шифра по BASE64 (SHA-1): "+PasswordEncrypter.bufferKey2(PasswordEncrypter.getProtectedKeySHA_1(testString), "sha-1")+" ;"+
            "\n Кодирование шифра по BASE64 (MD-5): "+PasswordEncrypter.bufferKey2(PasswordEncrypter.getProtectedKeyMD_5(testString), "md5")+" ;");
        
        out.println("\n=========================================================");

        out.printf("%s \n %s \n %s", g.Key(-5,4), g.Key(0,3), g.Key(20,-1));
    }
}