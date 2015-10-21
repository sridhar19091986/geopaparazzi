# The secret view #

If from the dashboard you push many times the back button, at some
point the secret view will appear to you.

It is intended to collect some small tools that are meant to more advanced
users, who also would like to help the developers of the project.

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/53_secret_view.png' /></p>

## Database queries ##

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/54_query_view.png' /></p>

From here you can check the content of some of the tables of geopaparazzi.

You can do that with some basic precompiled queries by using the combobox.

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/55_query_view_result.png' /></p>

Otherwise, if you need some more advanced mode, you can use the query textfield:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/56_query_view_custom.png' /></p>

and gain some more finegrained results:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/57_query_view_custom_result.png' /></p>

## Demo mode ##

If enabled, a demo gps mode is used which can be used indoor to give demos.

## Logging ##

A couple of logging modes are available to help track bugs. If those are enabled,
a log is written into the database. The database can then be sent to the developers in order
to help understand problems.

This should not be kept on in production, since it affects performance.

One can also clear the log table in the database to keep a certain situation's log short.

