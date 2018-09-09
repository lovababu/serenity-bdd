package org.avol.serenity.bdd;

import net.thucydides.core.annotations.Step;
import org.avol.serenity.dao.impl.SampleDaoImpl;
import org.avol.serenity.service.Sample;
import org.avol.serenity.service.impl.SampleImpl;

import static org.junit.Assert.assertTrue;

/**
 * Created by lovababu on 09/09/18.
 */
public class SampleSteps  {

    private Sample sample;
    private static String output;

    @Step("Given a system has been initiated")
    public void setup_system() {
        sample = new SampleImpl(new SampleDaoImpl());
    }

    @Step("Then a greet request has been sent with user {}")
    public void greet(String user) {
        output = this.sample.greet(user);
    }

    @Step("And the output must contains {}")
    public void verify(String expect) {
        assertTrue(output.contains(expect));
    }
}
