package teste.suite;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import teste.PachetTuristicTest;
import teste.PersoanaTest;
import teste.categorii.CuMok;
import teste.categorii.FaraMok;

@RunWith(Categories.class)
@Suite.SuiteClasses({PachetTuristicTest.class, PersoanaTest.class})
@Categories.IncludeCategory(FaraMok.class)
public class SuitaCustom {
}
