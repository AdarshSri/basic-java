package programming;

import java.util.List;

public class FP01FunctionalWithStrings {

    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring MVC", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Docker");
//        printAllCoursesInListFunctional(courses);
//        printSpringCoursesInListFunctional(courses);
//        print4LettersCoursesInListFunctional(courses);
        printNoOfCharactersInListFunctional(courses);
    }

    private static void printAllCoursesInListFunctional(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }

    private static void printSpringCoursesInListFunctional(List<String> courses) {
        courses.stream().filter(course -> course.contains("Spring")).forEach(System.out::println);
    }

    private static void print4LettersCoursesInListFunctional(List<String> courses) {
        courses.stream().filter(course -> course.length() >= 4).forEach(System.out::println);
    }

    private static void printNoOfCharactersInListFunctional(List<String> courses) {
        courses.stream().map(course -> course + " - " + course.length()).forEach(System.out::println);
    }
}
