package StepDefinitions;

import Utilities.GWD_OLD;
import io.cucumber.java.After;

public class Hooks {   //Kanca


    // Cucumbera ait her senaryodan sonra çalışan
    // Annotation
    @After
    public void after()
    {
        GWD_OLD.quitDriver();
    }

}
