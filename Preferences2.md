The preferences page supplies 4 main categories:


<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images2/18_preferences.png' /></p>

## Gps Preferences ##

In the gps preferences it is possible to
  * define the time interval for taking a point when in logging mode
  * define the minimum distance in meters, within the taken gps point is not added to the gps log. This is useful for example in the case in which the user stops during logging and the gps continues to supply points (due to the inaccuracy), while instead the user stands still in a point.

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images2/19_preferences_gps.png' /></p>

## Sms Preferences ##

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images2/20_preferences_sms.png' /></p>

It is possible to activate an SMS catcher. If that is activated, the phone listens to incoming short messages containing the word:
```
GEOPAP
```
If such a message comes in, the phone answers with an SMS to the incoming number by sending the last known position.

From here it is also possible to insert the panic numbers(s), i.e. the numbers to which a status update is sent when the panic button is tabbed.

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images2/21_preferences_panicnum.png' /></p>

## Rendering Preferences ##

The rendering preferences give the possibility to define a decimation factor for loaded vector data.

## Labels Preferences ##

The labels preferences give a small aid to tweak point labels on the screen, to make them more readable. Geopaparazzi has no collision check for labels.
All it offers is the possibility to define 4 values:
  * Zoom level 1: the zoom level at which the labels start to be displayed
  * Labels length for level 1: how many characters of the label should be visualized once the level is greater than Zoom leve 1
  * Zoom level 2: this level gives a second level of zoom to set, in order to define the label length
  * Labels length for level 2: same as for 1

Adding a level of -1, will show the whole label.


## Debug Preferences ##

The debug prefernces menu is not so important if everything works well. If instead geopaparazzi on your phone has issues, it gets important:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images2/22_preferences_debug.png' /></p>

If enabled, geopaparazzi will log errors and runtime informations into the file:

```
sdcard/geopaparazzi/debug.log
```

Sending me this file will greatly help to solve the problems you have. It is up to you whether you want to make use of this function or not.