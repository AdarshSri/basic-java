package programming;


import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CustomClass {
    public static void main(String[] args) {
        List<Course> courses = List.of(new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 97, 22000),
                new Course("API", "Microservices", 93, 21000),
                new Course("Microservices", "Microservices", 91, 25000),
                new Course("Fullstack", "Fullstack", 91, 17000),
                new Course("AWS", "Cloud", 95, 19000),
                new Course("Azure", "Cloud", 95, 18000),
                new Course("Docker", "Devops", 99, 23000),
                new Course("Kubernetes", "Devops", 99, 20000));

        //all matches
        System.out.println(courses.stream().anyMatch(course -> course.getReview() > 95));
        Comparator<Course> comparingByIncreasing = Comparator.comparing(Course::getNoOfStudents);
        Comparator<Course> comparingByDecreasing = Comparator.comparing(Course::getNoOfStudents).reversed();
        System.out.println(courses.stream().sorted(comparingByDecreasing).collect(Collectors.toList()));

    }
}

class Course {
    private String name;
    private String category;
    private int review;
    private int noOfStudents;

    public Course(String name, String category, int review, int noOfStudents) {
        this.name = name;
        this.category = category;
        this.review = review;
        this.noOfStudents = noOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", review=" + review +
                ", noOfStudents=" + noOfStudents +
                '}';
    }
}

