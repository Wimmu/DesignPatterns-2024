# Kysymykset ja vastaukset

[Testit täällä](https://github.com/Wimmu/DesignPatterns-2024/tree/main/src/test/java/TDD_JUnit)

### a. Mitä assertArrayEquals-metodi tekee?
assertArrayEquals-metodi JUnitissa tarkistaa, ovatko kaksi taulukkoa keskenään yhtä suuret. Se vertaa taulukkojen kaikkia elementtejä ja varmistaa, että ne ovat identtisiä, sekä pituudeltaan että sisällöltään. Jos taulukot eivät ole samanlaiset, testi epäonnistuu, ja JUnit heittää virheen.

### b. Mitä tapahtuu, jos taulukot a1 ja a2 eivät ole samanlaiset metodissa testSingleDimensionalArrayEquality?
Jos taulukot a1 ja a2 eivät ole keskenään yhtenevät, assertArrayEquals heittää AssertionError-virheen ja testi epäonnistuu. Testiraportti ilmoittaa virheestä, ja se kertoo, että odotettu ja todellinen taulukko eivät olleet samanlaiset.

### c. Miten assertArrayEquals-metodi käsittelee monidimensionaalisia taulukkoja, kuten metodissa testMultiDimensionalArrayEquality?
Monidimensionaalisissa taulukoissa assertArrayEquals käsittelee taulukot rekursiivisesti, eli se käy läpi kaikki sisemmän tason taulukot ja vertaa niitä vastaaviin sisemmän tason taulukkoihin toisessa taulukossa. Kaksi monidimensionaalista taulukkoa ovat yhtä suuria, jos jokainen vastaava elementti jokaisessa ulottuvuudessa on yhtä suuri.