package com.rpenunuri.automation.tests;

import com.rpenunuri.automation.pages.JetHome;
import com.rpenunuri.automation.pages.SeleniumPageFactory;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners(value = {TestListener.class})
public abstract class BaseSystemTestCase {

    private ExecutionContext _executionContext;
    private static final ThreadLocal<Integer> THREAD_INDEX = new InheritableThreadLocal<>();
    private static int _threadCounter = 0;

    @BeforeSuite
    public void beforeSuite() {

    }

    @BeforeClass
    public void beforeClass() {

    }

    @BeforeMethod
    public void beforeMethod() {
        setupExecutionContext();
        getExecutionContext().initializeWebDriver();
    }

    protected ExecutionContext getExecutionContext() {
        return _executionContext;
    }

    protected void setupExecutionContext() {
        if (THREAD_INDEX.get() == null) {
            synchronized (THREAD_INDEX) {
                THREAD_INDEX.set(_threadCounter++);
            }
        }
        _executionContext = new ExecutionContext(THREAD_INDEX.get());
    }

    public SeleniumPageFactory page() {
        return new SeleniumPageFactory(getExecutionContext().getWebDriver());
    }


    protected JetHome asJetGuest() {
        goToJetSite();
        return page().jetHome();
    }

    protected void goToJetSite() {
        navigateTo(getExecutionContext(), "https://jet.com/");
    }

    protected void navigateTo(ExecutionContext executionContext, String path) {
        executionContext.getWebDriver().navigate().to(path);
    }
}
