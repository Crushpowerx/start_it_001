package package_1;


import org.testng.annotations.Test;

public class Class3 {
    private String country;

    public Class3(String country) {
        this.country = country;
    }

    public void printCountry() {
        System.out.println(country);
    }
}

class Class4 {
    Class3 class3 = new Class3("DE");

    @Test
    public void test1() {
        class3.printCountry();
    }

}
