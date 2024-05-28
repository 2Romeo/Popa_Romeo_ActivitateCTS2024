package tests.suite;

import clase.PachetTuristic;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.PachetTuristicTest;
import tests.PersoanaTest;
import tests.categorii.TesteCuMock;
import tests.categorii.TesteFaraMock;

@RunWith(Categories.class)
@Suite.SuiteClasses({PersoanaTest.class, PachetTuristicTest.class})
@Categories.IncludeCategory(TesteFaraMock.class)
public class SuitaCustom {
}
