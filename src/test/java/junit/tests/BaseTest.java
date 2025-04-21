package junit.tests;

import com.epam.tat.module4.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.time.LocalDateTime;

public class BaseTest {
    protected Calculator calculator;

    @BeforeEach
    public void initialiseCalculator() {
        calculator = new Calculator();
    }

    private static void takeScreenshot(String fileName) {
        try {
            Robot robot = new Robot();
            Rectangle screenSize = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
            BufferedImage image = robot.createScreenCapture(screenSize);

            File screenshot = new File("screenshots/" + fileName + ".png");
            screenshot.getParentFile().mkdirs();
            ImageIO.write(image, "png", screenshot);

            System.out.println("Screenshot saved as: " + screenshot.getAbsolutePath());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }

    @AfterAll
    public static void takeScreenshot() {
        takeScreenshot("Fail" + LocalDateTime.now().getSecond());
    }
}
