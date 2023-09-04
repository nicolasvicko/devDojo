package maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {

        byte byteP = 1;
        short shorpP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'W';
        boolean booleanP = false;

    /*
    Em collections e outros tópicos avançados em java não se usa mais tipos primitivos.
    Agora os valores são tipo referência e são objetos.
    Só usar tipo Wrappers quando for necessário. e sempre que possível o tipo primitivo.
     */

    /*
    Autoboxing é o processo pelo qual um tipo primitivo é automaticamente encapsulado (envolto) em seu tipo de wrapper correspondente.
    Em outras palavras, quando você atribui um valor de um tipo primitivo a uma variável de um tipo de wrapper, o Java faz a conversão automaticamente.
     */
        int numeroPrimitivo = 42;
        Integer numeroWrapper1 = numeroPrimitivo; // Autoboxing

        Byte byteW = 1;
        Short shorWW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'W';
        Boolean booleanW = false;

    /*
    Unboxing é o processo inverso ao autoboxing, onde o valor encapsulado em um tipo de wrapper é automaticamente
    convertido de volta para seu tipo primitivo correspondente.
     */

        int i = intW;
        Integer intW2 = Integer.parseInt("1");
        Boolean verdadeiro = Boolean.parseBoolean("TRUE");
        //System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));


        Integer numeroWrapper = 99;
        int numeroPrimitivo2 = numeroWrapper; // Unboxing


    }
}
