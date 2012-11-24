/*
 * Geopaparazzi - Digital field mapping on Android based devices
 * Copyright (C) 2010  HydroloGIS (www.hydrologis.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package eu.geopaparazzi.library.database.spatial.activities;

import jsqlite.Exception;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import eu.geopaparazzi.library.R;
import eu.geopaparazzi.library.database.spatial.SpatialDatabasesManager;
import eu.geopaparazzi.library.database.spatial.core.SpatialTable;
import eu.geopaparazzi.library.util.LibraryConstants;

/**
 * Polygon Data properties activity.
 * 
 * @author Andrea Antonello (www.hydrologis.com)
 */
public class PolygonsDataPropertiesActivity extends Activity {
    private SpatialTable spatialTable;
    private Spinner colorSpinner;
    private Spinner widthSpinner;
    private Spinner alphaSpinner;
    private Spinner fillColorSpinner;
    private Spinner fillAlphaSpinner;
    private EditText decimationText;

    public void onCreate( Bundle icicle ) {
        super.onCreate(icicle);

        setContentView(R.layout.data_polygon_properties);

        Bundle extras = getIntent().getExtras();
        String tableName = extras.getString(LibraryConstants.PREFS_KEY_TEXT);
        try {
            spatialTable = SpatialDatabasesManager.getInstance().getTableByName(tableName);
        } catch (Exception e) {
            e.printStackTrace();
        }

        colorSpinner = (Spinner) findViewById(R.id.color_spinner);
        String strokecolor = spatialTable.style.strokecolor;
        int count = colorSpinner.getCount();
        for( int i = 0; i < count; i++ ) {
            if (colorSpinner.getItemAtPosition(i).equals(strokecolor)) {
                colorSpinner.setSelection(i);
                break;
            }
        }
        String width = String.valueOf((int) spatialTable.style.width);
        widthSpinner = (Spinner) findViewById(R.id.width_spinner);
        count = widthSpinner.getCount();
        for( int i = 0; i < count; i++ ) {
            if (widthSpinner.getItemAtPosition(i).equals(width)) {
                widthSpinner.setSelection(i);
                break;
            }
        }
        String alpha = String.valueOf((int) (spatialTable.style.strokealpha * 100f));
        alphaSpinner = (Spinner) findViewById(R.id.alpha_spinner);
        count = alphaSpinner.getCount();
        for( int i = 0; i < count; i++ ) {
            if (alphaSpinner.getItemAtPosition(i).equals(alpha)) {
                alphaSpinner.setSelection(i);
                break;
            }
        }

        fillColorSpinner = (Spinner) findViewById(R.id.fill_color_spinner);
        String fillcolor = spatialTable.style.fillcolor;
        count = fillColorSpinner.getCount();
        for( int i = 0; i < count; i++ ) {
            if (fillColorSpinner.getItemAtPosition(i).equals(fillcolor)) {
                fillColorSpinner.setSelection(i);
                break;
            }
        }

        String fillAlpha = String.valueOf((int) (spatialTable.style.fillalpha * 100f));
        fillAlphaSpinner = (Spinner) findViewById(R.id.fill_alpha_spinner);
        count = fillAlphaSpinner.getCount();
        for( int i = 0; i < count; i++ ) {
            if (fillAlphaSpinner.getItemAtPosition(i).equals(fillAlpha)) {
                fillAlphaSpinner.setSelection(i);
                break;
            }
        }

        String decimation = String.valueOf(spatialTable.style.decimationFactor);
        decimationText = (EditText) findViewById(R.id.decimation_text);
        decimationText.setText(decimation);
    }

    public void onOkClick( View view ) {

        String color = (String) colorSpinner.getSelectedItem();
        spatialTable.style.strokecolor = color;

        String widthString = (String) widthSpinner.getSelectedItem();
        float width = Float.parseFloat(widthString);
        spatialTable.style.width = width;

        String alphaString = (String) alphaSpinner.getSelectedItem();
        float alpha100 = Float.parseFloat(alphaString);
        spatialTable.style.strokealpha = alpha100 / 100f;

        String fillcolor = (String) fillColorSpinner.getSelectedItem();
        spatialTable.style.fillcolor = fillcolor;

        String fillAlphaString = (String) fillAlphaSpinner.getSelectedItem();
        float fillAlpha100 = Float.parseFloat(fillAlphaString);
        spatialTable.style.fillalpha = fillAlpha100 / 100f;

        String decimationString = decimationText.getText().toString();
        float decimation = 0.0f;
        try {
            decimation = Float.parseFloat(decimationString);
        } catch (java.lang.Exception e) {
        }
        spatialTable.style.decimationFactor = decimation;

        try {
            SpatialDatabasesManager.getInstance().updateStyle(spatialTable);
            finish();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onCancelClick( View view ) {
        finish();
    }

}
