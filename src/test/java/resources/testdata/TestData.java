package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData
{
    @DataProvider(name = "credentials")
    public Object[][] getLoginData()
    {
        Object[][] data = new Object[][]
        {
                {"Div1@gmail.com","Div@123"},
                {"Div2@gmail.com","Div@456"},

        };
        return data;
    }

}
