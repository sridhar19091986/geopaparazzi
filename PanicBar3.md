The panic functions are some kind of safety utilities. Geopaparazzi is meant to be a fast surveying tool, usable also in rough mountain conditions. We like to thnk that it is easy to send a help message (containing the current position) to someone to come fast and rescue us in case of some problem.

Asking for help should be as fast as possible, i.e. one button tab away. But it should also make sure that help requests are not sent accidentally. So we decided for 2 buttons tab away.

**First tab: slide up the panic bar at the bottom of the [dashboard](DashBoard3.md).**

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/16_panic_bar.png' /></p>

You will find two buttons, the red panic button and below it, the status update button. This choice has been made, since some really like the possibility to send out to friends their own position and were constantly using the panic button for that. Following the [cry wolf](http://en.wikipedia.org/wiki/The_Boy_Who_Cried_Wolf) effect, this defeated the sense of having a panic button. So we added a status update button, that has the same purpose, but containing a different message.

**Second tab: push the red button!**

To properly work, a panic number (to which the sms is sent) has to be defined in the preferences (or more than one). If none is defined, you will be warned:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/16_panic_number_prompt.png' /></p>