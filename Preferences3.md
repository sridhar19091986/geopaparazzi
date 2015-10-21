The preferences page supplies some main categories:


<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/18_preferences.png' /></p>

## Gps Preferences ##

In the gps preferences it is possible to
  * define the time interval for taking a point when in logging mode
  * define the minimum distance in meters, within the taken gps point is not added to the gps log. This is useful for example in the case in which the user stops during logging and the gps continues to supply points (due to the inaccuracy), while instead the user stands still in a point.
  * have the mapview recentered on the gps position when the position reaces the screen border (usefull while driving)
  * use network based position instead of GPS position. This can be sueful for testing purposes. The network based position is by no means precise!

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/19_preferences_gps.png' /></p>

## Sms Preferences ##

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/20_preferences_sms.png' /></p>

It is possible to activate an SMS catcher. If that is activated, the phone listens to incoming short messages containing the word:
```
GEOPAP
```
If such a message comes in, the phone answers with an SMS to the incoming number by sending the last known position.

From here it is also possible to insert the panic numbers(s), i.e. the numbers to which a status update is sent when the panic button is tabbed.

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/21_preferences_panicnum.png' /></p>

## Screen Preferences ##

In the screen preferences it is possible to
  * change the map center cross properties (size, color, stroke width)
  * change the OSM map text size factor (normal is 1. To make text bigger, increase the value)
  * enable the always screen on mode

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/22_preferences_screen.png' /></p>

## Custom sdcard path ##

This can be used for those devices that have more than one external storage recognized by the device.
Use it at your own risk. We use it regularly, but it needs to be done properly.

## OSM Preferences ##

To be able to use the OpenStreetMap tools you need to enable them in this settings page.

To upload collected data, a server and OSM account has to be specified. A default server to process the collected data to OSM has been kindly made available by [Luca Delucchi](http://gis.cri.fmach.it/delucchi/) and will be precompiled. If you do not know what to insert, leave the existing one.

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/22_preferences_osm.png' /></p>

A tutorial on how to use OSM tools in geopaparazzi can be found [here](OsmTools3.md).

## Geopap-cloud Preferences ##

To use the cloud service, a server and account need to be specified.

A tutorial on how to connect and interact with the geopap-cloud service can be found [here](GeopapCloud3.md).

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/22_preferences_cloud.png' /></p>
