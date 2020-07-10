package com.test;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {

    @Test
    public void checkEquality(){
        Person person = new Person("Barrack", "Obama");
        Person personClone = new Person("Barrack", "Obama");

        assertThat (person).isEqualTo(person);
        //assertThat (person).isEqualTo(personClone);  //esse teste não passaria!
    }
}
