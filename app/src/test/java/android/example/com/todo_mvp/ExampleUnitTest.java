package android.example.com.todo_mvp;

import org.hamcrest.Description;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.regex.Matcher;

import static org.junit.Assert.*;
import static org.junit.matchers.JUnitMatchers.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(Parameterized.class)
public class ExampleUnitTest {
    private String content;

    public ExampleUnitTest(String content) {
        this.content = content;
    }

    @Parameterized.Parameters
    public static Collection getString(){
        return Arrays.asList(new String[]{
                "Hello junit",
                "Hello world",
                "Fucker",
        });

    }

    @Test
    public void addition_isCorrect() throws Exception {
        //assertEquals("鸡巴",4, 1 + 2);
        //assertThat("鸡巴",50,);
        assertEquals("鸡巴", content,"Hello junit");
    }

    @Test
    public void test_1(){
        assertEquals("鸡巴",5,1+3);
    }

}