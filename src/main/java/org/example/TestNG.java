package org.example;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNG {
    @Test(priority = 1, groups = {"smoke"})
    public void test1() {
        System.out.println("Running Test 1");
    }

    @Test(priority = 1, groups = {"smoke"})
    public void test2() {
        System.out.println("Running Test 2");
    }

    @Test(priority = 0, groups = {"regress"})
    public void test3() {
        System.out.println("Running Test 3");
    }

    @Test(priority = 2, groups = {"regress"})
    public void test4() {
        System.out.println("Running Test 4");

    }
}