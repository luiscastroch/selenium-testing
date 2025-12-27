package tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest extends BaseTest {

    @Test
    void checkCheckbox() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        driver.findElement(By.xpath("//input[1]")).click();

        assertTrue(driver.findElement(By.xpath("//input[1]")).isSelected());
    }
}
