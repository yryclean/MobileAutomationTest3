import com.sun.xml.internal.ws.util.StringUtils;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassString() {
        String new_class_string = this.getClassString();
        Assert.assertTrue("Test is not ok, if hello or Hello were not found", new_class_string.contains("hello") | new_class_string.contains("Hello"));
        System.out.println("Test is ok, string contains the provided text");
    }

}

