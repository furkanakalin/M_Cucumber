package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        //şurdaki feature'ları
        //şurdaki Step klasöründen faydalanarak çalıştır

        features = {"src/test/java/FeatureFiles/_01_Login.feature"},//buraya feature files'ın path'i
        glue = {"StepDefinitions"} //buraya Stepdefinition'ın klasör adı yazılır

)
public class _01_TestRunner extends AbstractTestNGCucumberTests {


}
// features pathlerinin alınması : ilgili feature dosyasının üzerinde
// sağ tuş -> copypath/refenrence seçildikten sonra çıkan seçeneklerden
// "content root" seçeneği ile uygun path alınmış olur.