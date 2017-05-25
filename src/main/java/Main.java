public class Main {

    public static void main(String[] args) {
        System.out.println("Lets start!");
        Converter converter = new Converter();

        System.out.println(converter.convertWholeNumber(111));
        System.out.println(converter.convertWholeNumber(111231231));
        System.out.println(converter.convertWholeNumber(11563541));
        System.out.println(converter.convertWholeNumber(1115));
        System.out.println(converter.convertWholeNumber(1341211));
        System.out.println(converter.convertWholeNumber(1341000021));



        System.out.println(converter.convertWholeNumber(1000));
        System.out.println(converter.convertWholeNumber(10000));
        System.out.println(converter.convertWholeNumber(100000));
        System.out.println(converter.convertWholeNumber(1000000));
        System.out.println(converter.convertWholeNumber(10000000));
        System.out.println(converter.convertWholeNumber(100000000));
        System.out.println(converter.convertWholeNumber(1000000000));

    }




}
