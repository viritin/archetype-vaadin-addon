#set($h1 = '#')
#set($h2 = '##')
#set($h3 = '###')
#set($h4 = '####')
$h1 Your Vaadin add-on project

This is an add-on project created with in.virit:vaadin-addon archetype.
The project supports plain server side extensions and JavaScript extensions.
There are stubbs for server side composition and JavaScript component. Delete the obsolete ones and continue.

$h2 Usage instructions 

1. Import to your favourite IDE
2. Run main method of the Server class to launch embedded web server that lists all your test UIs at http://localhost:9998
3. Code and test
  * create UI's for various use cases for your add-ons, see examples. These can also work as usage examples for your add-on users.
  * create browser level and integration tests under src/test/java/
  * Browser level tests are executed manually from IDE (JUnit case) or with Maven profile "browsertests" (mvn verify -Pbrowsertests). The browsertests profile is enabled automatically for release builds
4. Test also in real world projects, e.g. create a demo project, build a snapshot release ("mvn install") and use the snapshot build in it.

$h2 Creating releases

1. Push your changes to e.g. Github 
2. Update pom.xml to contain proper SCM coordinates (first time only)
3. Use Maven release plugin (mvn release:prepare; mvn release:perform)
4. Upload the ZIP file generated to target/checkout/target directory to https://vaadin.com/directory service (and/or optionally publish your add-on to Maven central)

