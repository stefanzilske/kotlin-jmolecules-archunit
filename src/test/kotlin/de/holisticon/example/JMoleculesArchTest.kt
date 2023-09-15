package de.holisticon.example

import com.tngtech.archunit.core.importer.ImportOption
import com.tngtech.archunit.junit.AnalyzeClasses
import com.tngtech.archunit.junit.ArchTest
import com.tngtech.archunit.lang.ArchRule
import org.jmolecules.archunit.JMoleculesArchitectureRules

@AnalyzeClasses(
  packages = ["de.holisticon.example"],
  importOptions = [ImportOption.DoNotIncludeTests::class]
)
class JMoleculesArchTest {

  @ArchTest
  val onion: ArchRule = JMoleculesArchitectureRules.ensureOnionClassical()
}
