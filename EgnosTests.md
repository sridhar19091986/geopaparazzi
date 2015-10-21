# Introduction #

A couple of months ago I signed up for voluntairing on the testing of the [Egnos toolkit](http://egnos-portal.gsa.europa.eu/) that will be released for java developers at some point.


The hardware I got to test on was:

  * uBox EVK-6T GPS
  * Google Nexus S

Obviously my objective was to test the sdk integrated into Geopaparazzi in order to see what the improvements could be.

Since the internal GPS of the phone doesn't support Egnos correction, we had to attach an external GPS device (the uBox) to the Phone and "force" Geopaparazzi to use that one.

The hardware used can't be really defined as "easy to carry", but well, it was just a test:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/hg/egnos/devices.jpg' alt='devices' /></p>


# Integrating the EGNOS sdk #

The sdk comes with a very simple GPS access api and also provides a bluetooth connection activity. For the testing purposes it has therefore been quite easy to plug the Egnos GPS position provider into the Mock Location provider that we use for indoor testing.

To work on this a clone has been created, in which the code has been made available: http://code.google.com/r/andreaantonello-egnostests/

# Geopaparazzi on steroids #

Once Geopaparazzi was modified to work with the Egnos sdk, it presented a new action to connect to the uBox via bluetooth:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/hg/egnos/01_main_menu_attach_egnos.png' alt='bluetooth' /></p>

Once the GPS unit is available:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/hg/egnos/02_connecting.png' alt='connecting' /></p>

it can be selected and attach to it:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/hg/egnos/03_connected.png' alt='connection' /></p>

We changed the Geopaparazzi rendering part to show both the GPS and the EGNOS/SISNet signals at the same time to get an idea about the correction occurring:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/hg/egnos/04_egnos_correction.png' alt='correction' /></p>


# Testing the application #

We also tested the application out in the field but I have to admit we didn't have very good results with it. Sure, the testing timeframe was a bit short, but mostly we had problems with data oscillations from the GPS. The signal had difficulties to retrieve the EGNOS data even if we had clear sky and open space. Also enabling SISNet data correction retrival with internet connection (UMTS) that didn't change a lot.

In those moments in which we had Egnos correction, the GPS signal seemed to be more precise on the Openstreetmap background maps than the Egnos one.

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/hg/egnos/nexus.jpg' alt='nexus' /></p>

# Consclusions #

All in all the testing has been ok. As a developer, the most important part is the ease of use of the development kit, and that one is really good. To then test new hardware you need more time, you need to know the hardware a bit and how it reacts to the different environments.







