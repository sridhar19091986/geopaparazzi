# Introduction #

As the [homepage states](https://www.gaia-gis.it/fossil/libspatialite/index): _SpatiaLite is an open source library intended to extend the SQLite core to support fully fledged Spatial SQL capabilities._

Geopaparazzi supports the visualization of geometries and attributes from vector data layers of Spatialite databases.

This is achieved through the [spatialite-android](https://www.gaia-gis.it/fossil/libspatialite/wiki?name=splite-android) project.

# Prepare your data #

Most users usually hold vector data in [shapefile format](http://en.wikipedia.org/wiki/Shapefile).

The best way to prepare a spatialite database from shapefiles is without any doubt the [spatialite gui](https://www.gaia-gis.it/fossil/spatialite_gui/index). A very simple guide about how to create spatialite databases from shapefiles [can be found here](http://www.gaia-gis.it/spatialite-3.0.0-BETA/spatialite-cookbook/html/impexp.html).

Important:

  * **Please remember to create spatial indexes when importing the shapfiles.**
  * The latest version of [spatialite-gui](https://www.gaia-gis.it/fossil/spatialite_gui/index) that is reported to work properly, is the **1.7**.


# Use your databases #

Once the database is ready to be used, simply upload it into the **/sdcard/maps** folder on your device. That is the same folder in which the openstreetmap vector maps reside.

**Make sure that your database files have the .sqlite extention. It is the marker used by Geopaparazzi to identify spatialite databases.**

Once the database is in place, open Geopaparazzi and enter the map view. A new **data** menu will be available:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/spatialite_01_datamenu.png' /></p>

From there you enter the spatialite layer panel:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/spatialite_02_layerview.png' /></p>

All the spatial tables contained in all the spatialite databases found in the maps folder are listed here.

From here you can

**change the style of the layer** change the layers order (the lowest in the panel is the last drawn on the map and therefore the one on the top)
**zoom to a particular layer**

The style editor is very simple and permits for a bunch of colors and line widths:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/spatialite_03_styleproperties.png' /></p>

Once the layers are enabled, they will be loaded in the map view:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/spatialite_04_mapview.png' /></p>