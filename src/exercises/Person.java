package exercises;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    @Override
    public String toString() {
        return "Pessoa data {" +
                "name='" + name + '\'' +
                ", idade=" + age +
                '}';
    }
}
