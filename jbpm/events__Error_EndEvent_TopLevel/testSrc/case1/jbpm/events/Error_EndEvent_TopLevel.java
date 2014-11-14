package jbpm.events;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import junit.framework.JUnit4TestAdapter;

import org.junit.Assert;
import org.junit.Test;

public class Error_EndEvent_TopLevel {

    String[] expectedValues = {"SCRIPT_task1","ERROR_thrownErrorEvent"};

    @Test
    public void test1AssertSCRIPT_task1ERROR_thrownErrorEvent() throws IOException{
        List<String> lines = Files.readAllLines(Paths.get("C:/betsy_master/server/jbpm/log1.txt"),
                StandardCharsets.UTF_8);
		String[] gotValues = lines.toArray(new String[lines.size()]);

        Arrays.sort(gotValues);
        Arrays.sort(expectedValues);

        String message = "expected " + Arrays.toString(expectedValues) + " but got " + Arrays.toString(gotValues);
        Assert.assertArrayEquals(message, expectedValues, gotValues);
    }

    public static junit.framework.Test suite() {
        return new JUnit4TestAdapter(Error_EndEvent_TopLevel.class);
    }

}
