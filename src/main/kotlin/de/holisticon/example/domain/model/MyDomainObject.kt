package de.holisticon.example.domain.model

import de.holisticon.example.infrastructure.SomeInfrastructureComponent
import org.jmolecules.architecture.onion.classical.DomainModelRing

// Uncomment to make the archunit test fail:
//@DomainModelRing
data class MyDomainObject(
    val someInfrastructureComponent: SomeInfrastructureComponent
)
