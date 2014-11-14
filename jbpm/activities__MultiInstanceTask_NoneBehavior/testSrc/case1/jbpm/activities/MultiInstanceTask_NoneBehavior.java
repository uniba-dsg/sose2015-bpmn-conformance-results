package jbpm.activities;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import junit.framework.JUnit4TestAdapter;

import org.junit.Assert;
import org.junit.Test;

public class MultiInstanceTask_NoneBehavior {

    String[] expectedValues = {"SCRIPT_task1","SCRIPT_task3","SCRIPT_task1","SCRIPT_task3","SCRIPT_task1","SCRIPT_task3","SCRIPT_task2"};

    @Test
    public void test1AssertSCRIPT_task1SCRIPT_task3SCRIPT_task1SCRIPT_task3SCRIPT_task1SCRIPT_task3SCRIPT_task2() throws IOException{
        List<String> lines = Files.readAllLines(Paths.get("C:/betsy_master/server/jbpm/log1.txt"),
                StandardCharsets.UTF_8);
		String[] gotValues = lines.toArray(new String[lines.size()]);

        Arrays.sort(gotValues);
        Arrays.sort(expectedValues);

        String message = "expected " + Arrays.toString(expectedValues) + " but got " + Arrays.toString(gotValues);
        Assert.assertArrayEquals(message, expectedValues, gotValues);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(MultiInstanceTask_NoneBehavior.class);
    }

}
