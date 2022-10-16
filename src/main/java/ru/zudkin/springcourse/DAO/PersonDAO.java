package ru.zudkin.springcourse.DAO;

import org.springframework.stereotype.Component;
import ru.zudkin.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class PersonDAO {
    private List<Person> people;
    {
        people = new ArrayList<>();
        people.add(new Person(1, "Tom"));
        people.add(new Person(2, "Jack"));
        people.add(new Person(3, "Bob"));
        people.add(new Person(4, "Katy"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

}
