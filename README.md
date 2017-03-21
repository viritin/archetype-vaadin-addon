# archetype-vaadin-addon

A project template for Vaadin add-ons that...

 * makes it easy to develop the add-on (UI tests in same module as the actual add-on)
 * makes OSGi compatible add-ons by default
 * emphasis testing: supports multiple UI tests with a searchable listing, setup for automated browser level testing
 * does *NOT* support GWT extensions, but only pure server side or JS extensions. For add-ons using GWT, try [archetype-vaadin-gwt-addon](https://github.com/viritin/archetype-vaadin-gwt-addon)

## Using the archetype

Only snapshots are so far released, but you can use them with following CLI command:

    mvn archetype:generate  \
        -DarchetypeGroupId=in.virit  \
        -DarchetypeArtifactId=archetype-vaadin-addon  \
        -DarchetypeRepository=https://oss.sonatype.org/content/repositories/snapshots/  \
        -DarchetypeVersion=2.0-SNAPSHOT

Then see the README.md from the generated project for more instructions. 

The archetype is quite new, so there is sure some rough edges left. Don't hesitate to report issues!

