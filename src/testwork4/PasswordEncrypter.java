package testwork4;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import sun.misc.BASE64Encoder;

public class PasswordEncrypter {
    // Кодирование строки
    private static byte[] protectedKey(String Key, String algorithm){
        try{
            if(Key.length() == 0||Key == null) throw new NullPointerException();
            MessageDigest d = MessageDigest.getInstance(algorithm);
            d.update(Key.getBytes());
            return d.digest();
        }catch(NoSuchAlgorithmException nsae){
        }catch(NullPointerException npe){System.out.println("Value \"Key\" is 0/null/empty!"+"\n"+npe);}
        return null;
    }
    
    // Получает ключ из protectedKey и шифрует по алгоритму BASE64
    private static String encryptAndEncode(String Key, String algorithm){
        BASE64Encoder enc = new BASE64Encoder();
            String encoded = enc.encode(protectedKey(Key, algorithm));
        enc = null;
        return encoded;
    }
    
    // Создает шифр ключа по алгоритму
    private static String bufferKey(String Key, String algorithm){
        String encrypted = new String(/*PasswordEncrypter2.*/protectedKey(Key, algorithm));
        //String encoded = PasswordEncrypter2.encryptAndEncode(Key, algorithm);
        return encrypted;
    }
    
    // Кодирует получаемый шифр ключа
    public static String bufferKey2(String Key, String algorithm){return encryptAndEncode(Key, algorithm);}
    
    public static String getProtectedKeySHA_1(String Key){return bufferKey(Key, "sha-1");}
    
    
    
    // НЕ РАБОТАЕТ !!!!===========================
    public static String getProtectedKeyMD_5(String Key){return bufferKey(Key, "md5");}
    //public static String getProtectedKeySHA_3(String Key){return bufferKey(Key, "sha-3");}
}
