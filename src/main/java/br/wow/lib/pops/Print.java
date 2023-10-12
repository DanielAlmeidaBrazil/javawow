package br.wow.lib.pops;

/**
 * @author Daniel Almeida
 * @notes The class Print contains methods to print values.
 */
public final class Print {


    /**
     * @notes Exemplo: import static br.wow.javawow.lib.pops.Print.print or import static br.wow.javawow.lib.pops.Print.*;
     *
     */
    public static <T> void  print(T value) {
        System.out.println(value);
    }

    /**
     * @notes The method p() is used to print values. Similar to System.out.println(value)
     * @param value
     * @param <T>
     */
    public static <T> void  p(T value) {
        System.out.println(value);
    }

    /**
     * @notes The method pmv() is used to print messages and values. Similar to System.out.println(message +" "+ value)
     * @param message
     * @param value
     * @param <T>
     */
    public static <T> void  pmv(String message, T value) {
        System.out.println(message + " " + value);
    }

    /**
     * @notes The method printf() is used to print values in the same line. Similar to System.out.printf(format, args)
     * @param format
     * @param args
     */
    public static void printf(String format, Object... args) {
        System.out.printf(format, args);
    }

    /**
     * @notes The method pl() is used to print values in the same line. Similar to System.out.print(value)
     * @param value
     * @param <T>
     */
    public static <T> void  pl(T value) {
        System.out.print(value + " ");
    }

    /**
     * @notes The method breakLine() is used to break a line.
     */
    public static void breakLine() {
        System.out.println();
    }
}
