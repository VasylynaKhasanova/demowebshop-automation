package org.suites;

import org.categories.SmokeTestsFilter;
import org.checkoutTest.FullCheckoutFlowTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(SmokeTestsFilter.class)
@Suite.SuiteClasses({
        FullCheckoutFlowTest.class
})
public class SmokeSuite {
}
