# Gps data list #

The gps data list shows the data surveyed, both points and tracks.

The notes are all kept inside a single layer and therefore have an own panel in the upper part. From there you can change visibility, size and color.

Below the notes panel, there is the list of recorded tracks.

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/24_gpsdata_list.png' /></p>

## Image notes ##

Image notes can be toggled between visible and non visible.

## Notes ##

Notes can be visualized as icons or as shapes. The size, color and opacity can be customized by
the user. This can be usefull in those cases in which many notes have to coexist in a small space
for better readability.

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/25a_notes_properties.png' /></p>

It is also possible to show the label for the note and customize its size and halo.

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/25b_notes_properties.png' /></p>

### Complex notes labels ###

In the case of complex notes notes the labelling is a bit tricky, because any of the
textfields inside the forms could be a label.

For that reason it is necessary to add a particular tag to the field that is meant
to be the label: **islabel**.

Once that tag is added, the marked textfield will be used as a label. Checkout the
[add note by tag](AddNoteByTag3.md) section to understan complex forms.

An here is how it all loks like with customized notes and labels:

  * simple notes show the complete text
  * complex form notes show the label of the marked textfield
  * the icons are now small blue circles

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/25c_notes_properties.png' /></p>

## Tracks ##

It is possible to change the visibility of the single track from here, but also enter (by tapping on it) a properties panel.

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/25_gpsdata_properties.png' /></p>

From here it is possible to:
  * change the name of the track
  * change track width
  * change track color
  * chart the track
  * zoom to the first point of the log in the map view
  * remove the track