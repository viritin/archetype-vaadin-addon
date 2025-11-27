# archetype-vaadin-addon

A project template for Vaadin add-ons that...

 * Makes it easy to create a module for an add-on (UI tests in same module as the actual add-on). As this is archetype, you can directly add it to your multimodule project. Good basis for re-usable component, even if not planning to publish it as OSS (and/or to vaadin.com/directory).
 * Simple Spring Boot based test UI setup (note **no** transitive dependency introduced to Spring Boot for actual add-on, just convenience for testing/development way better than with e.g. jetty plugin)
 * emphasis testing: supports multiple UI tests with a searchable listing, setup for automated browser level testing
 * Contains simple setup for Playwright based E2E tests

## Using the archetype

    mvn org.apache.maven.plugins:maven-archetype-plugin:generate  \
        -DarchetypeGroupId=in.virit  \
        -DarchetypeArtifactId=archetype-vaadin-addon  \
        -DarchetypeVersion=3.0.0

Maven will then prompt for group and archetype id for your project. If you are unsure what to give, use org.vaadin.addons for groupId and something derived from your add-on name, like *my-awesome-addon*.

Then see the README.md from the generated project for more instructions. 

The archetype is quite new, so there is sure some rough edges left. Don't hesitate to report issues!

