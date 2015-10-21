

From the [main menu](MainMenu3.md), when pushing the tile source button, the list of available tile sources are presented:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/44_tiles_source_menu.png' /></p>

From all shown, the first 3 are available as default, while all others are user added and can be local or remote tile services.

## Where are tile source definitions hold ##

All definitions, being it datbases, TMS or any kind of urls, they fin their place in the **folder named "maps" in the root of the sdcard**. We will refer to it on this page as **maps** folder.

## Default base maps (remote) ##

The MAPNIK and OPENCYCLEMAP maps are probably the most famous Openstreetmaps representation and are accessed online. As such they need an active internet connection. The visualized tiles are downloaded and cached on the phone for offline use.

## Vector maps ##

The first one, DATABASE\_RENDERES, leads to a submenu, which is dedicated to local vector maps:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/45_tiles_source_vectors.png' /></p>

To have maps showing up in this submenu you will need to [download some vector maps](VectorMaps3.md).

Once the `*`.map file has been downloaded, it just needs to be placed in the **maps** folder and it will then automatically appear in the available vector maps list.


## Custom tiles based maps (local and remote) ##

Custom tile sources appear in the main sources list if a definition of the source is found in the **maps** folder.

Tile Sources definitions are simple text files that need to have the extention **.mapurl** to be recognised by geopaparazzi.

Let's see two different tile source definitions, one bound to a remote service and one bound to a local.

### Remote Tile sources ###

An example for a remote tiles source is:

```
url=http://myserver/tmsservice/ZZZ/XXX/YYY.png
minzoom=12
maxzoom=18
center=11.40553 46.39478
type=tms
```

The necessary information is:

  * the url of the tile server, having:
    * **ZZZ** instead of the zoom level
    * **XXX** instead of the tile column number
    * **YYY** instead of the tile row number
> > One good example to understand what that means it once again Openstreetmap, where
```
    http://a.tile.openstreetmap.org/9/271/182.png
```
> > has ZZZ=9, XXX=271 and YYY=182.
  * the minimum zoom level that is supported
  * the maximum zoom level that is supported
  * the center of the tile source
  * the type fo tile server. Currently both [standard TMS](http://en.wikipedia.org/wiki/Tile_Map_Service) and google based numbering of the tiles is supported by the line:
    * type=tms
    * type=google

Also WMS works as remote source, as long as it can be accessed through an EPSG:4326 projection. An example is:

```
url=http://sdi.provincia.bz.it/geoserver/wms?LAYERS=inspire:OI.ORTHOIMAGECOVERAGE.2011&TRANSPARENT=true&FORMAT=image/png&SERVICE=WMS&VERSION=1.1.1&REQUEST=GetMap&STYLES=&EXCEPTIONS=application/vnd.ogc.se_inimage&SRS=EPSG:4326&BBOX=XXX,YYY,XXX,YYY&WIDTH=256&HEIGHT=256
minzoom=0
maxzoom=20
center=11.42 46.8
type=wms
```

Important here are:
  * SRS=EPSG:4326
  * BBOX=XXX,YYY,XXX,YYY



### Local Tile sources ###

Local tile sources are the most useful ones, since they can be used offline. Through those it is possible to load on any smarthphone complex maps as for example the following map that has a technical basemap with shapefiles overlayed in transparency:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/46_tiles_source_ctp.png' /></p>

To be able to load such maps, one needs to prepare the tiles properly. This can be done via in several ways as explained [here](Tiles4Geopaparazzi3.md).

The tile folder have then to be loaded in the **maps** folder together with the description of the tile source:

```
url=mytilesfolder/ZZZ/XXX/YYY.png
minzoom=12
maxzoom=18
center=11.40553 46.39478
type=tms
```

Nothing changes against the description for the remote source apart of the url. The url in this case represents the relative path of the tiles folder starting from the **"maps"** folder.
