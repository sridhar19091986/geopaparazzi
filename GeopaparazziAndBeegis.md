

| **Since versione 1.3.2 the GIS uDig imports Geopaparazzi data directly as shapefiles and image references.**<br>This means that it is not necessary to install also the field mapping extensions to import Geopaparazzi data.<br> Have a look <a href='http://code.google.com/p/geopaparazzi/wiki/GeopaparazziAndUdig'>here</a>. </tbody></table>

# BeeGIS #

BeeGIS is an application developed to be used by geologists and engineers on outdoor surveys, but can serve other professionals in different works requiring a simple-yet-powerful software for registering geographical data on the field.

BeeGIS is able to read Geopaparazzi's survey data and import them as most used GIS formats.

The Geopaparazzi-BeeGIS link currently works on the new version of BeeGIS developed [here](http://code.google.com/p/beegis/).

# Importing procedure #

Make sure you have connected your android phone to the pc and mounted the internal sdcard as disk, so that it can be browsed with a system browser of the operating system.

To import Geopaparazzi data into BeeGIS you have to be able to see the disk of the smartphone and inside there the geopaparazzi folder. In linux this looks like:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images/beegis_geopaparazzi_import_0.png' alt='step 0' /></p>

Once you are aware of where the disk was mounted, from within BeeGIS open the import wizard. You will see the geopaparazzi import module:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images/beegis_geopaparazzi_import_1.png' alt='step 1' /></p>

The only input required are the path to the geopaparazzi folder on the phone and the folder into which to write the geopaparazzi data:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images/beegis_geopaparazzi_import_2.png' alt='step 2' /></p>

After pushing finish all the found data are imported into BeeGIS:
  * Notes are imported as a feature layer containing the text of the note as description, the timestamp of the note and the altimetry
  * The gps logs are imported twice
    * as line layer containing all the tracks with a description and the start/end timestamp
    * as point layer containing the timestamp and the altimetry
  * the pictures taken from within Geopaparazzi are imported as BeeGIS geonotes containing photos and showing an arrow with the orientation of the photoshoot

The result can look like the following:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images/beegis_geopaparazzi_import_3.png' alt='step 3' /></p>


# Yeah, and were do I get BeeGIS? #

On the BeeGIS website, of course. Follow the [install instructions here](http://code.google.com/p/beegis/wiki/How_to_install_development_snapshots).