The add note by tag function is an enhanced version of the add note function.

It is possible to create a ` tags.json` file inside the geopaparazzi folder inside the sdcard containing a [json format](http://en.wikipedia.org/wiki/JSON) description of the wanted tags and forms.

By default, to help the user to start, a sample tags.json is created that contains the following:

```
[
    {
        "shortname": "bank",
        "longname": "bank",
        "form": {
            "formitems": [
                {
                    "key": "bank name",
                    "value": "",
                    "type": "string"
                },
                {
                    "key": "has atm",
                    "value": "false",
                    "type": "boolean"
                },
                {
                    "key": "employees",
                    "value": "10",
                    "type": "double"
                },
                {
                    "key": "typecode",
                    "values": {
                        "items": [
                            {
                                "item": "101" 
                            },
                            {
                                "item": "102" 
                            },
                            {
                                "item": "103" 
                            } 
                        ] 
                    } ,
                    "value": "102",
                    "type": "doublecombo"
                } 
            ] 
        }
    },
    {
        "shortname": "church",
        "longname": "place of worship",
        "form": {
            "formitems": [
                {
                    "key": "church name",
                    "value": "",
                    "type": "string"
                },
                {
                    "key": "building year",
                    "value": "",
                    "type": "string"
                },
                {
                    "key": "religion type",
                    "values": {
                        "items": [
                            {
                                "item": "Christianity" 
                            },
                            {
                                "item": "Islam" 
                            },
                            {
                                "item": "Rastafari" 
                            },
                            {
                                "item": "Buddhism" 
                            },
                            {
                                "item": "Atheism" 
                            },
                            {
                                "item": "Hinduism" 
                            } 
                        ] 
                    } ,
                    "value": "Atheism",
                    "type": "stringcombo"
                } 
            ] 
        }
    },
    {
        "shortname": "POI",
        "longname": "POI"
    }
]
```

which results in an _add note by tag_ gui like the following:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images2/30_add_note_bytag.png' /></p>

If the selected item doesn't have a **form** item, as for example the _POI_, it will behave as always. But if a **form** item is present, it will take you to the generated form, in which you can fill in whatever you wanted to, as for example in the case of the **bank** item above.

You can insert some additional info to the title,

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images2/31_tag_bank.png' /></p>

and then, when pushing bank, you are taken to the form generated for that item:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images2/32_form_bank.png' /></p>


At first it is not all that easy to create valid json forms. The main block has to be an array (for every entry in the gui) and that array has to contain at least:
```
        "shortname": "your short name",
        "longname": "your long name"
```

A good online tool to validate your json form is [the Json Lint validator](http://www.jsonlint.com/). Make sure it passes that test before trying on geopaparazzi.