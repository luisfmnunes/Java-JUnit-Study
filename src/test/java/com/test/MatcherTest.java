package com.test;

import org.hamcrest.Matchers;
import org.hamcrest.beans.HasProperty;
import org.hamcrest.object.HasToString;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.*;

public class MatcherTest {

    @Test
    public void givenBean_checkToString() {
        Person person = new Person("Barrack", "Obama");
        String str = person.toString();
        assertThat(person, HasToString.hasToString(str)); //Object Matcher
    }

    @Test
    public void givenBean_checkPropertyExists() {
        Person person = new Person("Barrack", "Obama");
        assertThat(person, hasProperty("nome"));
    }

    @Test
    public void givenCollection_checkEmpty() {
        List<String> emptyList = new ArrayList<>();
        assertThat(emptyList, Matchers.empty());
    }

    @Test
    public void givenAnInteger_checkGreater() {
        assertThat(1, Matchers.greaterThan(0));
    }

    @Test
    public void givenString_checkNull() {
        String str = null;
        assertThat(str,Matchers.isEmptyOrNullString());
    }
}
