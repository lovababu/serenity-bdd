package org.avol.serenity;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.avol.serenity.bdd.SampleSteps;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by lovababu on 09/09/18.
 */
@RunWith(SerenityRunner.class)
public class RunnerTest {


    @Steps
    private SampleSteps sampleSteps;

    @Test
    public void test1() {
        sampleSteps.setup_system();
        sampleSteps.greet("Srilekha");
        sampleSteps.verify("Srilekha");
    }

    @Test
    public void test2() {
        sampleSteps.setup_system();
        sampleSteps.greet("Vinay");
        sampleSteps.verify("Vinay");
    }
}
