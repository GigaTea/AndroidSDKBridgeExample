//  Created by react-native-create-bridge

package com.sdkimportdemo.polarsdk;

import android.view.View;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import com.polar.sdk.api.PolarBleApi;
import com.polar.sdk.api.PolarBleApi.DeviceStreamingFeature;
import com.polar.sdk.api.PolarBleApiCallback;
import com.polar.sdk.api.PolarBleApiDefaultImpl;
import com.polar.sdk.api.errors.PolarInvalidArgument;
import com.polar.sdk.api.model.*;

import com.facebook.react.uimanager.annotations.ReactProp;

public class PolarSDKManager extends SimpleViewManager<View> {
    public static final String REACT_CLASS = "PolarSDK";

    @Override
    public String getName() {
        // Tell React the name of the module
        // https://facebook.github.io/react-native/docs/native-components-android.html#1-create-the-viewmanager-subclass
        return REACT_CLASS;
    }

    @Override
    public View createViewInstance(ThemedReactContext context){
        // Create a view here
        // https://facebook.github.io/react-native/docs/native-components-android.html#2-implement-method-createviewinstance
        return new View(context);
    }

    @ReactProp(name = "exampleProp")
    public void setExampleProp(View view, String prop) {
        // Set properties from React onto your native component via a setter method
        // https://facebook.github.io/react-native/docs/native-components-android.html#3-expose-view-property-setters-using-reactprop-or-reactpropgroup-annotation
    }
}
