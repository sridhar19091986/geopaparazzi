This page will be filled as soon as we will find a server that will host the web project browsing application.

Until that point this will stay a **work in progress**.

[A description of how that looks like can be found here.](http://jgrasstechtips.blogspot.it/2012/03/geopap-browser-si-on-its-way.html)

# POST and GET specs #

The geopapcloud idea is to make it very simple to upload and download projects from the web. So the specs are really thin.

## Upload ##

One can set in **Geopap-Cloud Preferences** a server to which to connect to.

To this server url the relative path **upload** is attached and the compressed (zipped) project is sent to that url via a http POST.

So if your server url is http://mydomain.com, the url for the POST of the zipped project file is: http://mydomain.com/upload

## Download the list of projects ##

To get the list of projects from a server, Geopaparazzi makes a GET request to http://mydomain.com/download.

The server should return a json of the type:

```
[
    {
        "status": "1",
        "error": {
            "errcode": "0",
            "errortype": "http... sys...",
            "errmsg": "",
            "errdata": []
        }
    },
    {
        "projects": [
            {
                "id": "1",
                "title": "progetto 1",
                "date": "2012-02-12 00:00",
                "author": "Andrea",
                "name": "geopaparazzi_2011_01",
                "size": "12384"
            },
            {
                "id": "2",
                "title": "progetto val di qua",
                "date": "2012-01-12 00:00",
                "author": "Luca",
                "name": "geopaparazzi_test",
                "size": "3456"
            },
            {
                "id": "4",
                "title": "progetto val di la",
                "date": "2012-03-12 00:00",
                "author": "Silvia",
                "name": "geopaparazzi",
                "size": "8764"
            }
        ]
    }
]
```

Geopaparazzi will then present the content as a list of available projects to download.

## Download a project ##

To download a project from the ones picked from the list, a GET request for a zipped files it made to the url: http://mydomain.com/download/id
where **id** is the id of the project contained in the json of the list of projects.

The file is then unzipped and loaded into Geopaparazzi as project.






