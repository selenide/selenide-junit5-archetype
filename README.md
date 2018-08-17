# selenide-junit5-archetype
Maven Archetype for a Selenide tests with JUnit 5


## Usage

### generate a basic Selenide project

```mvn archetype:generate -DarchetypeGroupId=org.selenide -DarchetypeArtifactId=selenide-junit5-archetype```

then enter *groupId* (e.g. com.example), *artifactId* (e.g. ui-tests), *version* (default 1.0-SNAPSHOT), *package* (default the same as *groupId*. Confirm with **Y**.

Alternatively you can provide given parameters in the command line (**-B** - batch mode) :

```mvn archetype:generate -B -DarchetypeGroupId=org.selenide -DarchetypeArtifactId=selenide-junit5-archetype -DgroupId=com.example -DartifactId=ui-tests```

or with alternate package

```mvn archetype:generate -B -DarchetypeGroupId=org.selenide -DarchetypeArtifactId=selenide-junit5-archetype -DgroupId=com.example -DartifactId=ui-tests -Dpackage=com.example.project.ui```

The archetype is not released as often as Selenide, you can use the newest version of selenide ![last version](https://img.shields.io/maven-central/v/com.codeborne/selenide.svg) when generating:

```mvn archetype:generate -B -DarchetypeGroupId=org.selenide -DarchetypeArtifactId=selenide-junit5-archetype -DgroupId=com.example -DartifactId=ui-tests -Dselenide_version=4.13.0```

### Content of the project

The project consists of one simple GoogleTest class, two PageObject/PageWidgets: GoogleSearch and SearchResults, and default configuration paramteres in pom.xml

You can run the tests in Firefox (default)

```mvn test```

In Chrome:

```mvn test -Dselenide.browser=chrome```

In headless Chrome:

```mvn test -Dselenide.browser=chrome -Dselenide.headless=true```

In Chrome with different browser size:

```mvn test -Dselenide.browser=chrome -DbrowserSize=1400x920```

With longer timeout for slow connections, default timeout is 4 seconds:

```mvn test -Dselenide.browser=chrome -Dselenide.timeout=8000```

In IE or Edge (Windows only):

```
mvn test -Dselenide.browser=ie
mvn test -Dselenide.browser=edge
```

In Safari (Mac OS only, enable *Allow remote connections* option in Safari Develop menu before test)

```mvn test -Dselenide.browser=safari```

## Developers/Contributers

To build and install locally 

```mvn install```

To deploy to Maven Central (only authorized contributers, requires GPG certificate and **settings.xml** configuration)

```mvn deploy```
