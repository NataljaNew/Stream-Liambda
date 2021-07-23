import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        List <String> list = List.of("b", "d", "a", "c","e");
        main.method(main.method1(),list);
        System.out.println("________________________");
        main.method(main.method2(),list);

    }

    public Function<List<String>, List<String>> method1( ) {
        Function<List<String>, List<String>> function = (list) -> list.stream()
                .sorted()
                .collect(Collectors.toList());
        return function;
    }

    public Function<List<String>, List<String>> method2() {
        Function<List<String>, List<String>> function = (list) -> list.stream()
                .map (n -> n.toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());
        return function;
    }
    public void method (Function<List<String>, List<String>> function, List<String> name){
        List<String> result = function.apply(name);
        result.forEach(System.out::println);
    }
}
