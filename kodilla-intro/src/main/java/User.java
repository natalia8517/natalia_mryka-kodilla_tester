import java.util.concurrent.ScheduledExecutorService;

public class User {
    String name;
    int age;

     public User(String name, int age){
         this.name = name;
         this.age = age;
     }

public static void main(String[] args) {

        User user1 = new User("John", 12);
        User users2 = new User("Tom", 15);
        User users3 = new User("Anna", 40);
        User users4 = new User("Kate", 30);
        User[] users = {user1, users2, users3, users4};
        ShowUsersUnderAverageAge(users);
    }
    public static double CalculateAverageAge(User[] users) {
        int sumOfUsersAge = 0;

        for (int i = 0; i < users.length; i++) {
            sumOfUsersAge = sumOfUsersAge + users[i].age;
        }
        return  sumOfUsersAge / users.length;
    }

        public static void ShowUsersUnderAverageAge(User[] users){
            double averageAge = CalculateAverageAge(users);
            for (int i = 0; i<users.length; i++){
                if (users[i].age < averageAge){
                    System.out.println("User under average age " + users[i].name);
                }
            }

        }

    }



