package runner;

public class TestRunner {
    @Karate.Test
    Karate runTest() {
        return Karate.run("classpath:features/SecurityTest.feature");
    }


}



