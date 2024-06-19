public class IdadePessoa {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

    public String verifyIfAdult(int age) {
        if (age >= 18) {
            return name + " It's adult";
        } else {
            return name + " Is's teenager";
        }
    }


    public static void main(String[] args) {
        var person1 = new IdadePessoa();

        person1.setName("Samuel");
        person1.setAge(19);

        System.out.println(person1.verifyIfAdult(person1.age));

        var person2 = new IdadePessoa();

        person2.setName("Bianca");
        person2.setAge(10);

        System.out.println(person1.verifyIfAdult(person2.age));
    }
}


