package sample;
public class Friends {
    public String name;
    private int age;
    private String pronouns;

    //constructor:
    Friends(String n, int age, String pronouns){
        this.name = n;
        this.age = age;
        this.pronouns = pronouns;
    }

    //getters and setters:

    public int getAge(){
        return age;
    }

    public String toString() {
        return name;
    }

    public String getPronouns() {
        return pronouns;
    }

}
