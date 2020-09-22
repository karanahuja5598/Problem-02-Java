package cd.get.ready.algorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CountDuplicatesTest {

    private CountDuplicates countDuplicates;

    @Before
    public void setup(){
        countDuplicates = new CountDuplicates();
    }

    @Test
    public void countDuplicateIntegersTest1(){
        // Given
        Integer[] integers = {1,2,3,4,5,1,3,2,3,6,6,3,3,2,5};


        // When
        Integer expectedNumberOfDuplicates = 5;
        Integer actualNumberOfDuplicates = countDuplicates.countDuplicates(integers);

        //Then

        Assert.assertEquals(expectedNumberOfDuplicates, actualNumberOfDuplicates);

    }


    @Test
    public void countDuplicateIntegersTest2(){
        // Given
        Integer[] integers = {1,1,1,2,2,3,4,4};


        // When
        Integer expectedNumberOfDuplicates = 3;
        Integer actualNumberOfDuplicates = countDuplicates.countDuplicates(integers);

        //Then

        Assert.assertEquals(expectedNumberOfDuplicates, actualNumberOfDuplicates);

    }

    @Test
    public void countDuplicateStringsTest1(){
        // Given
        String[] strings = {"Rza","MethodMan", "Ghostface", "U-God", "ODB","MethodMan","GZA", "Ghostface" };


        // When
        Integer expectedNumberOfDuplicates = 2;
        Integer actualNumberOfDuplicates = countDuplicates.countDuplicates(strings);

        //Then

        Assert.assertEquals(expectedNumberOfDuplicates, actualNumberOfDuplicates);

    }
}
