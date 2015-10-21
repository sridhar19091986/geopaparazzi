

## Tags and forms in geopaparazzi ##

The add note by tag function is an enhanced version of the add note function.

It is possible to create a ` tags.json` file inside the geopaparazzi folder inside the sdcard containing a [json format](http://en.wikipedia.org/wiki/JSON) description of the wanted tags and forms.

By default, to help the user to start, a sample tags.json is created that contains the following:

```
[
    {
        "sectionname": "image note",
        "sectiondescription": "note with image",
        "forms": [
            {
                "formname": "text note",
                "formitems": [
                    {
                        "key": "title",
                        "value": "",
                        "type": "string",
                        "mandatory": "yes"
                    },
                    {
                        "key": "description",
                        "value": "",
                        "type": "string",
                        "mandatory": "yes"
                    }
                ]
            },
            {
                "formname": "image note",
                "formitems": [
					{
                        "key": "description",
                        "value": "",
                        "type": "string",
                        "mandatory": "yes"
                    },
                    {
						"key": "pictures of the environment around the note",
                        "value": "",
                        "type": "pictures"
					}
				]
            }
        ]
    },{
        "sectionname": "map note",
        "sectiondescription": "note with map image",
        "forms": [
            {
                "formname": "text note",
                "formitems": [
                    {
                        "key": "title",
                        "value": "",
                        "type": "string",
                        "mandatory": "yes"
                    },
                    {
                        "key": "description",
                        "value": "",
                        "type": "string",
                        "mandatory": "yes"
                    }
                ]
            },
            {
                "formname": "map image note",
                "formitems": [
					{
                        "key": "description",
                        "value": "",
                        "type": "string",
                        "mandatory": "yes"
                    },
                    {
						"key": "map around note",
                        "value": "",
                        "type": "map"
					}
				]
            }
        ]
	},{
        "sectionname": "text note",
        "sectiondescription": "a simple text note",
        "forms": [
            {
                "formname": "text note",
                "formitems": [
                    {
                        "key": "title",
                        "value": "",
                        "type": "string",
                        "mandatory": "yes"
                    },
                    {
                        "key": "description",
                        "value": "",
                        "type": "string",
                        "mandatory": "yes"
                    }
                ]
            }
        ]
	},{
        "sectionname": "examples",
        "sectiondescription": "examples of supported form widgets",
        "forms": [
            {
                "formname": "text",
                "formitems": [
                    {
                        "key": "some text",
                        "value": "",
                        "type": "string"
                    }
                ]
            },{
                "formname": "numeric text",
                "formitems": [
                    {
                        "key": "a number",
                        "value": "",
                        "type": "double"
                    }
                ]
            },{
                "formname": "date",
                "formitems": [
                    {
                        "key": "a date",
                        "value": "",
                        "type": "date"
                    }
                ]
            },{
                "formname": "time",
                "formitems": [
                    {
                        "key": "a time",
                        "value": "",
                        "type": "time"
                    }
                ]
            },{
                "formname": "labels",
                "formitems": [
                    {
                        "value": "a simple label of size 20",
						"size": "20",
                        "type": "label"
                    },{
                        "value": "a underlined label of size 24",
                        "size": "24",
						"type": "labelwithline"
                    },{
                        "value": "a label with link to the geopaparazzi homepage",
                        "url": "http://www.geopaparazzi.eu",
                        "size": "20",
                        "type": "labelwithline"
                    }
                ]
            },{
                "formname": "boolean",
                "formitems": [
                    {
                        "key": "a boolean choice",
                        "value": "",
                        "type": "boolean"
                    }
                ]
            },{
                "formname": "combos",
                "formitems": [
                    {
                        "key": "a single choice combo",
                        "values": {
                            "items": [
                                {"item": ""},
                                {"item": "choice 1"},
                                {"item": "choice 2"},
                                {"item": "choice 3"},
                                {"item": "choice 4"},
                                {"item": "choice 5"}
                            ]
                        },
                        "value": "",
                        "type": "stringcombo"
                    },{
                        "key": "a multiple choice combo",
                        "values": {
                            "items": [
                                {"item": ""},
                                {"item": "choice 1"},
                                {"item": "choice 2"},
                                {"item": "choice 3"},
                                {"item": "choice 4"},
                                {"item": "choice 5"}
                            ]
                        },
                        "value": "",
                        "type": "multistringcombo"
                    }
                ]
            },{
                "formname": "pictures",
                "formitems": [
                    {
                        "key": "a picture archive",
                        "value": "",
                        "type": "pictures"
                    }
                ]
            },{
                "formname": "map",
                "formitems": [
                    {
                        "key": "an image of the last seen map",
                        "value": "",
                        "type": "map"
                    }
                ]
            }
        ]
	}
]
```

which results in an _add note by tag_ gui like the following:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/30_add_note_bytag.png' /></p>


We currently do not have a tool to create forms, it has to be done by hand. A good online tool to validate your json form is [the Json Lint validator](http://www.jsonlint.com/). Make sure it passes that test before trying on geopaparazzi.

## Supported tags (via the example form) ##

The example form that is available by default shows all the possible options available.

Once pushed, the list of available tabs is shown:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/30a_tags_list.png' /></p>

### Text ###

Looks like:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/30b_tags_text.png' /></p>

Created by:

```
            {
                "formname": "text",
                "formitems": [
                    {
                        "key": "some text",
                        "value": "",
                        "type": "string"
                    }
                ]
            }
```

### Numbers ###

Looks like:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/30c_tags_num.png' /></p>

Created by:

```
            {
                "formname": "numeric text",
                "formitems": [
                    {
                        "key": "a number",
                        "value": "",
                        "type": "double"
                    },{
                        "key": "an integer number",
                        "value": "",
                        "type": "integer"
                    }
                ]
            }
```

### Labels ###

Text and numbers can also be shown as labels in the map view.

To do so, the tag islabel has to be added and set to true:

```
            {
                "formname": "numeric text",
                "formitems": [
                    {
                        "key": "a number",
                        "value": "",
                        "islabel": "true", 
                        "type": "double"
                    }
                ]
            }
```

Only one text or number item is accepted as label, so if more than one is added, the last read will be picked.

### Date ###

Looks like:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/30d_tags_date.png' /></p>

Created by:

```
            {
                "formname": "date",
                "formitems": [
                    {
                        "key": "a date",
                        "value": "",
                        "type": "date"
                    }
                ]
            }
```

### Time ###

Looks like:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/30e_tags_time.png' /></p>

Created by:

```
            {
                "formname": "time",
                "formitems": [
                    {
                        "key": "a time",
                        "value": "",
                        "type": "time"
                    }
                ]
            }
```

### Labels ###

Looks like:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/30f_tags_labels.png' /></p>

Created by:

```
            {
                "formname": "labels",
                "formitems": [
                    {
                        "value": "a simple label of size 20",
						"size": "20",
                        "type": "label"
                    },{
                        "value": "a underlined label of size 24",
                        "size": "24",
						"type": "labelwithline"
                    },{
                        "value": "a label with link to the geopaparazzi homepage",
                        "url": "http://www.geopaparazzi.eu",
                        "size": "20",
                        "type": "labelwithline"
                    }
                ]
            }
```

### Checkbox ###

Looks like:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/30g_tags_boolean.png' /></p>

Created by:

```
            {
                "formname": "boolean",
                "formitems": [
                    {
                        "key": "a boolean choice",
                        "value": "",
                        "type": "boolean"
                    }
                ]
            }
```

### Combos ###

Looks like:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/30h_tags_combo.png' /></p>

Created by:

```
            {
                "formname": "combos",
                "formitems": [
                    {
                        "key": "a single choice combo",
                        "values": {
                            "items": [
                                {"item": ""},
                                {"item": "choice 1"},
                                {"item": "choice 2"},
                                {"item": "choice 3"},
                                {"item": "choice 4"},
                                {"item": "choice 5"}
                            ]
                        },
                        "value": "",
                        "type": "stringcombo"
                    },{
                        "key": "a multiple choice combo",
                        "values": {
                            "items": [
                                {"item": ""},
                                {"item": "choice 1"},
                                {"item": "choice 2"},
                                {"item": "choice 3"},
                                {"item": "choice 4"},
                                {"item": "choice 5"}
                            ]
                        },
                        "value": "",
                        "type": "multistringcombo"
                    },{
                        "key": "two connected combos",
                        "values": {
                            "items 1": [
                                {"item": ""},
                                {"item": "choice 1 of 1"},
                                {"item": "choice 2 of 1"},
                                {"item": "choice 3 of 1"},
                                {"item": "choice 4 of 1"},
                                {"item": "choice 5 of 1"}
                            ],
                            "items 2": [
                                {"item": ""},
                                {"item": "choice 1 of 2"},
                                {"item": "choice 2 of 2"},
                                {"item": "choice 3 of 2"},
                                {"item": "choice 4 of 2"},
                                {"item": "choice 5 of 2"}
                            ]
                        },
                        "value": "",
                        "type": "connectedstringcombo"
                    },{
                        "key": "two connected combos, default selected",
                        "values": {
                            "items 1": [
                                {"item": ""},
                                {"item": "choice 1 of 1"},
                                {"item": "choice 2 of 1"},
                                {"item": "choice 3 of 1"},
                                {"item": "choice 4 of 1"},
                                {"item": "choice 5 of 1"}
                            ],
                            "items 2": [
                                {"item": ""},
                                {"item": "choice 1 of 2"},
                                {"item": "choice 2 of 2"},
                                {"item": "choice 3 of 2"},
                                {"item": "choice 4 of 2"},
                                {"item": "choice 5 of 2"}
                            ]
                        },
                        "value": "choice 4 of 2",
                        "type": "connectedstringcombo"
                    }
                ]
            }
```

### Pictures ###

Looks like:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/30i_tags_pics.png' /></p>

Created by:

```
            {
                "formname": "pictures",
                "formitems": [
                    {
                        "key": "a picture archive",
                        "value": "",
                        "type": "pictures"
                    }
                ]
            }
```

### Map screenshot ###

Looks like:

<p align='center'><img src='http://wiki.geopaparazzi.googlecode.com/git/images3/30j_tags_map.png' /></p>

Created by:

```
            {
                "formname": "map",
                "formitems": [
                    {
                        "key": "an image of the last seen map",
                        "value": "",
                        "type": "map"
                    }
                ]
            }
```

## Other supported tags ##

### hidden (not shown in the gui, but useful for the application to fill in infos like the GPS position) ###

```
{"key":"LONGITUDE", "value":"", "type":"hidden"}
```

### primary\_key (an item of particular importance, can be used by the application to link to particular infos) ###

```
{"key":"tourism", "value":"", "type":"primary_key"}
```

## Constraints ##

Constraints are conditions that are checked when the ok button of the form is pushed.

### mandatory ###

To make an item mandatory, just add:
```
"mandatory": "yes"
```

### range ###

To peform a range check on a numeric field you can add something like:
```
"range":"[0,10)"
```
which would check that the inserted number is between 0 (inclusive) and 10 (exclusive).