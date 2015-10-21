

Map tiles to be used in geopaparazzi can be created in several ways. Most people are used to the [gdal](http://www.gdal.org/) projects, some use the [jgrasstools](http://www.jgrasstools.org/) project and others maybe other tools.

# Generate tiles #

## JGrasstools ##

We prefer to use the [jgrasstools](http://www.jgrasstools.org/) modules to prepare tilesets, since that one also generates the geopaparazzi and [uDig](http://udig.refractions.net/users/) **`*`.mapurl** definition file.


### Directly from uDig ###

This will be updated when a uDig version with these functionalities will be released.

### The manual way ###

There is a script available for jgrasstools, that can generate tiles for geopaparazzi, starting from bundled tiffs, grass rasters and shapefiles.

Download [jgrasstools version](http://jgrasstools.googlecode.com/files/jgrasstools-0.7.6-SNAPSHOT_2012-05-29.zip) or a more recent one, uncompress it somewhere and open the README file. It will explain how to run a script.

Then copy [this script](http://code.google.com/p/jgrasstools/wiki/scripts_tmsgenerator) into a text file and change the input parameters to reflect your case.

If you have any problem please ask in the geopaparazzi (or even better in the [jgrasstools](http://groups.google.com/group/jgrasstools)) mailinglist.

## GDAL ##

### Prerequisites ###
Geopaparazzi does not support reprojecting raster data sources on-the-fly, so the file must be warped to the proper projection before using it. To do it you can use [gdalwarp](http://www.gdal.org/gdalwarp.html) command.

The target projection must be Google Web Mercator (EPSG code 3857); you must know also the source projection of the raster you are converting. As an example, if you have a WGS 84 projected (EPSG code 4326) input file, you will run this kind of command:

`gdalwarp -s_srs EPSG:4326 -t_srs EPSG:3857 -r bilinear input.tif output.tif`

### Tiles creation ###
To create the tiles you can use [gdal2tiles.py](http://www.gdal.org/gdal2tiles.html) script, using as input your Google Web Mercator projected raster file:

`gdal2tiles.py output.tif`

It generates directory with TMS tiles, that you can use in Geopaparazzi. In the root of the this directory you will find "tilemapresource.xml" file; it contains all the informations (see below) to build the [.mapurl file](http://code.google.com/p/geopaparazzi/wiki/TileSources3#Custom_tiles_based_maps_%28local_and_remote%29) requested from Geopaparazzi.

```
<?xml version="1.0" encoding="utf-8"?>
	<TileMap version="1.0.0" tilemapservice="http://tms.osgeo.org/1.0.0">
	  <Title>temp3.vrt</Title>
	  <Abstract></Abstract>
	  <SRS>EPSG:900913</SRS>
	  <BoundingBox minx="46.39742402665929" miny="11.28858223249814" maxx="46.45081836101696" maxy="11.37616698902041"/>
	  <Origin x="46.39742402665929" y="11.28858223249814"/>
	  <TileFormat width="256" height="256" mime-type="image/png" extension="png"/>
	  <TileSets profile="mercator">
	    <TileSet href="12" units-per-pixel="38.21851413574219" order="12"/>
	    <TileSet href="13" units-per-pixel="19.10925706787109" order="13"/>
	    <TileSet href="14" units-per-pixel="9.55462853393555" order="14"/>
	    <TileSet href="15" units-per-pixel="4.77731426696777" order="15"/>
	    <TileSet href="16" units-per-pixel="2.38865713348389" order="16"/>
	    <TileSet href="17" units-per-pixel="1.19432856674194" order="17"/>
	    <TileSet href="18" units-per-pixel="0.59716428337097" order="18"/>
	  </TileSets>
	</TileMap>
```

# Example tilesets loaded #

Ortophoto:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/49_ortophoto.png' alt='img' /></p>

Technical basemap with shapefiles overlay:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/50_ctp.png' alt='img' /></p>

Technical basemap with isolines overlay:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/51_isolines.png' alt='img' /></p>

Historical maps:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/52_historic.png' alt='img' /></p>