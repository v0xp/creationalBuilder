public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder() {

    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalStateException("Возраст не может быть меньше нуля");
        }
        this.age = age;
        return this;

    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;

    }

    public boolean isNull(String s) {
        return s == null;
    }

    public Person build() {
        if (isNull(this.name) || isNull(this.surname)) {
            throw new IllegalStateException("Имя или фамилия не не корректны");
        }
        return new Person(this);
    }

}