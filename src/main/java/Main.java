import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Function<List<String>, List<String>> function = null;
        List <String> list = List.of("b", "d", "a", "c","e");
        main.method1(function,list);
        System.out.println("________________________");
        main.method2(function,list);

    }

    public Function<List<String>, List<String>> method1(Function<List<String>, List<String>> function, List<String> name) {
        function = (list) -> list.stream()
                .sorted()
                .collect(Collectors.toList());
        List<String> result = function.apply(name);
        result.forEach(System.out::println);
        return function;
    }

    public Function<List<String>, List<String>> method2(Function<List<String>, List<String>> function, List<String> name) {
        function = (list) -> list.stream()
                .map (n -> n.toUpperCase(Locale.ROOT))
                .collect(Collectors.toList());
        List<String> result = function.apply(name);
        result.forEach(System.out::println);
        return function;
    }
}
