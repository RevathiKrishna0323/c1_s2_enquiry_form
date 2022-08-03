package com.niit.jdp;

import org.junit.jupiter.api.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EnquiryFormTest {
    private String[] lines;

    @BeforeEach
    void setUp() {
        ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStreamCaptor));
        EnquiryForm.main(new String[]{});
        String output = outputStreamCaptor.toString().trim();
        lines = output.split("\n");
    }

    @Test
    @DisplayName("The value of name should be printed.")
    @Order(1)
    void shouldPrintValueOfName() {
        String expectedOutput = "name = John";
        assertEquals(expectedOutput, lines[0].trim(), "The output should be \"name = John\".");
    }

    @Test
    @DisplayName("The value of contactNumber should be printed.")
    @Order(2)
    void shouldPrintValueOfContactNumber() {
        String expectedOutput = "contactNumber = 412312556";
        assertEquals(expectedOutput, lines[1].trim(), "The output should be \"contactNumber = 412312556\".");
    }

    @Test
    @DisplayName("The value of email should be printed.")
    @Order(3)
    void shouldPrintValueOfEmail() {
        String expectedOutput = "email = john@gmail.com";
        assertEquals(expectedOutput, lines[2].trim(), "The output should be \"email = john@gmail.com\".");
    }

    @Test
    @DisplayName("The value of age should be printed.")
    @Order(4)
    void shouldPrintValueOfAge() {
        String expectedOutput = "age = 34";
        assertEquals(expectedOutput, lines[3].trim(), "The output should be \"age = 34\".");
    }

    @Test
    @DisplayName("The value of gender should be printed.")
    @Order(5)
    void shouldPrintValueOfGender() {
        String expectedOutput = "gender = M";
        assertEquals(expectedOutput, lines[4].trim(), "The output should be \"gender = M\".");
    }

    @Test
    @DisplayName("The value of occupation should be printed.")
    @Order(6)
    void shouldPrintValueOfOccupation() {
        String expectedOutput = "occupation = Manager";
        assertEquals(expectedOutput, lines[5].trim(), "The output should be \"occupation = Manager\".");
    }

    @Test
    @DisplayName("The value of annualSalary should be printed.")
    @Order(7)
    void shouldPrintValueOfAnnualSalary() {
        String expectedOutput = "annualSalary = $10000.0";
        assertEquals(expectedOutput, lines[6].trim(), "The output should be \"annualSalary = $10000.0\".");
    }

    @Test
    @DisplayName("The value of nationality should be printed.")
    @Order(8)
    void shouldPrintValueOfNationality() {
        String expectedOutput = "nationality = Indian";
        assertEquals(expectedOutput, lines[7].trim(), "The output should be \"nationality = Indian\".");
    }

    @Test
    @DisplayName("The value of isMarried should be printed.")
    @Order(9)
    void shouldPrintValueOfIsMarried() {
        String expectedOutput = "isMarried = true";
        assertEquals(expectedOutput, lines[8].trim(), "The output should be \"isMarried = true\".");
    }
}