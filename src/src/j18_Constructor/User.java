package src.j18_Constructor;

public class User {
    String name;
    String country;
    int age;
    String birthDate;

    public User(String p1, String p2, int p3, String p4){

        name = p1;
        country = p2;
        age = p3;
        birthDate = p4;

    }

    public static void main(String[] args) {

        User user = new User("Kullanıcı245", "Türkiye", 23, "02.06.1998");

        System.out.println(user.name);
        System.out.println(user.country);
        System.out.println(user.age);
        System.out.println(user.birthDate);

    }

}



