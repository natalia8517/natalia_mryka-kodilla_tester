public class Application {

    String name;
    double age;
    double height;

    public Application(String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public static void main(String[] args) {

        Application newApplication = new Application("Adam", 40.5, 178);


        if (newApplication.name != null) {
            if (newApplication.age > 30 && newApplication.height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}