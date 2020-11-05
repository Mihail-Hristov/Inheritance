package animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal (String name, int age, String gender) {
        this.name = name;
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getGender() {
        return this.gender;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }else {
            throw new IllegalArgumentException("Invalid age");
        }
    }

    public void setGender(String gender) {
        if (gender.equals("Female") || gender.equals("Male")) {
            this.gender = gender;
        }else {
            throw new IllegalArgumentException("Invalid gender");
        }
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
