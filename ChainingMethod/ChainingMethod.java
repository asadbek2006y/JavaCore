package ChainingMethod;

public class ChainingMethod {

    public static void main(String[] args) {
        // Bu yerda kod yozing

        // Chaining method (metod zanjiri) — bu dasturlash paradigmasida bir necha metodlarni ketma - ket chaqirish 
        // imkonini beradigan texnika. Bu asosan ob'ektga yo'naltirilgan dasturlash (OOP) tillarida, masalan, Java, Python
        // , va boshqa tillarda keng qo'llaniladi.

        String name = "           bro";

        // name = name.concat("  code ");
        // name = name.toUpperCase();
        // name = name.trim();

        name = name.concat("  code   ").toUpperCase().trim();
        System.out.println(name);
    }
}
