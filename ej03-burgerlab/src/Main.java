public class Main {
    public static void main(String[] args) {
        System.out.println("ej03-burgerlab");

        Hamburguesa h1 = new Hamburguesa.Builder("res", 2)
                .conTocineta()
                .salsa("bbq")
                .build();

        Hamburguesa h2 = new Hamburguesa.Builder("pollo", 1)
                .conPepinillos()
                .build();

        Hamburguesa h3 = new Hamburguesa.Builder("veggie", 3)
                .pan("integral")
                .conQueso()
                .conTocineta()
                .conCebollaCaramelizada()
                .conPepinillos()
                .salsa("de la casa")
                .conPapasAgrandadas()
                .build();

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);

        try {
            Hamburguesa h4 = new Hamburguesa.Builder("res", 7)
                    .salsa("miel mostaza")
                    .build();
            System.out.println(h4);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
