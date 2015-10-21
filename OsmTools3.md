Geopaparazzi is able to create and upload to an OSM account collected points of interest.

The first step to follow is to activate the OSM support in the [preferences](http://code.google.com/p/geopaparazzi/wiki/Preferences3#OSM_Preferences).

Once done, next time geopaparazzi is restarted, the user will be asked if he wants to download the OSM tags definitions. These is actually the library of simbols and tags descriptions for the different OSM point types.

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/39_osm_tagsdownload.png' /></p>

From that point on in the map view you will see a small OSM icon that can be dragged to the left and shows all available OSM categories:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/40_osm_categories.png' /></p>

Once a category is selected, the tags of the category are shown:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/41_osm_accomodation.png' /></p>

The selection of a specific tag then finally opens the form with the properties to be defined by the user:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/42_osm_motel.png' /></p>

Once populated the form, it is possible to syncronize the collected POIs with an online OSM account. The user will be prompted to insert a description for the changeset he is uploading:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/43_osm_sync.png' /></p>

If user and password were properly supplied, geopaparazzi will connect to a WPS server that will take care of interacting with teh OSM servers and do everything necessary to upload the data. Kudos go to [Luca Delucchi](http://gis.cri.fmach.it/delucchi/), which has been of stretegic help in understanding what was necessary to make this work. He also is the author and host of the WPS service and the iconset and tags definitions.