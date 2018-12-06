package testwork4;

import java.util.Random;

public class Generate {
    public static String Key(int lengthKey, int complicated){

        String key = "";
        char symb = ' ';
        Alphabet abc = new Alphabet();
        
        try{
            if(lengthKey<0) throw new IllegalArgumentException();
            else if(lengthKey==0) throw new NullPointerException();
            else if(complicated<0||complicated>4) throw new IllegalArgumentException();
            else if(complicated==0) throw new NullPointerException();
            
            for(int i=1; i<=lengthKey; i++){
                Random r = new Random();

                switch(r.nextInt(complicated)){
                    case 3: symb = abc.getMark(r.nextInt(abc.getLengthMassMark())); break;
                    case 2: symb = abc.getNum(r.nextInt(abc.getLengthMassNumber())); break;
                    case 1: symb = abc.getCharUpper(r.nextInt(abc.getLengthMassSymbolUpper())); break;
                    case 0: symb = abc.getCharLower(r.nextInt(abc.getLengthMassSymbolLower())); break;
                }
                key+=symb;
            }
        }catch(IllegalArgumentException iae){
            System.out.println("Ошибка: "+iae+";\n"+"Неверное значение переменной: lengthKey = "+lengthKey+", complicated = "+complicated+";");
        }catch(NullPointerException npe){
            System.out.println("Ошибка: "+npe+";\n"+"Нулевое значение переменной: lengthKey = "+lengthKey+", complicated = "+complicated+";");
        }
        return key;
    }
}