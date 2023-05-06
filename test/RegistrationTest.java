
import javafx.beans.property.SimpleStringProperty;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import tictactoe.authentication.registration.presentation.RegistrationViewModel;

/**
 *
 * @author omar_
 */
public class RegistrationTest extends RegistrationViewModel {
    //RegistrationViewModel obj;
    SimpleStringProperty password;
    public RegistrationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //obj = new RegistrationViewModel();
    }
    
    @After
    public void tearDown() {
        //obj = null;
    }

    public void containsNumberTestToFail(){
        setPassword("Omar_Marei");
        assertFalse(containsNumber());
    }
}
