package testwork4;

import static java.lang.System.*;

class Alphabet{

    private final char[] SYMBOLUPPER = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'X', 'Y', 'Z'};
    private final char[] SYMBOLLOWER = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z'};
    private final char[] NUMBER = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    private final char[] MARK = {'*', '?', '!', '^', '%', '<', '>', '[', ']', '-', '='};

    public final int getLengthMassSymbolUpper(){return this.SYMBOLUPPER.length;}
    public final int getLengthMassSymbolLower(){return this.SYMBOLLOWER.length;}
    public final int getLengthMassNumber(){return this.NUMBER.length;}
    public final int getLengthMassMark(){return this.MARK.length;}

    public char getCharUpper(int a) throws IndexOutOfBoundsException{
        try{if(a<0||a>=(this.SYMBOLUPPER.length)) throw new IndexOutOfBoundsException();
        }catch(IndexOutOfBoundsException ie){
            out.println("Ошибка: "+ie+";\n"+"Неверное значение переменной: index = "+a+";");
        }
        return SYMBOLUPPER[a];
    }
    public char getCharLower(int a) throws IndexOutOfBoundsException{
        try{if(a<0||a>=(this.SYMBOLLOWER.length))throw new IndexOutOfBoundsException();
        }catch(IndexOutOfBoundsException ie){
            out.println("Ошибка: "+ie+";\n"+"Неверное значение переменной: index = "+a+";");
        }
        return SYMBOLLOWER[a];
    }
    public char getNum(int b){
        try{if(b<0||b>=(this.NUMBER.length)) throw new IndexOutOfBoundsException();
        }catch(IndexOutOfBoundsException ie){
            out.println("Ошибка: "+ie+";\n"+"Неверное значение переменной: index = "+b+";");
        }
        return NUMBER[b];
    }
    public char getMark(int c){
        try{if(c<0||c>=(this.MARK.length)) throw new IndexOutOfBoundsException();
        }catch(IndexOutOfBoundsException ie){
            out.println("Ошибка: "+ie+";\n"+"Неверное значение переменной: index = "+c+";");
        }
        return MARK[c];
    }
}