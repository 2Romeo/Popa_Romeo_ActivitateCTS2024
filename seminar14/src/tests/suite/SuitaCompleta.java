package tests.suite;

import clase.PachetTuristic;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.PersoanaTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({PachetTuristic.class, PersoanaTest.class})
public class SuitaCompleta {
}
