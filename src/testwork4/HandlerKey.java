package testwork4;

import java.io.IOException;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class HandlerKey {
    // Создание и шифрование ключа по алгоритму BASE64
    public static String protectedKey(int lengthKey, int complicated){
        Generate g = new Generate();
        //String Key = g.Key(lengthKey, complicated);
        String protectedKey = "";
        
        BASE64Encoder enc = new BASE64Encoder();
        //protectedKey = enc.encode(Key.getBytes());
        enc = null;
        
        return protectedKey;
    }
    
    // Шифратор нешифрованного ключа по алгоритму BASE64
    public static String encodedKeyBase64(String decodedKey){
        String encodedKey;
        
        BASE64Encoder enc = new BASE64Encoder();
        encodedKey = enc.encode(decodedKey.getBytes());
        enc = null;
        
        return encodedKey;
    }
    
    // Дешифратор шифрованного ключа по алгоритму BASE64
    // Принимает protectedKey который был уже зашифрован по алгоритму BASE64
    public static String decodedKeyBase64(String protectedKey){
        String decodedKey = "";
        try{
            BASE64Decoder dec = new BASE64Decoder();
            decodedKey = new String(dec.decodeBuffer(protectedKey));
            dec = null;
        }catch(IOException ioe){ioe.printStackTrace();}
        return decodedKey;
    }
    

}
