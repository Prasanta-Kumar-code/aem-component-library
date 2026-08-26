package com.prasanta.aemcomponentlibrary.core.models.impl;

import javax.inject.Inject;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;

import com.prasanta.aemcomponentlibrary.core.models.CustomTitle;

@Model(
        adaptables = Resource.class,
        adapters = CustomTitle.class
)
public class CustomTitleImpl implements CustomTitle {

    @Inject
    private String backgroundColor;

    @Override
    public String getBackgroundColor() {
        return backgroundColor;
    }
}