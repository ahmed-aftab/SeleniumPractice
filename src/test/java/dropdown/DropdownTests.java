package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        var dropDownPage=homePage.clickDropDown();
        dropDownPage.selectFromDropDown("Option 1");
        var selectedOptions= dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(),1,"Incorrect");
        assertTrue(selectedOptions.contains("Option 1"),"Option not set");
    }
}
