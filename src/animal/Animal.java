package animal;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(this.getClass().getSimpleName()).append(System.lineSeparator());
        result.append(this.name).append(" ")
                .append(this.age).append(" ")
                .append(this.gender).append(System.lineSeparator());
        result.append(this.produceSound());

        return result.toString();
    }

    public String produceSound() {
        return "make a sound";
    }
}
