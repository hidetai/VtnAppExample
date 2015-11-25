Example of OpenDaylight VTN Manager application
===============================================

This is an example application that uses APIs provided by VTN Manager.
The VTN Manager is a network virtualization feature which is being developed by OpenDaylight VTN project.

 * [OpenDaylight project](https://opendaylight.org/)
 * [VTN project in OpenDaylight](https://wiki.opendaylight.org/view/VTN)

The example code depends on VTN Manager of Beryllium release (OpenDaylight 4th release.)

Hot to build
------------

    mvn clean install -DskipTests

It requires the following set up in your environment:

 * Maven 3.1.1 or later
 * Java 7- or 8-compliant JDK
 * An appropriate Maven `settings.xml` file
   * For detailed information, see [the OpenDaylight wiki page](https://wiki.opendaylight.org/view/GettingStarted:Development_Environment_Setup#Edit_your_.7E.2F.m2.2Fsettings.xml).

How to run
----------

    cd karaf/target/assembly/
    ./bin/karaf

After executing the `./bin/karaf`, the Karaf console shows up.
You can check the application's log messages by executing the following command in the Karaf console.

    log:display | grep VTN
