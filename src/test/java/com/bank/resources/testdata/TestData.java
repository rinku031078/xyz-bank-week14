package com.bank.resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "credentials")
    public Object[][] getData(){
        return new Object[][]{
                {"Anand","Tripathi","London"},
                {"Rinku","Tripathi","Harrow"},
                {"Het","Tripathi","London"},
                {"Hetvi","Tripathi","Harrow"}

        };
    }
}
