package ru.zudkin.springcourse.DAO;

import org.springframework.stereotype.Component;
import ru.zudkin.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class PersonDAO {
    private static int PERSON_ID;
    private List<Person> people;
    {
        people = new ArrayList<>();
        people.add(new Person(++PERSON_ID, "Tom"));
        people.add(new Person(++PERSON_ID, "Jack"));
        people.add(new Person(++PERSON_ID, "Bob"));
        people.add(new Person(++PERSON_ID, "Katy"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    public void save(Person person) {
        person.setId(++PERSON_ID);
        people.add(person);
    }

    public void update(Person person, int id) {
        Person personToBeUpdated = show(id);
        personToBeUpdated.setName(person.getName());
    }

    public void delete(int id) {
        people.removeIf(p -> p.getId() == id);
    }
}
